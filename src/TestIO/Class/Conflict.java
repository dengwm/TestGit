package TestIO.Class;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Conflict {
	public static void main(String[] args) {
		byte[] datas = fileToByteArray("222.jpg");
		System.out.println(datas.length);
		byteArrayToFile(datas,"D:\\Work\\test\\TT\\333.jpg");
	}
	
	
	// 图片到字符数组
	public static byte[] fileToByteArray(String filePath) {
		File src = new File(filePath);
		ByteArrayOutputStream baos = null;
		InputStream is =null; 
		try {
			baos = new ByteArrayOutputStream();
			is =new FileInputStream(src);
			byte[] flush = new byte[1024*10]; 
			int len = -1;
			while((len=is.read(flush))!=-1) {
				baos.write(flush,0,len);
			}
			baos.flush();
			return baos.toByteArray();
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
		return null;
	}
	
	
	// 字符数组到图片
	public static void byteArrayToFile(byte[] src, String filePath) {
		File dest = new File(filePath);
		InputStream is = null; 
		OutputStream os = null;
		try {
			os = new FileOutputStream(dest,true);
			is = new ByteArrayInputStream(src);
			byte[] flush = new byte[5]; 
			int len = -1;
			while((len=is.read(flush))!=-1) {
				os.write(flush,0,len);
			}
			os.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null != os) {
					os.close(); 
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
