package Decorate;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 写出数据  --->序列化
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(baos));
		dos.writeUTF("编码");
		dos.writeInt(18);
		dos.writeBoolean(false);
		dos.writeChar('a');
		// 还可以写入对象
		dos.writeObject("解码");
		dos.writeObject(new Date());
		Employee emp = new Employee("dwm",100000);
		dos.writeObject(emp);
		dos.flush();
		byte[] datas = baos.toByteArray();
		// 读取 ---> 反序列化
		ObjectInputStream dis = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		String msg = dis.readUTF();
		int age = dis.readInt();
		boolean flag = dis.readBoolean();
		char ch = dis.readChar();
		Object str = dis.readObject();
		Object date = dis.readObject();
		Object employee = dis.readObject();
		
		// 类型转换
		if(str instanceof String) {
			String strObj = (String) str;
			System.out.println(strObj);
		}

		if(date instanceof Date) {
			Date dateObj = (Date) date;
			System.out.println(dateObj);
		}
		
		if(employee instanceof Employee) {
			Employee empObj = (Employee)employee;
			System.out.println(empObj.getName()+":"+empObj.getSalary());
		}
		
		System.out.println(flag);
		}
}

// javabean 封装数据,加上Serializable才能序列化
class Employee implements java.io.Serializable{
	private transient String name; // 加上transient(透明)之后就可以隐藏这个属性
	private double salary;
	
	public Employee() {
	}
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}