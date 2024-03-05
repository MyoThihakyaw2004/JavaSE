package data_structures;

import java.util.ArrayDeque;

public class ArrayDequeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> processList = new ArrayDeque<String>();
		
		processList.offer("Process 1");
		processList.offer("Process 2");
		processList.offer("Process 3");
		processList.offer("Process 4");
		processList.offer("Process 5");
		
		System.out.println(processList);
		String removedProcess = processList.poll();
		System.out.println(removedProcess + " is removed");
		System.out.println(processList);
		
		//processList.add("Process 1");
		//processList.add("Process 2");
		//processList.add("Process 3");
		//processList.add("Process 4");
		//processList.add("Process 5");
		
		System.out.println(processList);
		System.out.println(processList.size());
		
		processList.removeLast();
		System.out.println(processList);
		System.out.println(processList.peek());
	}

}
