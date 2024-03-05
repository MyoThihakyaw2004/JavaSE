package data_structures;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> scores = new LinkedList<Integer>();
		scores.add(100);
		scores.add(200);
		scores.add(300);
		scores.add(400);
		scores.add(500);
		scores.add(600);
		
		System.out.println(scores);
		System.out.println(scores.size());
		
		System.out.println("position 4 : " + scores.get(4));
		scores.remove(); // head element
		scores.removeFirst();
		System.out.println(scores);
	}

}
