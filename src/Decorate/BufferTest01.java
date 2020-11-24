package Decorate;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class BufferTest01 {
	public static void main(String[] args) throws IOException {
		File src = new File("ccc.txt"); 
		InputStream is = null; 
		try {
			// »º³åÁ÷
			is = new BufferedInputStream(new FileInputStream(src)); 		
			byte[] flush = new byte[1024*10]; 
			int len = -1;
			while((len=is.read(flush))!=-1) {
				String str = new String(flush,0,len);
				System.out.println(str);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null != is) {
					is.close();  
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
