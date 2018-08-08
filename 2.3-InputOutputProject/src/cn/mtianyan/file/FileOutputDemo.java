package cn.mtianyan.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {

	public static void main(String[] args) {
		FileOutputStream fos;
		FileInputStream fis;
		try {
			fos = new FileOutputStream("mtianyan.txt",true);
			fis=new FileInputStream("mtianyan.txt");
			fos.write(50);
			fos.write('a');
			System.out.println(fis.read());
			System.out.println((char)fis.read());
			fos.close();
			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
