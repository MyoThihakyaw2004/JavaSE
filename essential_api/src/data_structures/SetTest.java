package data_structures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> countrySet = new TreeSet<String>();
		//Set<String> countrySet = new LinkedHashSet<String>();
		//Set<String> countrySet = new HashSet<String>();
		countrySet.add("Myanmar");
		countrySet.add("Japan");
		countrySet.add("Thailand");
		countrySet.add("Korea");
		countrySet.add("France");
		countrySet.add("USA");
		
		System.out.println(countrySet);
		
		Iterator<String> it = countrySet.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}		
//		for (final String country : countrySet) {
//			System.out.println(country);
//		}
	}

}
