package TestIO.Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test04 {
	public static void main(String[] args) {
		File dest = new File("dest.txt"); //创建流
		Writer writer = null;  // 选择流
		try {
			writer= new FileWriter(dest);// 加上true是追加
			String msg = "IO is so eary 啊";
			char[] datas = msg.toCharArray();
			writer.write(datas,0,datas.length);
			writer.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null != writer) {
					writer.close();  // 关闭
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
