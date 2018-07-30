package cn.mtianyan;

public class ArrayTwo {
    public static void main(String[] args) {
        // 定义一个两行三列的二维数组并赋值
        int[][] twoArray = {{1,2,3},{4,5,6}};
        for (int i=0;i<twoArray.length;i++){
            // 每行的元素
            for (int j=0;j<twoArray[i].length;j++){
                System.out.print(twoArray[i][j]);
            }
            System.out.println();
        }
    }
}
