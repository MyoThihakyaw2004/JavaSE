package data_structures;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruitList = new ArrayList<String>(10);
		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("Banana");
		fruitList.add("Papaya");
		fruitList.add("Pineapple");
		fruitList.add("Kiwi");
		
		System.out.println(fruitList);
		Collections.sort(fruitList);
		System.out.println(fruitList);
		
//		Collections.reverse(fruitList);
//		System.out.println(fruitList);
		
		Collections.shuffle(fruitList);
		System.out.println(fruitList);
		
//		System.out.println(fruitList);
//		System.out.println(fruitList.get(3));
//		System.out.println("size = " + fruitList.size());
//		
//		//fruitList.clear();
//		//String removed = fruitList.remove(3);
//		//System.out.println(removed + " is removed.");
//		
//		boolean remove = fruitList.remove("Melon");
//		System.out.println(remove ? "removed!" : "failed");
//		
//		ArrayList<String> outOfStock = new ArrayList<String>();
//		outOfStock.add("Pineapple");
//		outOfStock.add("Kiwi");
//		
//		fruitList.removeAll(outOfStock);
//		System.out.println(fruitList);
//		
//		String orange = fruitList.get(1);
//		System.out.println(orange);
//		
//		System.out.println("Contains apple? : " + fruitList.contains("Apple"));
//		System.out.println("Empty? : " + fruitList.isEmpty());
//		
//		fruitList.add(1, "Melon");
//		fruitList.set(2, "Lychee");
//		
//		ArrayList<String> newFruits = new ArrayList<String>();
//		newFruits.add("DragonFruit");
//		newFruits.add("BlueBerry");
//		newFruits.add("Coconut");
//		
//		fruitList.addAll(newFruits);
//		System.out.println(fruitList);
	}

}
