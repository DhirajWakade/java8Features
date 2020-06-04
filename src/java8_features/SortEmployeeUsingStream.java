package java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortEmployeeUsingStream {

	public static void main(String[] args) {
		ArrayList<Employee>empList=new ArrayList<Employee>();
		empList.add(new Employee(1,"Dhiraj","Admin"));
		empList.add(new Employee(2,"Sagar","SubAdmin"));
		empList.add(new Employee(3,"Parsharam","Sale"));
		empList.add(new Employee(4,"Ravi","Marketing"));
		empList.add(new Employee(5,"Vinod","Admin"));
		empList.add(new Employee(6,"Vishal","Admin"));
		
		List<Employee>em=empList.stream().filter(e->e.getRole().equalsIgnoreCase("Admin")).collect(Collectors.toList());
		for (Employee employee : em) {
			System.out.println(employee.getEname());
		}
						
		

	}

}
