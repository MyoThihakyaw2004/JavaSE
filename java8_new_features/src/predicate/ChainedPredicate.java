package predicate;

import java.util.function.Predicate;

public class ChainedPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> longSentence = s -> s.length() >= 30;
		Predicate<String> endsWithDot = s -> s.endsWith(".");
		Predicate<String> capitalize = s -> Character.isUpperCase(s.charAt(0));
		
		boolean outcome1 = longSentence.negate().test("I'm blue da ba dee da");
		System.out.println("Short sentence ? " + outcome1);
		
//		String str = "Why are you running?";
//		boolean outcome1 = endsWithDot.or(capitalize).test(str);
//		System.out.println(outcome1);
		
//		String sentence = "My name is MgMg and I'm a student who's learning CS at CalTech.";
//		String sentence2 = "My name is MgMg.";
//		boolean outcome1 = longSentence.and(endsWithDot).and(capitalize).test(sentence);
//		boolean outcome2 = longSentence.and(endsWithDot).and(capitalize).test(sentence2);
//		System.out.println("Valid long sentence ? " + outcome1);
//		System.out.println("Valid long sentence: sentence2 ? " + outcome2);

	}

}
