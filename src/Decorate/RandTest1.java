package Decorate;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandTest1 {

	public static void main(String[] args) throws IOException {
		test1();
		test2();
		test3();
	}

	// 指定起始位置，读取剩余内容
	public static void test1() throws IOException {
		RandomAccessFile raf = new RandomAccessFile(new File("D:/Work/test/TT/ccc.txt"),"r");
		raf.seek(2); // 从位置为2的开始
		byte[] flush = new byte[1024];
		int len = -1;
		while((len=raf.read(flush))!=-1) {
			System.out.println(new String(flush,0,len));
		}		
		raf.close();
	}
	
	// 分开思想：起始、实际大小
		public static void test2() throws IOException {
			RandomAccessFile raf = new RandomAccessFile(new File("D:/Work/test/TT/ccc.txt"),"r");
			int beginPos = 2;  // 起始位置
			int actualSize = 1026; // 实际大小
			raf.seek(beginPos);
			byte[] flush = new byte[1024];
			int len = -1;
			while((len=raf.read(flush))!=-1) {
				if(actualSize>len) {
					System.out.println(new String(flush,0,len));
					actualSize -= len;
				}else {
					System.out.println(new String(flush,0,actualSize));
					break;
				}
			}		
			raf.close();
		}
		
		// 指定起始位置和实际长度
		public static void test3() throws IOException {
			RandomAccessFile raf = new RandomAccessFile(new File("D:/Work/test/TT/ccc.txt"),"r");
			long lens = raf.length();// 总长度
			int blockSize = 10; //每块大小
			int size = (int)Math.ceil(lens*1.0/blockSize); //每块大小( 先变double，再取整，再转回int)
			int beginPos = 0;
			int actualSize = (int)(blockSize>lens?lens:blockSize);
			for(int i=0;i<size;i++) {
				beginPos = i*blockSize;
				if(i==size-1) { // 如果是最后一块
					actualSize = (int)lens;
				}else {
					actualSize = blockSize;
					lens -= actualSize;
				}
			}
			
			raf.seek(beginPos);
			byte[] flush = new byte[1024];
			int len = -1;
			while((len=raf.read(flush))!=-1) {
				if(actualSize>len) {
					System.out.println(new String(flush,0,len));
					actualSize -= len;
				}else {
					System.out.println(new String(flush,0,actualSize));
					break;
				}
			}		
			raf.close();
		}
}
