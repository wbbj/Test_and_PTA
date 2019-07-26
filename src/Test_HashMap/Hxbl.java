package Test_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hxbl {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");

        //第一种遍历foreach二次取值通过Map.keySet遍历key和value
        for(String key:map.keySet()){
            System.out.println("key:"+key+"value:"+map.get(key));
        }

        //第二种遍历通过Map.entrySet使用iterator遍历key和vlue
        Iterator map1=map.entrySet().iterator();
        while (map1.hasNext()){
            Map.Entry<String,String> entry=(Map.Entry<String,String>)map1.next();
            System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
        }
        //第三种遍历通过Map.entrySet遍历适合容量大的情况
        for(Map.Entry<String ,String > entry:map.entrySet()){
            System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
        }

        //第四种遍历通过Map.entrySet()遍历所有的value，但不能遍历key
        for(String  v:map.values()){
            System.out.println("value:"+v);
        }
    }
}

