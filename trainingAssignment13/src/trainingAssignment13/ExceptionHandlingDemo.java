package trainingAssignment13;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the String");
			String s = sc.next();
			System.out.println("Enter the value of a and b: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a/b);
			System.out.println(s.charAt(a));
		}
		catch(NullPointerException np) {
			np.printStackTrace();
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
