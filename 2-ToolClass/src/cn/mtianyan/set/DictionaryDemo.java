package cn.mtianyan.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class DictionaryDemo {

	public static void main(String[] args) {
		Map<String,String> animal= new HashMap<>();
		System.out.println("请输入三组单词对应的注释，并存放到HashMap中");
		Scanner console=new Scanner(System.in);
		// 添加数据
		int i=0;
		while(i<3){
			System.out.print("请输入key值（单词）：");
			String key=console.next();
			System.out.print("请输入value值（注释）：");
			String value=console.next();
			animal.put(key, value);
			i++;
		}
		// 打印输出value的值（直接使用迭代器）
		System.out.println("*****************************************");
		System.out.println("使用迭代器输出所有的value：");
		Iterator<String> it=animal.values().iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"    ");
		}
		System.out.println();
		System.out.println("*****************************************");

		// 打印输出key和value的值
		// 通过entrySet方法
		System.out.println("通过entrySet方法得到key－value：");
		Set<Entry<String, String>> entrySet=animal.entrySet();
		for(Entry<String, String> entry:entrySet){
			System.out.print(entry.getKey()+"-");;
			System.out.println(entry.getValue());
		}
		System.out.println();
		System.out.println("*****************************************");
		
		// 通过单词找到注释并输出
		// 使用keySet方法
		System.out.println("请输入要查找的单词：");
		String strSearch=console.next();
		// 1.取得keySet
		Set<String> keySet=animal.keySet();
		// 2.遍历keySet
        boolean isFind = false;
		for(String key:keySet){
			if(strSearch.equals(key)){
				System.out.println("找到了！"+"键值对为："+key+"-"+animal.get(key));
				isFind = true;
				break;
			}else {
			    isFind = false;
            }
		}
		if (!isFind){
            System.out.println("未找到");
        }
	}

}
