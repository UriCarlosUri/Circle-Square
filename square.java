package CIRCLE;

public class square {
	
	public int b; 
	
	public square()
	{
	}
	
	public void cambiarvalor(int y)
	{
		y = b;
	}
	public double calcularperimetro()
	{
		return b*4;
	}
	public double calculararea()
	{
		return b*b; 
	}
	public Object calculardiagonal()
	{
		return sqrt((b*b)+(b+b));
	}

	private Object sqrt(int i) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
