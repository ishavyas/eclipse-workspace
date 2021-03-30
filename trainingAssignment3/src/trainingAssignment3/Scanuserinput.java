package trainingAssignment3;
import java.util.Scanner;

class student{
	int bookid;
	String bookName;
	static String schoolName;
	static int schoolID;
	float latecharge;
	
}

public class Scanuserinput {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter the SchoolName:");
		student.schoolName = s.next();
		System.out.println("Enter the SchoolID:");
		student.schoolID = s.nextInt();	
		
		
		student John = new student();		
		System.out.println("Enter the BookId:");
		John.bookid = s.nextInt();
		System.out.println("Enter the BookName:");
		John.bookName = s.next();
		System.out.println("Enter the LateCharge:");
		John.latecharge = s.nextFloat();
		
		System.out.println("BookId:" + John.bookid);
		System.out.println("BookName:" + John.bookName);
		System.out.println("SchoolName:" + John.schoolName);
		System.out.println("SchoolID:"+ John.schoolID);
		System.out.println("Late Charge:" + John.latecharge);
		System.out.println("===================");
		
		student Jane = new student();
		System.out.println("Enter the BookId:");
		Jane.bookid = s.nextInt();		
		System.out.println("Enter the BookName:");
		Jane.bookName = s.next();	
		System.out.println("Enter the LateCharge:");
		Jane.latecharge = s.nextFloat();
		
		System.out.println("BookID:" + Jane.bookid);
		System.out.println("BookName:" + Jane.bookName);
		System.out.println("SchoolName:" + Jane.schoolName);
		System.out.println("SchoolID:" + Jane.schoolID);
		System.out.println("Late Charge:" + Jane.latecharge);
		System.out.println("===================");
	
	}
}
