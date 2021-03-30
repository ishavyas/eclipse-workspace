package test1;
import java.util.*;

public class test {
		public static void main(String args[] ) throws Exception {
			Scanner inputData = new Scanner(System.in);
		    int tstCase = inputData.nextInt();
		    if(tstCase>0 && tstCase<11){
		    	System.out.println("through first if");
		        for(int i = 1; i<=tstCase; i++){
		        	System.out.println("through outer for " + i);
		            int grCost = inputData.nextInt();
		            int purpCost = inputData.nextInt();
		            int n = inputData.nextInt();
		            int baln1 = 0, baln2 = 0, finalCost=0;
		            for(int j = 0; j<n; j++){
		            	System.out.println("through inner for " + j);
		                if(inputData.nextInt()==1){
		                    baln1++;
		                }
		                if(inputData.nextInt()==1){
		                    baln2++;
		                }
		            
		            }
		            int g1p2 = (baln1*grCost) + (baln2*purpCost);
		            int g2p1 = (baln1*purpCost) + (baln2*grCost);
		            
		            System.out.println("Case one: " + g1p2);
		            
		            System.out.println("Case two: " + g2p1);
		            
		            if(g1p2<g2p1){
		                finalCost = g1p2;
		            }
		            else{
		                finalCost = g2p1;
		            }
		            System.out.println(finalCost);
		      }
		    }
	  } 
}        
