package cn.mtianyan.user;

public class UserManage {
    public String checkUser(User one,User two){
        System.out.println("用户名: "+one.getUsername());
        System.out.println("密码: "+one.getPassword());
        System.out.println("用户名: "+two.getUsername());
        System.out.println("密码: "+two.getPassword());
        System.out.println("=================");
        if (one.getUsername().equals(two.getUsername())){
            return  "用户名一致";
        }else {
            return  "用户名不一致";
        }
    }
}
