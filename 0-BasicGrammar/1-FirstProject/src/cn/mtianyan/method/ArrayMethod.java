package cn.mtianyan.method;

public class ArrayMethod {
    public void printArray(int[] arr){
        for (int n :arr) { System.out.print(n+" "); }
        System.out.println(); // 方法是被调用多次的，所以最后加上换行。
    }
    public static void main(String[] args) {
        ArrayMethod arrayMethod = new ArrayMethod();
        int[] arr = {1,3,5,7,9};
        arrayMethod.printArray(arr);
    }
}
