package application;

import manager.SortManager;

public class AppDriver
{
	
	String fileName;
	

	public static void main(String args[]) {
		//System.out.println(args[0]);
		
		String a[] = {"-fpolyfor1.txt", "-tv", "-sb"};
		new SortManager(a);


		
	}

	
	
}
