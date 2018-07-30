package cn.mtianyan.array;

public class SortDemo {
    public static void main(String[] args) {
        // 冒泡排序
        int[] a ={34,53,12,32,56,17};
        System.out.println("排序前的数组元素为: ");
        for (int n:a){
            System.out.print(n+" ");
        }
        System.out.println();
        int temp;
        // 外层控制趟，内层冒泡
        for(int i=0;i<a.length-1;i++){
            // 内层循环控制每趟排序,越到后边的趟，需要排的越少。
            for (int j=0;j<a.length-1-i;j++){
                // 前一个数大于后一个数，交换位置
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("从小到大排序排序后的数组元素为: ");
        for (int n:a) {
            System.out.print(n+" ");
        }
    }
}
