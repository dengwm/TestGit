package TestIO.Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test02 {

	public static void main(String[] args) throws FileNotFoundException {
		File dest = new File("dest.txt"); //������
		OutputStream os = null;  // ѡ����
		try {
			os = new FileOutputStream(dest,true);// ����true��׷��
			// д��
			String msg = "IO is so eary";
			// �ַ���->�ַ�(����)
			byte[] datas = msg.getBytes();
			os.write(datas,0,datas.length);
			os.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null != os) {
					os.close();  // �ر�
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
