package problemdomain;

public class Prism extends Shape
{
	private double edgeLength;
		
	//SquarePrism, TrianglarPrism, PentagonalPrism, OctagonalPrism
	
	public Prism()
	{
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public int compareTo(Shape o)
	{
		// TODO Auto-generated method stub
		return 0;
	}



	/**
	 * @return the edgeLength
	 */
	public double getEdgeLength()
	{
		return edgeLength;
	}

	/**
	 * @param edgeLength the edgeLength to set
	 */
	public void setEdgeLength(double edgeLength)
	{
		this.edgeLength = edgeLength;
	}

	@Override
	public void calculateBaseArea()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateVolume()
	{
		// TODO Auto-generated method stub
		
	}

}
