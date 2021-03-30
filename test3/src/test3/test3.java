package test3;

import java.util.*;

public class test3 {
	public static void main(String args[] ) throws Exception {
		 Scanner io = new Scanner(System.in);
	        int n = io.nextInt();
	        String s = io.nextLine();
		    if(s.contains("HH")){
	            System.out.println("NO");
		    } 
	        else if(s.contains(".")) {
	            s = s.replace('.', 'B');
	            System.out.println("YES");
	            System.out.println(s);
	        }
	        else if(s.contains("H")) {
	            System.out.println("YES");
	            System.out.println(s);
		        }
	}
	       

}
