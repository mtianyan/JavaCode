package cn.mtianyan.singleton;
// 懒汉式: 类内实例对象创建时并不直接初始化，直到第一次调用get方法时，才完成初始化操作
public class LazyMan {
    private LazyMan() {

    }

    private static LazyMan instance =null;

    public static LazyMan getInstance() {
        if(instance == null){
            instance = new LazyMan();
        }
        return instance;
    }
}
