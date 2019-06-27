package class34;

import java.util.Hashtable;
import java.util.Map;

public class CollectionRecap {

	public static void main(String[] args) {
		
//		Set<String> set=new TreeSet<>();
//		set.add("java");
//		set.add("is");
//		set.add("fun");
//		set.add("and");
//		set.add("logic based");
//		
//		System.out.println(set);
		
//		Map<Integer, String> map=new TreeMap<>();
//		map.put(1, "A");
//		map.put(2, "B");
//		map.put(3, "C");
//		map.put(4, "D");
//		//map.put(null, "E");
//		map.put(5, null);
//		map.put(4, "E");
//		
//		System.out.println(map);
		
		Map<String, Integer> map1=new Hashtable<>();
		map1.put("1", 2);
		//map1.put(null, 3);
		map1.put("A", 2);
		System.out.println(map1);
		
	}
}
