package CIRCLE;

public class circle {
	
	public double p;
	public int c, r;
	
	public circle()
	{
		p = 3.1416; 
		r = c = 175958;
	}
	
	public void cambiarvalor(int x)
	{
		x = c; 
	}
	
	public double calcularcircunferencia()
	{
		return (2*p)*c;
	}
	
	public double calculararea()
	{
		return p*(c*c);
	}

}
