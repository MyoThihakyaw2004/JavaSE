package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = Arrays.asList(
				new Employee(1001L, "Min Kyaw", 6300.56),
				new Employee(1002L, "Yan Naing", 3200.56),
				new Employee(1003L, "Moe Aung", 2200.56),
				new Employee(1004L, "Kaung Khant", 4500.56),
				new Employee(1005L, "Zarni Swe", 4200.56),
				new Employee(1006L, "Kabyar Bo", 3700.56)
				);
		
		
//		Function<Employee, Employee> setFirstNameFunc = e -> {
//			e.setName(e.getName().substring(0, e.getName().indexOf(" ")));
//			return e;
//		};
//		
//		Function<Employee, String> convertNameFunc = e -> e.getName();
//		Function<String, String> convertInitialLFunc = s -> String.valueOf(s.charAt(0));
//		List<String> nameList = getNameList(employeeList, convertNameFunc);
//		System.out.println(nameList);
//		
//		List<String> initialList = getNameList(employeeList, convertNameFunc.andThen(convertInitialLFunc));
//		System.out.println(initialList);
//		
//		List<String> firstNameList = getNameList(employeeList, convertNameFunc.compose(setFirstNameFunc));
//		System.out.println(firstNameList);
		
		Function<Employee, Person> employeToPersonFunc = e -> {
			String name = e.getName();
			int index = name.indexOf(" ");
		
			return new Person(e.getId(), name.substring(0, index), name.substring(index+1));
			
		};
		
		List<Person> personList = new ArrayList<Person>();
		employeeList.forEach(e -> {
			personList.add(employeToPersonFunc.apply(e));
		});
		
		personList.forEach(p -> System.out.println(p));
	}
	
	static List<String> getNameList(List<Employee> employeeList, Function<Employee, String> convertor) {
		List<String> nameList = new ArrayList<String>();
		
		employeeList.forEach(e -> {
			nameList.add(convertor.apply(e));
		});
		return nameList;
	}

}
