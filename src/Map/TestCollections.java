package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add("d"+i);
		}
		System.out.println(list);
		
		// 随机排序
		Collections.shuffle(list);
		System.out.println(list);
		
		// 逆序
		Collections.reverse(list);
		System.out.println(list);

		// 递增排序，自定义的用Comparable接口
		Collections.sort(list);
		System.out.println(list);
		
		// 二分法查找
		System.out.println(Collections.binarySearch(list, "d1"));
	}
}
