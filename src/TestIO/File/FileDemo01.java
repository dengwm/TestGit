package TestIO.File;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
	public static void main(String[] args) throws IOException {
		// 构建File对象
		String path = "D:/Work/test/TT/jpg/111.jpg";
		File src = new File(path);
		File src1 = new File("D:/Work/test/TT/jpg/111.jpg","IO.png");
		File src2 = new File(new File("D:/Work/test/TT/jpg/111.jpg"),"IO.png");

		System.out.println(src.length());  // 长度
		System.out.println(src.getName());   // 名称
		System.out.println(src.getPath());   // 路径
		System.out.println(src.getAbsolutePath());  // 绝对路径
		System.out.println(src.exists());  // 是否存在
		System.out.println(src.isFile());  // 是否文件
		System.out.println(src.isDirectory());  // 是否目录
		
		File src3 = new File("D:/Work/test/TT/222.jpg");
		boolean flag = src3.createNewFile(); // 创建文件
		System.out.println(flag); // 成功返回true
		flag = src3.delete();   // 删除
		System.out.println(flag);
	}
}
