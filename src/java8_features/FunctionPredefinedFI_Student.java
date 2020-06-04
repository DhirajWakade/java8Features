package java8_features;

import java.util.function.Function;

public class FunctionPredefinedFI_Student {
	public static void main(String[] args) {
				
		Function<String,Boolean>f=str->{
			if(str.length()==10)
				return true;
			else
				return false;
		};
		System.out.println("Dhiraj="+f.apply("Dhiraj")); 
		
			Function<Student, String> f3 = student -> {
				int m = student.mark;
				try {
					validateMark(m);
					if (m >= 80)
						return "Destinction";
					else if (m <= 80 && m >= 60)
						return "First Class";
					else if (m >= 35 && m <= 60)
						return "Second Class";
					else if (m < 34)
						return "Fail";
					else
						return null;
				} catch (InvalidMarkException e) {
					e.printStackTrace();
					return null;
				}
			};		

		Student s = new Student(90, "Dhiraj");

		System.out.println("Grade of Dhiraj=" + f3.apply(s));

		Student s1 = new Student(175, "Sagar");

		System.out.println("Grade of Sagar=" + f3.apply(s1));
		

	}

	public static Boolean validateMark(int mark) throws InvalidMarkException {
		if (mark < 100)
			return true;
		else
			throw new InvalidMarkException();

	}

}
