package test2;
import java.util.*;
public class test2 {
	//import java.util.*;
	    public static void main(String args[] ) throws Exception {
	        /* Sample code to perform I/O:
	         * Use either of these methods for input

	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = br.readLine();                // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        //Scanner
	        Scanner s = new Scanner(System.in);
	        String name = s.nextLine();                 // Reading input from STDIN
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

	        */

	        // Write your code here
	        Scanner sc = new Scanner(System.in);
	        int tstCase = sc.nextInt();
	        int []comp1 = new int[]{0,12,11,10,9,8,7,6,5,4,3,2,1};
	        for(int i = 0; i<tstCase; i++){
	            int n = sc.nextInt();
	            int m = n % 12;
	            int d = n/12;
	            int seat = 0;
	            if(m != 0) {
	            	seat = (12*d) + comp1[m];
	            }
	            else {
	            	seat = (12*d)-11;
	            }
	            int t = n % 6;
	            String type = "";
	            if(t == 0 || t == 1){
	                type = "WS";
	            } else if(t == 2 || t == 5){
	                type = "MS";
	            }
	            else{
	                type = "AS";
	            }

	            System.out.println(seat + " " + type);         
	       }      
	  }
}
