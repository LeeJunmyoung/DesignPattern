package chap07.Prototype;

public abstract class Shape implements Cloneable {

	public int x;// x 축 
	
	public int y;// y 축
	
	public Shape clone() throws CloneNotSupportedException{
		return (Shape) super.clone();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	abstract public long getArea();
}
