package application;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;

import managers.AppManager;
import problemdomain.Cylinder;
import problemdomain.Shape;

public class AppDriver
{
	
	String fileName;
	

	public static void main(String args[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//System.out.println(args[0]);
		
		//String a[] = {"-fpolyfor1.txt", "-tv", "-sb"};
		//new SortManager(a);

		
		Cylinder[] list =new Cylinder[6];
		
		//TEST CALCULATION
		list[0]= new Cylinder(3,10.25);
		list[1]= new Cylinder(1,20.25);
		list[2]= new Cylinder(2,20.25);
		list[3]= new Cylinder(3,20.25);
		list[4]= new Cylinder(4,20.25);
		list[5]= new Cylinder(5,20.25);
		
		
		Arrays.sort(list);
		
		for (Cylinder cylinder : list)
		{
			System.out.println(cylinder.toString());			
		}
		
		
	}	
}
