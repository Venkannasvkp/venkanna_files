package Basicsprograms;
import java.util.Scanner;
public class SumofNaturalNumbers 
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number:");
		int N= scanner.nextInt();	
		scanner.close();
		int sum=N*(N+1)/2;
		System.out.print("The Sum of the NUmber"+N+ "the total is:"+sum);
		}
} 