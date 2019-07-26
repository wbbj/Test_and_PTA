package Test_MyArryList;

public class MyArrayList {
    private int[] array;
    private int size;
    public void setSize(int i){
        array=new int[i];
        size=0;
    }
    public int getSize(){
        return size;
    }
    public int getRl(){
        return array.length;
    }
    public int getMyArrayLists(int i){
        return array[i];
    }
    public void setMyArrayLists(int i,int data){
        if(i<array.length){
            array[i]=data;
        }
        size++;
    }
    public void insert(int i, int data){
        if(size==array.length){
            int[] array1 = new int[array.length+1];
            array1[array.length] = data;
            System.arraycopy(array, 0, array1, 0, array.length);
            this.array=array1;
            size++;
        }
        if (size>=0&&size<array.length) {
            for (int j = array.length-2; j >= i; j--) {
                array[j + 1] = array[j];
            }
            array[i] = data;
            size++;
        }
    }
    public void delete(int i){
        for (int j = i + 1; j < size; j++) {
            array[j - 1] = array[j];
        }
        size--;
    }
    public void reSize(){
        if(size==array.length) {
            int[] array1 = new int[(int) (array.length * 1.5)];
            System.arraycopy(array, 0, array1, 0, array.length);
            this.array=array1;
        }
    }
}
