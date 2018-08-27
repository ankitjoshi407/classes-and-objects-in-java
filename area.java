 class Rectangle
{
	int length=10,breadth=20;
	double area;
	void CalculateArea()
		{
		area=length*breadth;
		System.out.println(area);
		}
}
class area
{
	public static void main(String ar[])
		{
		Rectangle r=new Rectangle();
		r.CalculateArea();
		}
}