package TestIO.File;

import java.io.File;

public class FileDir {
	public static void main(String[] args) {
		File dir = new File("D:/Work/test/TT/jpg/dir");
		boolean flag = dir.mkdirs(); // mkdirs()父目录没有会创建，mkdir()没有就不创建
		System.out.println(flag);
		
		// 下级名称
		String[] subName = dir.list();
		for(String l:subName) {
			System.out.println(l);
		}
		
		// 下级对象
		File[] subFiles = dir.listFiles();
		for(File lf:subFiles) {
			System.out.println(lf);
		}
		
		printName(dir,0);
	}
	// 递归打印子孙级目录和文件名称
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
