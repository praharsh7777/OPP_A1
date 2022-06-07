package application;

import java.io.FileNotFoundException;
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

		
		AppManager app = new AppManager();
		
		
		try
		{
			app.loadDataFiles("C:\\Users\\barab\\Desktop\\School Files\\SPRING 2022\\311 Advance OOP\\Assignments\\A1 Complexity and Sorting\\1\\Data_Files_ClassName (1)\\polyfor1.txt");
		} catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
	}	
	
	
	private void testSort() {
		
		
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
		Arrays.sort(list, ba);

		long start = System.currentTimeMillis();
		
		HeapSort.sort(list, ba);
		long end= System.currentTimeMillis();
		long time = end-start;
		System.out.println("Time is " + time);
		
		for( Cylinder s : list ) 
		{
			System.out.println("\t" + s.getHeight() + " " + s.getBaseArea()); 
		}
	}
}
