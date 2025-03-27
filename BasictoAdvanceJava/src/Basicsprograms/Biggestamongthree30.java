package Basicsprograms;

public class Biggestamongthree30 
{
	public static void  Biggest(int x,int y,int z)
	{
		if(x>y && x>z)
		{
			System.out.println("A is Biggest");
		}
		if(y>x && y>z)
		{
			System.out.println("B is Biggest");
		}
		else
		 {
			System.out.println("c is the Biggest");
		        }
			}
		public static void main(String[] args) 
		{
			 int a=20, b=45,c=15; 
			 Biggest(a,b,c);
			 
		}
}
