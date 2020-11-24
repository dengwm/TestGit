package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestIterator {
	public static void main(String[] args) {
		testList();
		testset();
		testmap1();
		testmap2();
	}
	
	public static void testList() {
		 List<String> list = new ArrayList<>();
		 list.add("aa");
		 list.add("bb");
		 list.add("cc");
		 
		 for(Iterator<String> iter = list.iterator();iter.hasNext();) {
			 String temp = iter.next();
			 System.out.println(temp);
		 }
	}
	
	public static void testset() {
		 Set<String> set = new HashSet<>();
		 set.add("aa");
		 set.add("bb");
		 set.add("cc");
		 
		 for(Iterator<String> iter = set.iterator();iter.hasNext();) {
			 String temp = iter.next();
			 System.out.println(temp);
		 }
	}
	
	public static void testmap1() {
		 Map<Integer,String> map1 = new HashMap<>();
		 map1.put(1,"aa");
		 map1.put(2,"bb");
		 map1.put(3,"cc");
		 
		 Set<Entry<Integer,String>> ss = map1.entrySet();
		 
		 for(Iterator<Entry<Integer,String>> iter = ss.iterator();iter.hasNext();) {
			 Entry<Integer,String> temp = iter.next();
			 System.out.println(temp.getKey() + "---" + temp.getValue());
		 }
	}
	
	public static void testmap2() {
		 Map<Integer,String> map2 = new HashMap<>();
		 map2.put(1,"aa");
		 map2.put(2,"bb");
		 map2.put(3,"cc");
		 
		 Set<Integer> keyset = map2.keySet();
		 
		 for(Iterator<Integer> iter = keyset.iterator();iter.hasNext();) {
			 Integer temp = iter.next();
			 System.out.println(temp + "---" + map2.get(temp));
		 }
	}
}
