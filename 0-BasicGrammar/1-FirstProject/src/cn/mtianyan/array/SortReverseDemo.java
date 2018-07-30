package cn.mtianyan.array;

public class SortReverseDemo {
    public static void main(String[] args) {
        // 冒泡排序
        int[] a ={34,53,12,32,56,17};
        System.out.println("排序前的数组元素为: ");
        for (int n:a){
            System.out.print(n+" ");
        }
        System.out.println();
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if(a[j] < a[j+1]){
                    int temp = 0;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("从大到小排序后的数组元素为: ");
        for (int n:a){
            System.out.print(n+" ");
        }

    }
}
