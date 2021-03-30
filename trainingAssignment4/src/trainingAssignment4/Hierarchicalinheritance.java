package trainingAssignment4;
import java.util.Scanner;

class Figure {
	float side;
	Scanner sc = new Scanner(System.in);
	void inpt() {
		System.out.println("Enter the side: ");
		side = sc.nextFloat();
	}
}

class Rectangle extends Figure{
	float side2;
	void inp(){
		System.out.println("Enter the side2: ");
		side2 = sc.nextFloat();
	}
	void RectArea() {
		System.out.println("The Area of Rectangle is: "+(side*side2));
	}
	
}

class Triangle extends Figure{
	float height;
	void in() {
		System.out.println("Enter the height: ");
		height = sc.nextFloat();
	}
	void triarea() {
		float a = (float)0.5*side*height;
		System.out.println("The area of the triangle is: " +a);
	}
}

class square extends Figure{
	void SqrArea() {
		System.out.println("Area of the Square is: " +(side*side));
	}
}


public class Hierarchicalinheritance {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.inpt();
		rec.inp();
		rec.RectArea();	
		Triangle t = new Triangle();
		t.inpt();
		t.in();
		t.triarea();
		square s = new square();
		s.inpt();
		s.SqrArea();
	}

}
