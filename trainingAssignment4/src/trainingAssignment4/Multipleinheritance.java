package trainingAssignment4;
import java.util.Scanner;

class Shape{
	float length;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter the length: ");
		length = sc.nextFloat();
	}	
}

class Area extends Shape{
	float breadth;
	void arinput() {
		System.out.println("Enter the breadth: ");
		breadth = sc.nextFloat();
	}
	void Shapearea() {
		System.out.println("The area of the shape is: "+(length*breadth));
	}
}


class Volume extends Area{
	float height;
	void volinput() {
		System.out.println("Enter the value of height: ");
		height = sc.nextFloat();
	}
	void ShapeVolume() {
		System.out.println("The volume of the shape is: " +(length*breadth*height));
	}
}


public class Multipleinheritance {

	public static void main(String[] args) {
		Volume vol = new Volume();
		vol.input();
		vol.arinput();
		vol.Shapearea();
		vol.volinput();
		vol.ShapeVolume();

	}

}
