package cn.mtianyan.singleton;

public class Emperor {
    public static int EmperorNum = 1;
    private Emperor(){
    }
    private static Emperor instance = null;

    public static Emperor getInstance() {
        System.out.println("创建"+EmperorNum+"号皇帝对象");
        EmperorNum++;
        if(instance == null){
            instance = new Emperor();
        }
        return instance;
    }
}
