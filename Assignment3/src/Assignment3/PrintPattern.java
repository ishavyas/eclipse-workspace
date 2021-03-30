package Assignment3;

import java.util.Scanner;

class Triangle{
	int logic(int i){
	        if (i == 0)
	            return 1;
	        else
	        	return i * logic(i - 1);
	 }
	
	 void Display(int n) {
		 for (int i = 0; i <= n; i++) {
	            for(int j = 0; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for(int j = 0; j <= i; j++) {
	            	System.out.print(" " +(logic(i)/(logic(i - j)*logic(j))));
		        }
	            System.out.println();
	        }
	 }
}

class PrintPattern {
   
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        Triangle t = new Triangle();
        t.Display(n);
        
    }
}