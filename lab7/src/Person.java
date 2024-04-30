
public class Person {
	
	private int height;
	private int age;
	private boolean isMale;
	
	public int getHeight() {
		
		return height;
	}
	
	public void setHeight(int height) {
		
		this.height = height;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	public boolean getIsMale() {
		
		return true;
	}
	
	public void getIsMale(boolean isMale) {
		
		this.isMale = isMale;
	}
	
	public String toString() {
		
		return "Height: " + height + " cm, age: " + age + " years, " + ((isMale) ? "male" : "female");
	}
	
	public Person (int height, int age, boolean isMale) {
		super();
		this.height = height;
		this.age = age;
		this.isMale = isMale;
	}
		
		
}

   