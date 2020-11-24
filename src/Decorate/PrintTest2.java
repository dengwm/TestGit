package Decorate;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintTest2 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
		pw.println("打印流");
		pw.println(true);
		pw.close();
	}
}
