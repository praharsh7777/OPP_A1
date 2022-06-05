package problemdomain;

public class Cylinder extends Shape
{
	
	private double radius;

	public Cylinder()
	{
		// TODO Auto-generated constructor stub
	}
	
	public Cylinder(double height, double radius)
	{
		this.setHeight(height);
		this.radius = radius;
		
		this.calculateArea();
		this.calculateVolume();
	}

	
	/**
	 * @return the radius
	 */
	public double getRadius()
	{	
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius)
	{
		this.radius = radius;
	}



	
	@Override
	public void calculateArea()
	{	
		this.setArea(Math.PI * (this.getRadius() * this.getRadius()));
	}

	@Override
	public void calculateVolume()
	{
		this.setVolume(this.getArea()*this.getHeight());
	}

	@Override
	public int compareTo(Shape o)
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
