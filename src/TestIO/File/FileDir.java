package TestIO.File;

import java.io.File;

public class FileDir {
	public static void main(String[] args) {
		File dir = new File("D:/Work/test/TT/jpg/dir");
		boolean flag = dir.mkdirs(); // mkdirs()��Ŀ¼û�лᴴ����mkdir()û�оͲ�����
		System.out.println(flag);
		
		// �¼�����
		String[] subName = dir.list();
		for(String l:subName) {
			System.out.println(l);
		}
		
		// �¼�����
		File[] subFiles = dir.listFiles();
		for(File lf:subFiles) {
			System.out.println(lf);
		}
		
		printName(dir,0);
	}
	// �ݹ��ӡ���ＶĿ¼���ļ�����
	public static void printName(File src,int deep) {
		for(int i=0;i<deep;i++) {
			System.out.println("-");
		}
		if(null == src || src.exists()) {
			return;
		}else if(src.isDirectory()) {
			for(File s:src.listFiles()) {
				printName(s,deep+1);
			}
		}
			System.out.println(src.getName());
	}
}
