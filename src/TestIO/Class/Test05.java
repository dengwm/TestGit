package TestIO.Class;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test05 {
	public static void main(String[] args) throws IOException {
		byte[] src = "talk is cheap show me code".getBytes(); //������
		InputStream is = null; // ѡ����
		try {
			is = new ByteArrayInputStream(src);
			// ��������
			byte[] flush = new byte[5]; 
			int len = -1;
			while((len=is.read(flush))!=-1) {
				// �ַ�����->�ַ���(����)
				String str = new String(flush,0,len);
				System.out.println(str);
			}
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
