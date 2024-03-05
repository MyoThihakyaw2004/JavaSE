package data_structures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> examMap = new TreeMap<String, Integer>();
		//Map<String, Integer> examMap = new LinkedHashMap<String, Integer>();
		//Map<String, Integer> examMap = new HashMap<String, Integer>();
		examMap.put("MgMg", 200);
		examMap.put("MaSapal", 170);
		examMap.put("KyawKyaw", 180);
		examMap.put("AungAung", 220);
		examMap.put("ZawZaw", 300);
		
		System.out.println(examMap);
		System.out.println("AungAung's Mark = " + examMap.get("AungAung"));
		examMap.remove("ZawZaw", 200);
		examMap.replace("MaSapal", 170, 200);
		System.out.println(examMap);
		
		System.out.println("Contain MgMg? : " + examMap.containsKey("MgMg"));
		System.out.println("Contain 200? : " + examMap.containsValue(200));
	
		Set<Entry<String, Integer>> examSet = examMap.entrySet();
		for (final Entry<String, Integer> entry : examSet) {
			System.out.println("Key = "+entry.getKey()+" value = "+entry.getValue());
		}
	}

}
