package cn.mtianyan.string;

public class StringDemo5 {

	public static void main(String[] args) {
		// ==和equals方法的区别
		// 定义三个字符串，内容都是mtianyan
		String str1="mtianyan";
		String str2="mtianyan";
		String str3=new String("mtianyan");
		System.out.println("str1和str2的内容相同？"+(str1.equals(str2)));
		System.out.println("str1和str3的内容相同？"+(str1.equals(str3)));
		
		System.out.println("str1和str2的地址相同？"+(str1==str2));
		System.out.println("str1和str3的地址相同？"+(str1==str3));
	}
}
