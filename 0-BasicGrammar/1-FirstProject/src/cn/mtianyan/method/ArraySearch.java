package cn.mtianyan.method;

import java.util.Scanner;

public class ArraySearch {
    public boolean searchArray(int n,int[] arr){
        for (int i=0;i<arr.length-1;i++){
            if (arr[i] == n){
                System.out.println("数值为"+n+"的数的下标为:"+i);
                return true;
            }
        }
        System.out.println("没找到");
        return false;
    }
    public static void main(String[] args) {
        ArraySearch arraySearch = new ArraySearch();
        int[] arr = {3,10,11,13,17};
        System.out.println("请输入要查找的数据");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arraySearch.searchArray(n,arr);
    }
}
