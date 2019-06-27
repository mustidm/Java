package class34;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFromArray {

	public static void main(String[] args) {
						// 1		2		3		4		5			6
		String[] names= {"Mehmet", "Asha", "Amina", "Omar", "Siyar", "Danny"};
		
		Map<Integer, String> nameMap=new LinkedHashMap<>();
		
		int key=1;
		
		for(String name:names) {
			nameMap.put(key, name);
			key++;
		}
		System.out.println(nameMap);
		//print key and values using entrySet(loop && Iterator)
		//BREAK till 11:45
	}
}
