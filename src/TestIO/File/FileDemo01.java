package TestIO.File;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
	public static void main(String[] args) throws IOException {
		// ����File����
		String path = "D:/Work/test/TT/jpg/111.jpg";
		File src = new File(path);
		File src1 = new File("D:/Work/test/TT/jpg/111.jpg","IO.png");
		File src2 = new File(new File("D:/Work/test/TT/jpg/111.jpg"),"IO.png");

		System.out.println(src.length());  // ����
		System.out.println(src.getName());   // ����
		System.out.println(src.getPath());   // ·��
		System.out.println(src.getAbsolutePath());  // ����·��
		System.out.println(src.exists());  // �Ƿ����
		System.out.println(src.isFile());  // �Ƿ��ļ�
		System.out.println(src.isDirectory());  // �Ƿ�Ŀ¼
		
		File src3 = new File("D:/Work/test/TT/222.jpg");
		boolean flag = src3.createNewFile(); // �����ļ�
		System.out.println(flag); // �ɹ�����true
		flag = src3.delete();   // ɾ��
		System.out.println(flag);
	}
}
