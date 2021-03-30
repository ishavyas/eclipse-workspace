package trainingAssignment1;

class student{
	int bookid;
	String bookName;
	static String schoolName;
	static int schoolID;
	float latecharge;
	
}

public class Variables1 {
	public static void main(String args[]) {
		
		student.schoolName = "St.James";
		student.schoolID =1044;
		
		 student John = new student();
		John.bookid =1476;
		John.bookName = "fundamentals of chemistry";
		John.latecharge = 1.99f;
		
		System.out.println("BookId:" + John.bookid);
		System.out.println("BookName:" + John.bookName);
		System.out.println("SchoolName:" + John.schoolName);
		System.out.println("SchoolID:"+ John.schoolID);
		System.out.println("Late Charge:" + John.latecharge);
		System.out.println("===================");
		
		student Jane = new student();
		Jane.bookid = 41785;
		Jane.bookName = "Basics of French";
		Jane.latecharge = 3.99f; 
		System.out.println("BookID:" + Jane.bookid);
		System.out.println("BookName:" + Jane.bookName);
		System.out.println("SchoolName:" + Jane.schoolName);
		System.out.println("SchoolID:" + Jane.schoolID);
		System.out.println("Late Charge:" + Jane.latecharge);
		System.out.println("===================");
	
	}
}
