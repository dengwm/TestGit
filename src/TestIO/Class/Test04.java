package TestIO.Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test04 {
	public static void main(String[] args) {
		File dest = new File("dest.txt"); //������
		Writer writer = null;  // ѡ����
		try {
			writer= new FileWriter(dest);// ����true��׷��
			String msg = "IO is so eary ��";
			char[] datas = msg.toCharArray();
			writer.write(datas,0,datas.length);
			writer.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null != writer) {
					writer.close();  // �ر�
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
