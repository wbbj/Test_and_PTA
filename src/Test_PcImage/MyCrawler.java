package Test_PcImage;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyCrawler extends Thread {
    //将图片对应的网页分为三部分，前、中、后 前面后面无需改变，我们只需要动态改变中间的数字，得到的就是对应的图片
    private String urlString = "http://desk.zol.com.cn/showpic/1920x1080_";
    //中间的数字
    private int number;
    //正则表达式
    private static final String imgReg = "<i.*?>";
    //构造函数，传入中间的数字
    MyCrawler(int i) {
        this.number=i;
        String str = "_10.html";
        this.urlString = urlString + i + str;
    }

    @Override
    public void run() {
        try {
            //下载图片
            getImg(getImgUrl(urlString));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getImgUrl(String u) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(u);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (iPad; CPU OS 11_0 like Mac OS X) AppleWebKit/604.1.34 " +
                "(KHTML, like Gecko) Version/11.0 Mobile/15A5341f Safari/604.1");
        InputStream in = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in,"gb2312"));
        String string = "";
        while (null != (string = reader.readLine())) {
            sb.append(string);
        }
        string = sb.toString();
        //从获取的源码中截取图片的URL
        Matcher matcher = Pattern.compile(imgReg).matcher(string);
        if (matcher.find()) {
            string = matcher.group();
            string = string.substring(10, string.length() - 2);
        }
        in.close();
        return string;
    }
    //下载图片的方法
    private void getImg(String imgUrl) throws IOException {
        URL url = new URL(imgUrl);
        InputStream in = url.openStream();
        FileOutputStream fo = new FileOutputStream(new File("/image/" + this.number+".jpg"));
        byte[] by = new byte[1024];
        int length = 0;
        System.out.println("开始下载:" +this.number);
        while ((length = in.read(by, 0, by.length)) != -1) {
            fo.write(by, 0, length);
        }
        in.close();
        fo.close();
    }
}