package managers;

import java.awt.font.ShapeGraphicAttribute;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import exceptions.InvalidArgumentException;
import problemdomain.Cylinder;
import problemdomain.Shape;

public class AppManager
{

	private final String CYLINDER = "Cylinder";
	private final String CONE = "Cone";
	private final String PYRAMID = "Pyramid";
	private final String SQUAREPRISM = "SquarePrism";
	private final String TRIANGULARPRISM = "TriangularPrism";
	private final String PENTAGONALPRISM = "PentagonalPrism";
	private final String OCTAGONALPRISM = "OctagonalPrism";

	private final String SORT = "-s";
	private final String COMPARE = "-t";
	private final String FILENAME = "-f";

	private String sortType = "";
	private String compareType = "";
	private String filename = "";

	public AppManager()
	{
	}

	public AppManager(String args[])
	{
		try
		{
			for (String arg : args)
			{
				String attrib = getAttribute(arg);

				switch (attrib)
				{
				case FILENAME:
					this.filename = getValue(attrib, arg);
					break;
				case SORT:
					this.sortType = getValue(attrib, arg);
					break;
				case COMPARE:
					this.compareType = getValue(attrib, arg);
					break;
				default:
					throw new InvalidArgumentException(String.format("Attribute '%s' unknown.", attrib));
				}
			}

			// check if all requirements has value.
			if (this.filename.equals(""))
			{
				throw new InvalidArgumentException("(-f)Filename is not defined.");
			} else if (this.sortType.equals(""))
			{
				throw new InvalidArgumentException("(-s)Sort type is not defined.");
			} else if (this.compareType.equals(""))
			{
				throw new InvalidArgumentException("(-t)Compare type is not defined.");
			}
			
			
			loadDataFiles(filename);

		} catch (InvalidArgumentException | FileNotFoundException e)
		{
			System.out.println(e.getMessage());
			return;
		}


	}

	private String getAttribute(String arg)
	{
		return arg.substring(0, 2).toLowerCase();
	}

	private String getValue(String attrib, String arg) throws InvalidArgumentException
	{
		String val = arg.substring(2, arg.length()).toLowerCase();
		if (val.equals(""))
			throw new InvalidArgumentException(String.format("Value for (%s)%s cannot be empty.", attrib, getSortTypeDescription(attrib)));
		else if (attrib.equals(SORT))
			validateSortType(val);
		else if (attrib.equals(COMPARE))
			validateCompareType(val);

		return val;
	}

	private void validateSortType(String type) throws InvalidArgumentException
	{
		if (!(type.equals("b") || type.equals("s") || type.equals("m") || type.equals("q") || type.equals("z")))
		{
			throw new InvalidArgumentException(String.format("Sort type (%s) unknown. Please select (b)Bubble, (s)Selection, (m)Merge, (q)Quick or (h)Heap.", type));
		}
	}

	private void validateCompareType(String type) throws InvalidArgumentException
	{
		if (!(type.equals("v") || type.equals("h") || type.equals("a")))
			throw new InvalidArgumentException(String.format("Compare type (%s) unknown. Please select (v)Volume, (h)Height, or (a)Base Area.", type));
	}

	private String getSortTypeDescription(String attrib)
	{
		switch (attrib)
		{
		case FILENAME:
			return "Filename";
		case SORT:
			return "Sort type";
		case COMPARE:
			return "Compare type";
		default:
			return "";
		}
	}

	public void loadDataFiles(String path) throws FileNotFoundException
	{
		try
		{
			File refactor = new File(path);
			Scanner myReader = new Scanner(refactor);
	
			long start = System.currentTimeMillis();

			Shape s = new Cylinder();
			System.out.println("CLASS NAME : " + s.getClass());
			
			
			// parse text to array
			String arr[] = myReader.nextLine().split(" ");
			
			Shape[] shapes = generateShapesList(arr);
			System.out.println("array Size : " + shapes.length);
			
			for (int i = 0; i < shapes.length; i++)
			{
				if(shapes[i]!=null) {
					String name = shapes[i].getClass().getSimpleName();
					switch (name)
					{
					case CYLINDER:						
						Method m = shapes[i].getClass().getMethod("toString");
						System.out.println(m.invoke(shapes[i]));
						break;
					case CONE:
						break;
					case PYRAMID:
						break;
					case SQUAREPRISM:
						break;
					case TRIANGULARPRISM:
						break;
					case PENTAGONALPRISM:
						break;
					case OCTAGONALPRISM:
						break;
					}
					
					
				}else {
					i=shapes.length;
				}
				
			}

			long stop = System.currentTimeMillis();
			System.out.println("Time: " + (stop - start));
			myReader.close();

		} catch (Exception e)
		{
			throw new FileNotFoundException();
		}
	}

	private Shape[] generateShapesList(String[] array)
	{
		Shape shapes[] = new Shape[Integer.parseInt(array[0])];
		int index = 0;

		for (int i = 1; i < array.length; i++)
		{
			Shape shape = null;
			switch (array[i])
			{
			case CYLINDER:
				shape = new Cylinder(Double.parseDouble(array[++i]), Double.parseDouble(array[++i]));
				break;
			case CONE:
				break;
			case PYRAMID:
				break;
			case SQUAREPRISM:
				break;
			case TRIANGULARPRISM:
				break;
			case PENTAGONALPRISM:
				break;
			case OCTAGONALPRISM:
				break;
			}

			
			if (shape != null)
				shapes[index++] = shape;
			  
			 
		}

		return shapes;
	}

}
