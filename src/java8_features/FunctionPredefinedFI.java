package java8_features;

import java.util.function.Function;

public class FunctionPredefinedFI {

	public static void main(String[] args) throws InvalidMarkException
	{
		//f1 Sqare
		Function<Integer, Integer>f1=i->i*i;
		System.out.println("Square of 5="+f1.apply(5));
		
		
		Function<Employee,String>f2=e->{
			if(e.getSalary().equals(Double.valueOf(10000)))
				return "1st Class";
			else if(e.getSalary().equals(Double.valueOf(5000)))
				return "2nd Class";
			else if(e.getSalary().equals(Double.valueOf(3000)))
				return "3rd Class";
			else if(e.getSalary().equals(Double.valueOf(1000)))
				return "4th Class";
			else
				return "no class";
		};
		
		Employee ee=new Employee(1, "Dhiraj", "Admin", Double.valueOf(5000));
		
		System.out.println("Employee class 5000 Salary ="+f2.apply(ee));
		
	}
	
}
