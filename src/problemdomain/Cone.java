package problemdomain;

public class Cone extends Shape
{

	private double radius;
	
	
	public Cone()
	{
		// TODO Auto-generated constructor stub
		
	}

	public cone(double height, double radius)
	{
		this.setHeight(height);
		this.radius = radius;
		
		this.calculateBaseArea();
		this.calculateVolume();
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	
	
	@Override
	public int compareTo(Shape o)
	{
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	
		public void calculateBaseArea()
		{	
			this.setBaseArea(Math.PI * (this.getRadius() * this.getRadius()));
		}
		
	

	@Override
	public void calculateVolume()
	{
		this.setVolume (this.getBaseArea()*this.getHeight()/3);
	}

	public int compareTo(Shape shape)
	{		
		return super.compareTo(shape);	
	
	}
	

	public String toString() {
		return String.format("cone radius: %-8.2f %s", this.getRadius(), super.toString());
	}
	
}
}

