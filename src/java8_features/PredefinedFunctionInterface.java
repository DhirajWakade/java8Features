package java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredefinedFunctionInterface 
{
	public static void main(String args[])
	{
	
		//p1 to check no even or not
		Predicate<Integer>p1=i->i%2==0;
		System.out.println("10 Is even no="+p1.test(10));		
		
		//p3 to check String length >= 5 or not
		Predicate<String>p3=str->str.length()>=5;
		System.out.println("'Dhiraj' string length >=5 ="+p3.test("Dhiraj"));
		
		//p2 to check employee salary >= 1000 or not
		Predicate<Employee>p2=e->e.getSalary()>=10000;

		List<Employee>emplist=new ArrayList<Employee>();
		emplist.add(new Employee(1,"Dhiraj","Admin",Double.valueOf(8000)));
		emplist.add(new Employee(2,"Sagar","Admin",Double.valueOf(5000)));
		emplist.add(new Employee(3,"Vinod","Admin",Double.valueOf(15000)));
		emplist.add(new Employee(4,"Ganesh","Admin",Double.valueOf(25000)));
		
		for(Employee e:emplist)
		{
			System.out.println(e.getEname()+" is Salary greater than 10000 ="+p2.test(e));
		}	
		
		
		//Predicate Joining  
		// and () , or() and negate() used for Joining
		
		//p4 predicate - check integer value even 
		Predicate<Integer> p4= i->i%2==0;
		//p5 integer  greater than 10 or not;
		Predicate<Integer> p5= i->i>10;
		
		Integer[]arr= {12,13,14,15,16,5,7,8,9,13,9};
		
		System.out.println("  Predicate with and()");
		for(Integer i:arr)
		{
			Boolean flg=p4.and(p5).test(i);
			System.out.println(i+" is Even and greater than 10 ="+flg);
		}
		System.out.println("  Predicate with or()");
		for(Integer i:arr)
		{
			Boolean flg=p4.or(p5).test(i);
			System.out.println(i+" is Even or greater than 10 ="+flg);
		}
		System.out.println("  Predicate with negate()");
		for(Integer i:arr)
		{
			Boolean flg=p4.negate().test(i);
			System.out.println(i+" is Even or greater than 10 ="+flg);
		}
		
		
		
		
		
	}
}
