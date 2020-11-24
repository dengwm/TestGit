package Map;

import java.util.TreeMap;
import java.util.Map;

public class TestTreeMap {

	public static void main(String[] args) {
		Map<Integer,String> treemap1 = new TreeMap<>();
		treemap1.put(20, "aa");
		treemap1.put(3, "bb");
		treemap1.put(6, "cc");
		
		// 按照key递增方式排序
		for(Integer key:treemap1.keySet()) {
			System.out.println(key + "  " + treemap1.get(key));
		}
		
		Map<Emp,String> treemap2 = new TreeMap<>();
		treemap2.put(new Emp(100,"dd",5000), "d");
		treemap2.put(new Emp(200,"ww",4000), "w");
		treemap2.put(new Emp(300,"mm",6000), "m");
		
		for(Emp key:treemap2.keySet()) {
			System.out.println(key + "  " + treemap2.get(key));
		}
	}
}

class Emp implements Comparable<Emp>{
	int id;
	String name;
	double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "id:" + id +" name:" + name + " salary:"+salary;
	}
	
	@Override
	// 负数是小于，0是等于，正数是大于
	public int compareTo(Emp o) {
		if(this.salary>o.salary) {
			return 1;
		}else if(this.salary<o.salary) {
			return -1;
		}else{
			if(this.id>o.id) {
				return 1;
			}else if(this.id<o.id) {
				return -1;
			}else {
				return 0;
			}
		}
	}
}