/**
 * 
 */
package problemdomain;

/**
 * @author barab
 *
 */
public abstract class Shape implements Comparable<Shape>
{

	private double height;
	private double baseArea;
	private double volume;
		
	public abstract void calculateBaseArea();
	public abstract void calculateVolume();
	
	
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getBaseArea()
	{
		return baseArea;
	}
	public void setBaseArea(double baseArea)
	{
		this.baseArea = baseArea;
	}
	
	public double getVolume()
	{
		return volume;
	}
	public void setVolume(double volume)
	{
		this.volume = volume;
	}
		
	@Override
	public int compareTo(Shape shape) {
		if( this.height > shape.height )
		{
			return -1;
		}
		else if( this.height < shape.height )
		{
			return +1;
		}
		else
		{
			return 0;
		}	
	}
	
	public String toString() {
		return String.format("Height:%-8.2f Base Area: %-8.2f Volume: %-8.2f", this.getHeight(), this.getBaseArea(), this.getVolume());
	}
	
}
