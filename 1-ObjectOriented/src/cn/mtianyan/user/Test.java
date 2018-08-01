package cn.mtianyan.user;

public class Test {
    public static void main(String[] args) {
        User one = new User("Lucy","123456");
        User two = new User("Mike","123456");
        UserManage userManage = new UserManage();
        System.out.println(userManage.checkUser(one,two));
    }
}
