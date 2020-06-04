package java8_features;

public class Student 
{
	int mark;
	String name;
	Student(){}
	Student(int  m,String n)
	{
		this.mark=m;
		this.name=n;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
