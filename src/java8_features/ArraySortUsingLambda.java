package java8_features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraySortUsingLambda 
{
	public static void main(String[] args) {
		ArrayList<Integer>i=new ArrayList<Integer>();
		i.add(10);
		i.add(20);
		i.add(15);
		i.add(5);
		System.out.println(i);
		Collections.sort(i,new MyComparator());
		System.out.println(i);
		System.out.println("=====Using Lambda Expression======");
		ArrayList<Integer>i2=new ArrayList<Integer>();
		i2.add(10);
		i2.add(20);
		i2.add(15);
		i2.add(5);
		System.out.println(i2);
		Comparator<Integer>c=(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
		Collections.sort(i2,c);
		System.out.println(i2);
	}
}
