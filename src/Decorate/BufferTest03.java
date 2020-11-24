package Decorate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferTest03 {
	public static void main(String[] args) {
		File dest = new File("dest.txt"); //������
		BufferedWriter writer = null;  // ѡ����
		try {
			writer= new BufferedWriter(new FileWriter(dest));
			writer.append("IO so easy");
			writer.newLine();
			writer.append("dwm");
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
