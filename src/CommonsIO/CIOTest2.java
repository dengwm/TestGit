package CommonsIO;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class CIOTest2 {

	public static void main(String[] args) throws IOException {
		// �����ļ����ļ�
		FileUtils.copyFile(new File("D:/Work/test/TT/222.jpg"), new File("D:/Work/test/TT/333.jpg"));
		// �����ļ���Ŀ¼
		FileUtils.copyFileToDirectory(new File("D:/Work/test/TT/222.jpg"), new File("D:/Work/test/"));
		// ��������Ŀ¼����һ��Ŀ¼����
		FileUtils.copyDirectoryToDirectory(new File("D:/Work/test/TT/lib"), new File("D:/Work/test/TT/tte"));
		// ����Ŀ¼�����ݵ���һ��Ŀ¼
		FileUtils.copyDirectory(new File("D:/Work/test/TT/lib"), new File("D:/Work/test/TT/tte"));
		// ����URL����
		String url = "https://pic2.zhimg.com/v2-7d01cab20858648cbf62333a7988e6d0_qhd.jpg";
		FileUtils.copyURLToFile(new URL(url), new File("D:/Work/test/TT/444.jpg"));
		// �����ٶ�Դ��
		String datas = IOUtils.toString(new URL("http://www.baidu.com"), "UTF-8");
		System.out.println(datas);
	}
}
