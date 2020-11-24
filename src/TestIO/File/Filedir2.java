package TestIO.File;

import java.io.File;

public class Filedir2 {
	private long len;
	private String path;
	public File src;
	
	// Îö¹¹º¯Êý
	public Filedir2(String path) {
		this.path = path;
		this.src = new File(path);
		count(this.src);
	}
	public long getLen() {
		return len;
	}
		
	private void count(File src) {
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
	
	public static void main(String[] args) {
		Filedir2 dir = new Filedir2("D:/Work/test/TT/jpg/dir");
		System.out.println(dir.getLen());
	}
}
