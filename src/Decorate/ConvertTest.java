package Decorate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ConvertTest {
	public static void main(String[] args) {
		// 操作 System.in 和 System.out
		try(
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));){	
			// 循环获取键盘的输入(exit退出)，输出此内容
			String msg = "";
			while(msg.equals("exit")) {
				msg = reader.readLine();
				writer.write(msg);
				writer.newLine();
				writer.flush(); // 强制刷新
			}
		}catch(IOException e) {
			System.out.println("操作异常");
		}
	}
}
