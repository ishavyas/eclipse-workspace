package Assignment4;

import java.util.Scanner;

class Rotate{

	void display(int ar[]) {
		System.out.println("Array before Rotation: ");
		for (int i = 0; i < ar.length; i++) {     
			System.out.print(ar[i] + " ");    
		}
	}
	
	void rotateright(int ar[], int k) {
		
		for(int i = 0; i < k; i++){        
			int temp = ar[ar.length-1];       
			for(int j = ar.length-1; j > 0; j--){     
				ar[j] = ar[j-1];    
			}      
			ar[0] = temp;    
		}   
		
		System.out.println();      
		System.out.println("Array after Rotation: ");    
		for(int i = 0; i< ar.length; i++){    
			System.out.print(ar[i] + " ");    
		}    
	}    
}
public class ArrayRotation{
	public static void main(String[] args) {
		Rotate r = new Rotate();
		int [] ar = new int [] {1, 2, 3, 4, 5, 6};     
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of places the array has to be rotated");
		n = sc.nextInt();
		r.display(ar);
		r.rotateright(ar, n);
	}
}