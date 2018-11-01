package chap07.Prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Circle circle1 = new Circle(5, 5, 10);
		
		System.out.println("Circle1 [x]    : "+ circle1.getX());
		System.out.println("Circle1 [Y]    : "+ circle1.getY());
		System.out.println("Circle1 [R]    : "+ circle1.getR());
		System.out.println("Circle1 [AREA] : "+ circle1.getArea());
		System.out.println();
		Circle circle2 = (Circle) circle1.copy();
		
		
		System.out.println("Circle2 [x]    : "+ circle2.getX());
		System.out.println("Circle2 [Y]    : "+ circle2.getY());
		System.out.println("Circle2 [R]    : "+ circle2.getR());
		System.out.println("Circle2 [AREA] : "+ circle2.getArea());
		System.out.println();
		
		
	}
	
}
