package application;

import managers.SortManager;
import problemdomain.Cylinder;

public class AppDriver
{
	
	String fileName;
	

	public static void main(String args[]) {
		//System.out.println(args[0]);
		
		//String a[] = {"-fpolyfor1.txt", "-tv", "-sb"};
		//new SortManager(a);

		//TEST CALCULATION
		Cylinder c = new Cylinder(25.05,10.25);
		
		
		System.out.println("Volume : " + c.getVolume());
		System.out.println("Area : " + c.getArea());
		
	}	
}
