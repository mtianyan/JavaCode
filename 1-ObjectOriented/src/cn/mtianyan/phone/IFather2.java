package cn.mtianyan.phone;

public interface IFather2 {
    void fly();
    default void connection(){
        System.out.println("IFather2中的connection");
    }
}
