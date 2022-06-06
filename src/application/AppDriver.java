package application;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;

import managers.AppManager;
import managers.BaseAreaCompare;
import managers.HeapSort;
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

		list[0]= new Cylinder(6,10.25);
		list[1]= new Cylinder(4,21.25);
		list[2]= new Cylinder(2,54.25);
		list[3]= new Cylinder(3,30.25);
		list[4]= new Cylinder(1,20.25);
		list[5]= new Cylinder(5,4.25);
		
		for( Cylinder s : list ) 
		{
			System.out.println("\t" + s.getHeight() + " " + s.getBaseArea()); 
		}
		
		System.out.println("HEAP SORT: ");
		BaseAreaCompare ba = new BaseAreaCompare();
		//Arrays.sort(list, gc);
		HeapSort.sort(list, ba);
		
		for( Cylinder s : list ) 
		{
			System.out.println("\t" + s.getHeight() + " " + s.getBaseArea()); 
		}
		
	}	
}
