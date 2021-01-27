package week2;

class Rectangle extends Shape{
	protected double width = 1.0;
	protected double length = 1.0;

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	double getArea() {
		// luas persegi panjang
		return this.width * this.length;
	}

	@Override
	double getPerimeter() {
		// keliling persegi panjang
		return 2 * (this.width + this.length);
	}
	
	public String toString() {
		return "Reactangle[Shape[color="+ this.color + ", filled=" 
		+ this.filled + ", width=" + this.width + ", length=" + this.length + "]";
	}
	
}
