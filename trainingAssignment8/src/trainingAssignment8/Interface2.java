package trainingAssignment8;

interface polygon1{
	int side = 4;
	
}
interface polygon2{
	int side = 5;
}

class Circle implements polygon1{
	void area () {
		float ar = (float) (3.14* side *side);
		System.out.println("Area of Circle is: "+ar);
	}
}

class polyAr implements polygon1,polygon2{
	void polyarea() {
		System.out.println("The length of the side is: " +polygon1.side);
		System.out.println("The length of the side is: " +polygon2.side);
		System.out.println("The area of the polygon is: " +(polygon1.side * polygon2.side));
	}
}

public class Interface2 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.area();
		polyAr p = new polyAr();
		p.polyarea();

	}

}
