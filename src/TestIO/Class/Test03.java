package TestIO.Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test03 {
	public static void main(String[] args) {
		File src = new File("ccc.txt"); //创建流
		Reader reader = null;  // 选择流
		try {
			reader = new FileReader(src);
			char[] flush = new char[1024];
			int len = -1;
			while((len=reader.read(flush))!=-1) {
				String str = new String(flush,0,len);
				System.out.println(str);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null != reader) {
					reader.close();  // 关闭
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
