package basicsofjava;

public class variableexample {
	
	int id=20;
	//instance variable
	void print()
	{
		String msg="hi friend";
		System.out.println(msg);
		//local variable
	}
	static String message="hello svkp";

	public static void main(String[] args) 
	{
		variableexample obj=new variableexample();
		System.out.println(obj.id);
		obj.print();
		System.out.println(message);
		
	}

}
