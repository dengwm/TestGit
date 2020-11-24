package TestIO.File;

import java.io.File;

public class Pathdemo01 {
	
	public static void main(String[] args) {
		String path = "D:\\Work\\test\\TT\\jpg\\111.jpg";
		System.out.println(File.separatorChar);
		
		path = "D:/Work/test/TT/jpg/111.jpg";
		System.out.println(path);
	}
}
