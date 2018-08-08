package cn.mtianyan.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {

	public static void main(String[] args) {
		File directory = new File("");
		String pathBase = directory.getAbsolutePath();
		// 创建一个FileInputStream对象
		try {
			FileInputStream fis=new FileInputStream(pathBase+"/src/cn/mtianyan/file/hi.txt");
			byte[] b=new byte[15];
			fis.read(b,0,5);
			System.out.println(new String(b));
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
