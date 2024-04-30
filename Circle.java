
public class Circle extends Shape
{
	private int radius;
	
@Override
public String toString() {
	return "Circle with a radius of " + radius + ", " + super.toString();
}

//Constructor
Circle() 
{
	super(1);
}
public int getRadius()
{
	return radius;
}

public void setRadius(int radius)
{
	this.radius = radius;
}

@Override
public int getArea() 
{
	return (int) (Math.PI * radius * radius);
}

}
