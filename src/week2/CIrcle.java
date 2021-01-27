package week2;

class Circle extends Shape {
	// radius == jari-jari lingkaran
	private double radius = 1.0;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		// luas lingkaran
		return this.radius * this.radius * 3.14;
	}
	
	@Override
	double getPerimeter() {
		// keliling lingkaran
		return this.radius * 2 * 3.14;
	}
	
	public String toString() {
		return "Circle[Shape[color="+ this.color + ", filled=" 
		+ this.filled + ", radius=" + this.radius + "]";
	}
	
}
