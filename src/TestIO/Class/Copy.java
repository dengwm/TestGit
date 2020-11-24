package TestIO.Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {

	public static void main(String[] args) {
		copy("D:/Work/test/TT/222.jpg","D:/222.jpg");
	}
	public static void copy(String srcPath,String destPath) {
		File src = new File(srcPath); // 源头
		File dest = new File(destPath); // 目的地
		
		InputStream is = null;
		OutputStream os = null; 
		
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
			byte[] flush = new byte[1024];   // 缓冲容器
			int len = -1; // 接收长度
			while((len=is.read(flush))!=-1) {
				os.write(flush,0,len);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null != os) {
					os.close();  // 关闭 先打开的后关闭
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(null != is) {
					is.close();  // 关闭
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
