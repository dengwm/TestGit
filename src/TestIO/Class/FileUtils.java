package TestIO.Class;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {

	public static void main(String[] args) {
		// �ļ����ļ�
		try {
			InputStream is = new FileInputStream("D:/Work/test/TT/ccc.txt");
			OutputStream os = new FileOutputStream("D:/Work/test/TT/ddd.txt");
			copy(is,os);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// �ļ����ֽ�����
		byte[] datas = null;
		try {
			InputStream is = new FileInputStream("D:/Work/test/TT/222.jpg");
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			copy(is,os);
			datas = os.toByteArray();
			System.out.println(datas.length);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// �ֽ����鵽�ļ�
		try {
			InputStream is = new ByteArrayInputStream(datas);
			OutputStream os = new FileOutputStream("D:/Work/test/TT/333.png");
			copy(is,os);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	// �Խ����������
	public static void copy(InputStream is, OutputStream os) {
		try {
			byte[] flush = new byte[1024]; 
			int len = -1; 
			while((len=is.read(flush))!=-1) {
				os.write(flush,0,len);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			close(is,os);
		}
	}
	
	// ��װ�ͷ���Դ
	public static  void close(InputStream is, OutputStream os) {
		try {
			if(null != os) {
				os.close();  
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			if(null != is) {
				is.close();  
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// Closeable�����ͷ���Դ�������ͷźܶ����Դ
	public static void close(Closeable...ios) {
		for(Closeable io:ios) {
			try {
				if(null!=io) {
					io.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
