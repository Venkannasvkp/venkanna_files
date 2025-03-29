package com.tnsif.capgemini.C2tcollections;


class venkanna
{
   String name;
   int age;
   
   public venkanna(String name,int age)
   {
	   this.name=name;
	   this.age=age;
   }
   public void display()
   {
	   System.out.println("The name of the person is " +name+ " the Age of the"+age);
   }
}

public class Before$Comparable {

	public static void main(String[] args) 
	{
		  venkanna obj1=new venkanna("Manohar",12);
		  venkanna obj2=new venkanna("Rohith",14);
	        obj1.display();
	        obj2.display();

	}

}
                     