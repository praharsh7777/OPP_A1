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
	private double area;
	private double volume;
		
	public abstract void calculateArea();
	public abstract void calculateVolume();
	
	
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getArea()
	{
		return area;
	}
	public void setArea(double area)
	{
		this.area = area;
	}
	
	public double getVolume()
	{
		return volume;
	}
	public void setVolume(double volume)
	{
		this.volume = volume;
	}
		
	
}
