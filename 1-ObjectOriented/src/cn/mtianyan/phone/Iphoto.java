package cn.mtianyan.phone;

/**
 * 具有拍照能力的接口
 */
public interface Iphoto {
    public void photo();
    default void connection(){
        System.out.println("我是照相接口中的默认连接");
    }
}
