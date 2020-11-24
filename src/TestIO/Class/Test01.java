package TestIO.Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test01 {
	public static void main(String[] args) throws IOException {
		File src = new File("ccc.txt"); //������
		InputStream is =new FileInputStream(src); // ѡ����
		try {
			// ��������
			byte[] flush = new byte[1024*10]; 
			int len = -1;
			while((len=is.read(flush))!=-1) {
				// �ַ�����->�ַ���(����)
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
					is.close();  // �ر�
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
