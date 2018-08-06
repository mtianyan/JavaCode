package cn.mtianyan.string;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// 定义一个字符串"你好"
		StringBuilder str=new StringBuilder("你好");
		// 在"你好"后面添加内容，将字符串变成"你好，mtianyan!"
		 str.append(',');
	   	 str.append("mtianyan!");
	     System.out.println("str="+str);
//	     System.out.println("str="+str.append(',').append("mtianyan!"));

		// 将字符串变成"你好,MTIANYAN ！"
		// 两种方式：
		// 1. 使用delete方法删除mtianyan，然后再插入MTIANYAN
		System.out.println("替换后："+str.delete(3,str.length()).insert(3, "MTIANYAN!"));
		// 2. 使用replace方法直接替换
		System.out.println("替换后："+str.replace(3,str.length(),"MTIANYAN!"));
		
		// 在字符串"你好，MTIANYAN!"中取出"你好"并输出
		System.out.println(str.substring(0,2));
		System.out.println(str);
	}

}
