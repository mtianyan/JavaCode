package cn.mtianyan.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 {

	public static void main(String[] args) {
		File directory = new File("");
		String pathBase = directory.getAbsolutePath();
		//创建一个FileInputStream对象
		try {
			FileInputStream fis=new FileInputStream(pathBase+"/src/cn/mtianyan/file/hi.txt");
//			int n=fis.read();
			int n;
//			while(n!=-1){
//				System.out.print((char)n);
//				n=fis.read();
//			}
			while((n=fis.read())!=-1){
				System.out.print((char)n);
			}
			fis.close();
		}catch (FileNotFoundException e) {
			System.out.println("找不到文件");
			e.printStackTrace();
		} catch(IOException e){
			System.out.println("输入输出异常");
			e.printStackTrace();
		}
	}

}
