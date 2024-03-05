package assignment3;

import java.util.Scanner;

/**
 * An AI program that answers questions about animals
 * Try asking questions. Make sure you follow the provided format.
 * Example1: What is a rabbit?
 * Example2: Where does snake live?
 */
public class AI {
	
	// Fixed data is stored inside String arrays
	private static String[] animals = {"rabbit", "snake", "ant"};
	private static String[] types = {"mammal", "reptile", "insect"};
	private static String[] locations = {"woods", "swamps", "everywhere"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// How to use the program
		System.out.println("Hello! Ask me questions about animals");
		System.out.println("Use this format to ask questions:");
		System.out.println("Example1: What is a rabbit?");
		System.out.println("Example2: Where does ant live?");
		System.out.println();
		
		// Declare variables to store the question
		Scanner userInput = new Scanner(System.in);
		String question = "";
		String[] questionArr;
		
		// Get user input
		do {
			System.out.print("Enter your question : ");
			question = userInput.nextLine();
			
			question = question.replace('?', ' ').strip();
			questionArr = question.split(" ");
			
		// If the question is not valid, ask again
		} while (!validQuestion(questionArr));
		
		userInput.close();
		
		answer(questionArr);
		
	}
	
	/**
	 * Checks if the question is valid.
	 * The question has to start with 'What' or 'Where'
	 * The question length needs to be 4.
	 * 
	 * @param q Question StringArray
	 * @return boolean
	 */
	private static boolean validQuestion(String[] q) {
		return ((q[0].equals("What") || q[0].equals("Where"))
				&& (q.length == 4));
	}
	
	/**
	 * Answer user's question
	 * @param q QustionArray
	 */
	private static void answer(String[] q) {
		
		
		/*
		 * Questions are separated into 2 types (What and Where)
		 * They are passed into respective methods.
		 */
		switch (q[0]) { 
		case "What" -> WhatIs(q[3]);
		case "Where" -> WhereIs(q[2]);
		
		default -> System.out.println("I don't know how to answer that question.");
		}
	}

	/**
	 * Answers 'What' questions from the user
	 * 
	 * @param animal String
	 */
	private static void WhatIs(String animal) {
		// TODO Auto-generated method stub
		int index = getIndex(animal);/*Index of animal from the array*/
		if (index == -1) {
			System.out.println("I don't know what "+ animal + " is.");
			return;
		}
		
		System.out.println("A " + animal + " is a "+ types[index]);
	}
	
	/**
	 * Answers 'Where' questions from the user
	 * 
	 * @param animal String
	 */
	private static void WhereIs(String animal) {
		// TODO Auto-generated method stub
		int index = getIndex(animal); /*Index of animal from the array*/
		if (index == -1) {
			System.out.println("I don't know what "+ animal + " is.");
			return;
		}
		
		System.out.println(animal + "s live in " + locations[index]);
	}

	/**
	 * 
	 * @param animal String 
	 * @return index of animal from the array
	 */
	private static int getIndex(String animal) {
		int index = -1;
		for (int i = 0; i < animals.length; i++) {
			if (animals[i].equals(animal)) {
				index = i;
			}
		}
		return index;
	}
}