package manager;

import exceptions.InvalidArgumentException;

public class SortManager
{
	private final String SORT = "-s";
	private final String COMPARE = "-t";
	private final String FILENAME = "-f";

	private String sortType = "";
	private String compareType = "";
	private String filename = "";

	public SortManager(String args[])
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

		} catch (InvalidArgumentException e)
		{
			System.out.println(e.getMessage());
			return;
		}

		// Do Sorting

		//test
		System.out.println("File name :" + this.filename);
		System.out.println("Sort type :" + this.sortType);
		System.out.println("Compare type :" + this.compareType);
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
			throw new InvalidArgumentException(String.format("Sort type (%s) unknown. Please select (b)Bubble, (s)Selection, (m)Merge, (q)Quick or (z)Custom.", type));
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
		default:
			return "Compare type";
		}
	}

}
