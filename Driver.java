
public class Driver {

	public static void main(String[] args) 
	{   
		
		
		Rectangle rec = new Rectangle();
		rec.setWidth(10);
		rec.setHeight(5);
		System.out.println("Rectangle Area: " + rec.toString());
		
		Circle ci = new Circle();
		ci.setRadius(10);
		System.out.println("Radius: " + ci.getArea());
		
		Ellipse el = new Ellipse();
		System.out.println("Ellipse: " + el.getArea());
	}

}
