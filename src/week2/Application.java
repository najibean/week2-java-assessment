package week2;

public class Application {
	public static void main(String[] args) {
		
		Circle lingkaran = new Circle(1);
		lingkaran.setRadius(6);
		System.out.println(lingkaran.getRadius());
		System.out.println(lingkaran.getArea());
		System.out.println(lingkaran.getPerimeter());
		System.out.println(lingkaran.toString());
		
		Rectangle persegi = new Rectangle(1, 1);
		persegi.setWidth(5);
		persegi.setLength(3);
		System.out.println(persegi.getWidth());
		System.out.println(persegi.getLength());
		System.out.println(persegi.getArea());
		System.out.println(persegi.getPerimeter());
		System.out.println(persegi.toString());
		
		Square kotak = new Square(1, 1, 1);
		kotak.setSide(2);
		kotak.setWidth(4);
		kotak.setLength(6);
		System.out.println(kotak.getSide());
		System.out.println(kotak.getArea());
		System.out.println(kotak.getPerimeter());
		System.out.println(kotak.toString());
	}
}
