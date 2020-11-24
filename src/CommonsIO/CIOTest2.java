package CommonsIO;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class CIOTest2 {

	public static void main(String[] args) throws IOException {
		// 复制文件到文件
		FileUtils.copyFile(new File("D:/Work/test/TT/222.jpg"), new File("D:/Work/test/TT/333.jpg"));
		// 复制文件到目录
		FileUtils.copyFileToDirectory(new File("D:/Work/test/TT/222.jpg"), new File("D:/Work/test/"));
		// 复制整个目录到另一个目录里面
		FileUtils.copyDirectoryToDirectory(new File("D:/Work/test/TT/lib"), new File("D:/Work/test/TT/tte"));
		// 复制目录的内容到另一个目录
		FileUtils.copyDirectory(new File("D:/Work/test/TT/lib"), new File("D:/Work/test/TT/tte"));
		// 拷贝URL内容
		String url = "https://pic2.zhimg.com/v2-7d01cab20858648cbf62333a7988e6d0_qhd.jpg";
		FileUtils.copyURLToFile(new URL(url), new File("D:/Work/test/TT/444.jpg"));
		// 拷贝百度源码
		String datas = IOUtils.toString(new URL("http://www.baidu.com"), "UTF-8");
		System.out.println(datas);
	}
}
