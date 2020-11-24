package Map;

import java.util.HashSet;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		
		set1.add("aa");
		set1.add("bb");
		set1.add("cc");
		System.out.println(set1);
		
		set1.remove("bb");
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<>();
		set2.addAll(set1);
		System.out.println(set2);
	}
}
