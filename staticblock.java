class demo
{
	static double i;
	static
	{
		i=5.5;
		System.out.println("Invoked Static block and value of i : "+i); 
	}
}
public class staticblock
{
	public static void main(String x[])
	{
		demo d=new demo();
	}
}