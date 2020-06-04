package java8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		
		ArrayList<String>l=new ArrayList<String>();
		l.add("Dhiraj");
		l.add("Sagar");
		l.add("Vinod");
		l.add("Sheru");
		l.add("Adi");
		//get String who's length > 4;
		List<String>l2=l.stream().filter(str->str.length()>4).collect(Collectors.toList());
		System.out.println(l2);
		
		ArrayList<Employee>eList=new ArrayList<Employee>();
		eList.add(new Employee(1, "ABC", "Admin", Double.valueOf(10000)));
		eList.add(new Employee(1, "XYX", "Sale", Double.valueOf(3000)));
		eList.add(new Employee(1, "PQR", "Marketing", Double.valueOf(5000)));
		eList.add(new Employee(1, "CBNS", "Admin", Double.valueOf(7000)));
		eList.add(new Employee(1, "SARF", "SubAdmin", Double.valueOf(9000)));
		System.out.println("***e1-Employee who's salary >5000***");
		List<Employee>e1=eList.stream().filter(emp->emp.getSalary()>=5000).collect(Collectors.toList());
		for(Employee e:e1)
		{
			System.out.println(e.getEname()+"="+e.getRole()+"="+e.getSalary());
		}
		System.out.println("***e2-Employee who's salary >5000 and role is admin***");
		List<Employee>e2=eList.stream().filter(emp->(emp.getSalary()>=5000&&emp.getRole().equalsIgnoreCase("Admin") )).collect(Collectors.toList());
		
		for(Employee e:e2)
		{
			System.out.println(e.getEname()+"="+e.getRole()+"="+e.getSalary());
		}
				
		
		//e4 sort employee salarywise
		System.out.println("***e4 Sort employee Salary wise***");
		Comparator<Employee>c=(emp1,emp2)->(emp1.getSalary()<emp2.getSalary())?-1:(emp1.getSalary()<emp2.getSalary())?1:0;
		
		List<Employee>e4=eList.stream().sorted(c).collect(Collectors.toList());
		for(Employee e:e4)
		{
			System.out.println(e.getEname()+"="+e.getRole()+"="+e.getSalary());
		}
		System.out.println("***e3 if employee has salary <=5000 then increase 2000 rs***");
		int increament=2000;
		//e3 if employee has salary <=5000 then increase 2000 rs
		List<Employee>e3=eList.stream().map(emp->{
			if(emp.getSalary()<=5000) {
				Double sal=emp.getSalary()+increament;
				emp.setSalary(sal);
			}
			return emp;
		}).collect(Collectors.toList());
		
		for(Employee e:e3)
		{
			System.out.println(e.getEname()+"="+e.getRole()+"="+e.getSalary());
		}
		//forEach method
		System.out.println("e6 print Employee name using forEach Method");
		eList.stream().forEach(empl->System.out.println("Employee Name="+empl.getEname()));
		
		Integer array[] = {1,2,5,2,4,67,65,9,12}; 
		System.out.println("e5 Get min and max value from List");
		List<Integer>arr=Arrays.asList(array);
		Comparator<Integer>minMaxValueComparator=(a,b)->a.compareTo(b);
		Integer min=arr.stream().min(minMaxValueComparator).get();
		Integer max=arr.stream().max(minMaxValueComparator).get();
		System.out.println(" Min ="+min+ " Max="+max);
		
		
		
	}
}
