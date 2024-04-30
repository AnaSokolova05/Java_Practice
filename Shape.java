abstract class Shape {
	
	private int sides;
	
@Override
public String toString() 
{
	return "area is " + getArea() + ", the number of sides is " + sides;
}
 
 public int getSides() 
 {
	 return sides;
 }
 
 public void setSides(int sides) 
 {
	 this.sides = sides;// use this sides to distinguish between parameter and attribute.
 }
 
 abstract public int getArea();
 
 
 //Constructor
 Shape(int sides) 
 {
	 this.sides = sides;
 }

}