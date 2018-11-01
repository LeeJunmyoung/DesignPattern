package chap07.Prototype;

public class Circle extends Shape {

	public Circle(int x,int y, int r) {
		this.x=x;
		this.y=y;
		this.r=r;
	}
	
	public int r;
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}

	@Override
	public long getArea() {
		// TODO Auto-generated method stub
		
		return  (long) ((r*r)*3.14);
	}
	
	public Shape copy() throws CloneNotSupportedException{
		
		Shape shape = (Circle)clone();
		
		shape.setX(this.x+1);
		shape.setY(this.y+1);
		
		return shape;
	}

}
