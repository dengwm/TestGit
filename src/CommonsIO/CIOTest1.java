package CommonsIO;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

public class CIOTest1 {
	public static void main(String[] args) throws IOException {
		// 文件大小
		long len = FileUtils.sizeOf(new File("D:\\Work\\test\\TT\\src\\CommonsIO\\CIOTest1.java"));
		System.out.println(len);
		
		// 目录大小
		len = FileUtils.sizeOf(new File("D:\\Work\\test\\TT\\src"));
		System.out.println(len);
		
		// 列出子孙级
		Collection<File> files= FileUtils.listFiles(new File("D:\\Work\\test\\TT\\src"), EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
		for(File file:files) {
			System.out.println(file.getAbsolutePath());
		}
		// 列出子孙级后缀是.java的
		files= FileUtils.listFiles(new File("D:\\Work\\test\\TT\\src"), new SuffixFileFilter("java"), DirectoryFileFilter.INSTANCE);
		for(File file:files) {
			System.out.println(file.getAbsolutePath());
		}
		
		// 读取文件
		String msg = FileUtils.readFileToString(new File("D:/Work/test/TT/aaa.txt"),"UTF-8");
		System.out.println(msg);
		byte[] datas = FileUtils.readFileToByteArray(new File("D:/Work/test/TT/bbb.txt"));
		System.out.println(datas.length);
		
		// 逐行读取
		List<String> msgs = FileUtils.readLines(new File("D:/Work/test/TT/aaa.txt"),"UTF-8");
		for(String string:msgs) {
			System.out.println(string);
		}
		LineIterator it = FileUtils.lineIterator(new File("D:/Work/test/TT/aaa.txt"),"UTF-8");
		while(it.hasNext()) {
			System.out.println(it.nextLine());
		}
		
		// 写出内容
		FileUtils.writeStringToFile(new File("D:/Work/test/TT/ddd.txt"), "dwmthkl\r\n","UTF-8",true);
		FileUtils.writeByteArrayToFile(new File("D:/Work/test/TT/ddd.txt"), "dwmthkl\r\n".getBytes("UTF-8"), true);
	
		// 逐行写出
		List<String> datass = new ArrayList<String>();
		datass.add("ddd");
		datass.add("www");
		datass.add("mmm");
		FileUtils.writeLines(new File("D:/Work/test/TT/eee.txt"), datass, "--\r\n", true);
	}
}
