package cn.mtianyan;

public class ArrayTwoIrregular {
    public static void main(String[] args) {
        int[][] irregularArray = new int[2][]; //这里的2是数组容量
        // irregularArray[0] = new int[2];
        // irregularArray[1] = new int[3];
        // irregularArray[0][1] = 3;

        irregularArray[0] = new int[]{1, 2};
        irregularArray[1] = new int[]{1, 2, 3};
        for (int i=0;i<irregularArray.length;i++){
            for (int j=0;j<irregularArray[i].length;j++){
                System.out.print(irregularArray[i][j]);
            }
            System.out.println();
        }
    }
}
