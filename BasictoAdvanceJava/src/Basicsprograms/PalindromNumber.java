package Basicsprograms;
import java.util.Scanner;
public class PalindromNumber
{
	public static boolean isPalindrom(int N)
	{
		int original=N,reversed=0;
		while(N>0)
		{
			int digit=N%10;
			reversed=reversed*10+digit;
			N/=10;
		}
		return original==reversed;			
	}
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the numbber:");
		int N=scanner.nextInt();
		scanner.close();
		
		System.out.print("is palidrom:" +isPalindrom(N));
	}
}

