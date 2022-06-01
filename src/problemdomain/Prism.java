package problemdomain;

public class Prism extends Shape
{

	private final String SQUARE_PRISM = "SquarePrism";
	private final String TRIANGULAR_PRISM = "TriangularPrism";
	private final String PENTAGONAL_PRISM = "PentagonalPrism";
	private final String OCTAGONAL_PRISM = "OctagonalPrism";
	
	
	private String basePolygon;
	private double edgeLength;
	
	
	
	
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
	 * @return the basePolygon
	 */
	public String getBasePolygon()
	{
		return basePolygon;
	}

	/**
	 * @param basePolygon the basePolygon to set
	 */
	public void setBasePolygon(String basePolygon)
	{
		this.basePolygon = basePolygon;
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
	public void calculateArea()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateVolume()
	{
		// TODO Auto-generated method stub
		
	}

}
