package TestIO.File;

import java.io.File;

public class Filedir1 {
	public static void main(String[] args) {
		File src = new File("D:/Work/test/TT/jpg/dir");
		count(src);
		System.out.println(len);
	}

	public static long len = 0;
	
	public static void count(File src) {
		if(null!=src && src.exists()) {
			if(src.isFile()) {
				len += src.length();
			}else {
				for(File s:src.listFiles()) {
					count(s);
				}
			}
		}
	}
}
