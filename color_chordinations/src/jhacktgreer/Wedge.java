package jhacktgreer;

import java.awt.Color;


public abstract class Wedge 
{
	private int radius;
	private Color color;
	private int red;
	private int green;
	private int blue;
	private static final int THETA = 30;
	private static final int DEFAULT_RADIUS = 65;
	
	public Wedge()
	{
		this.radius = DEFAULT_RADIUS;
		this.red = 0;
		this.green = 0;
		this.blue = 0;
		this.color = new Color(red, green, blue);
	}
	
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	public double calculateArc(int radius, int THETA)
	{
		return (THETA / 360) * 2 * Math.PI * radius;
	}
	
	//finish later
	public void setLabel()
	{
		
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	public Color getColor()
	{
		return color;
	}
}
