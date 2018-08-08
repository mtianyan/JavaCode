package cn.mtianyan.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("mtianyan.txt");
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader br=new BufferedReader(isr);
			int n=0;
			char[] cbuf=new char[10];
// 读取代码
		    while((n=isr.read())!=-1){
		    	   System.out.print((char)n);
		    }
//			while((n=isr.read(cbuf))!=-1){
//				String s=new String(cbuf,0,n);
//				System.out.print(s);
//			}

			fis.close();
			isr.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}