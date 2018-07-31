package cn.mtianyan.method;

public class ArrayPassValue {
    // 定义方法用于修改某个数组元素的值
    public void  updateArray(int[] a){
        a[0] = 99;
        System.out.println("方法中arr值:");
        for (int n :a) {
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4};
        ArrayPassValue arrayPassValue = new ArrayPassValue();
        arrayPassValue.updateArray(arr);
        System.out.println();
        System.out.println("main中修改后arr值");
        for (int n:arr) {
            System.out.print(n +" ");
        }
    }
}
