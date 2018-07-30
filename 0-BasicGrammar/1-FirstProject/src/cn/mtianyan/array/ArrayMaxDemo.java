package cn.mtianyan.array;

public class ArrayMaxDemo {
    public static void main(String[] args) {
        // 求数组元素最大值
        int[] a ={34,23,78,56,31};
        int max = a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("max:" +max);
    }
}
