package TestIO.Class;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {
	public static void main(String[] args) throws FileNotFoundException {
		byte[] dest = null; //������
		// ѡ����(��������)
		ByteArrayOutputStream baos = null;
		try {
			baos = new ByteArrayOutputStream();
			String msg = "IO is so eary";
			byte[] datas = msg.getBytes();
			baos.write(datas,0,datas.length);
			baos.flush();
			// ��ȡ����
			dest = baos.toByteArray();
			System.out.println(dest.length +"-->"+ new String(dest,0,baos.size()));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(null != baos) {
					baos.close();  // �ر�
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
