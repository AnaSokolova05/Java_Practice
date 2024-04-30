
public class Rectangle extends Shape
{
	private int width;
    private int height;
    
 @Override
 public String toString() 
{
	 return "Rectangle with a width of " + width + ", a height of " + height +", " + super.toString();
}

// constructor 
 Rectangle()
{
	 super(4);
}

public int getWidth()
{
	return width;
}

public void setWidth(int width)
{
	this.width = width;
}

public int getHeight()
{
	return height;
}

public void setHeight(int height)
{
    this.height = height;
}

@Override
public int getArea()
{
	return width * height;
}

}

