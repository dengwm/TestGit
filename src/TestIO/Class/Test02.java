package TestIO.Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test02 {

	public static void main(String[] args) throws FileNotFoundException {
		File dest = new File("dest.txt"); //创建流
		OutputStream os = null;  // 选择流
		try {
			os = new FileOutputStream(dest,true);// 加上true是追加
			// 写入
			String msg = "IO is so eary";
			// 字符串->字符(编码)
			byte[] datas = msg.getBytes();
			os.write(datas,0,datas.length);
			os.flush();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null != os) {
					os.close();  // 关闭
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
