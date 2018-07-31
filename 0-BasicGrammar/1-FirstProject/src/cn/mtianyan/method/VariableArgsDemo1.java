package cn.mtianyan.method;

public class VariableArgsDemo1 {
    public void search(int n,int... a){
        boolean flag =false;
        for (int i=0;i<a.length-1;i++){
            if(n == a[i]){
                System.out.println("找到了值为"+n+"的数，其下标为"+i);
                flag = true; break;
            }
        }
        if(flag){
            System.out.println();
        }else{
            System.out.println("没找到");
        }
    }
//    public void search(int n,int[] a){
//
//    }
    public static void main(String[] args) {
        VariableArgsDemo1 variableArgsDemo1 = new VariableArgsDemo1();
        variableArgsDemo1.search(1,2,1,3,4);
        variableArgsDemo1.search(3,12,2,3,6);
        variableArgsDemo1.search(10,12,2,3,6);
        int[] arr1 = {1,2,3,4};
        variableArgsDemo1.search(2,arr1);
    }
}