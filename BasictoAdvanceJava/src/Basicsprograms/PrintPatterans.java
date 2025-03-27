package Basicsprograms;
import java.util.*;

public class PrintPatterans 
{
   public static void print(int n)
   {
	   
      int i,j;
      
      for(i=1; i<=n; i++)
      {
    	for(j=1; j<=i; j++)  
    	{
    		System.out.println(j + " ");
    	}
    	System.out.println();
      }
	   
   }
   
	public static void main(String[] args) 
	{
		int n =6;
		print(n);
		
	}
}