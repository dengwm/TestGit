package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestStoreData2 {
	public static void main(String[] args) {
		User user1 = new User(1001,"dd",1000);
		User user2 = new User(1002,"ww",2000);
		User user3 = new User(1003,"mm",3000);
		
		List<User> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		for(User u:list) {
			System.out.println(u);
		}
		
		Map<Integer,User> map = new HashMap<>();
		map.put(1001, user1);
		map.put(1002, user2);
		map.put(1003, user3);
		Set<Integer> keyset = map.keySet();
		for(Integer key:keyset) {
			System.out.println(key+"---"+map.get(key));
		}
		
	}
}

class User{
	private int id;
	private String name;
	private double salary;
	
	// 无参构造器
	public User() {
	}
	
	public User(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public String toString() {
		return "id:"+id+" name:"+name+" salary"+salary;
	}
}