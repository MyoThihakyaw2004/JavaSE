package lambda;

public class GenericsLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomComparator<Integer> intCmp = (n1, n2) -> n1.compareTo(n2) > 0 ? n1 : n2;
		System.out.println("Max: 20, 30 = "+ intCmp.compare(20, 30));
		
		CustomComparator<String> strCmp = (s1, s2) -> s1.compareTo(s2) < 0 ? s1 : s2;
		System.out.println("Min: Apple, Banana = "+strCmp.compare("Apple","Banana"));
	
		CustomComparator<Double> dbCmp = new CustomComparator<Double>() {
			
			@Override
			public Double compare(Double t1, Double t2) {
				// TODO Auto-generated method stub
				return t1.compareTo(t2) > 0 ? t1 : t2;
			}
		};
		
		System.out.println("Max : 34.11, 12.3 = " + dbCmp.compare(34.11, 12.3));
	}

}
