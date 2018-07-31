package cn.mtianyan.method;

public class ArrayExercise {
    public void arrAvg(float[] arr){
        float sum = 0;
        for (float n:arr) {
            sum += n;
        }
        float avg = sum/arr.length;
        System.out.println("数组的平均值为: "+avg);
    }
    public static void main(String[] args) {
        ArrayExercise arrayExercise = new ArrayExercise();
        float [] arr = {78.5f,98.5f,65.5f,32.5f,75.5f};
        arrayExercise.arrAvg(arr);
    }
}
