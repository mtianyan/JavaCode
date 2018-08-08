package cn.mtianyan.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("mtianyan.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			FileInputStream fis=new FileInputStream("mtianyan.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			long startTime=System.currentTimeMillis();
			bos.write(50);
			bos.write('a');
			bos.flush();
			System.out.println(bis.read());
			System.out.println((char)bis.read());
			long endTime=System.currentTimeMillis();
			System.out.println(endTime-startTime);
			fos.close();
			bos.close();
			fis.close();
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
