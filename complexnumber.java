import java.util.Scanner;
class Complex
{
	 double real,imag;
	 void setdata(double r,double i)
	 {
		 real=r;
		 imag=i;
	 }	
	
     void getdata()
	 {
		 
		System.out.println("The complex number : "+real+" +i"+imag ); 
	 }		 
	
}

class complexnumber
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter real part");
		double r=s.nextDouble();
			System.out.println("Enter Imaginary part");
		double i=s.nextDouble();
		Complex c=new Complex();
		c.setdata(r,i);
		
		c.getdata(); 
		
		
		
	}
	
	
	
}