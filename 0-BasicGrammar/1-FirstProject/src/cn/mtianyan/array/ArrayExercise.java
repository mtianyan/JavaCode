package cn.mtianyan.array;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] a ={1,2,6,12,15,16,17};

        System.out.println("能被3整除的数组元素为:");
        for (int i=0;i<a.length;i++){
            if (a[i] % 3==0){
                System.out.println(a[i]);
            }
        }
    }
}
