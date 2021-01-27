package week2;

class Square extends Rectangle {
	double side;

	public Square(double width, double length, double side) {
		super(width, length);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	double getArea() {
		// luas persegi
		return this.side * this.side;
	}

	@Override
	double getPerimeter() {
		// keliling persegi
		return 4 * this.side;
	}
	
	public String toString() {
		return "Square[Rectangle[Shape[color="+ this.color + ", filled=" 
		+ this.filled + ", width=" + this.width + ", length=" + this.length + "]]";
	}
}
