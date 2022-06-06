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
		
		this.calculateBaseArea();
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
	public void calculateBaseArea()
	{	
		this.setBaseArea(Math.PI * (this.getRadius() * this.getRadius()));
	}

	@Override
	public void calculateVolume()
	{
		this.setVolume(this.getBaseArea()*this.getHeight());
	}

	@Override
	public int compareTo(Shape shape)
	{		
		return super.compareTo(shape);	
	}

	
	public String toString() {
		return String.format("Cylinder Radius: %-8.2f %s", this.getRadius(), super.toString());
	}
	
}
