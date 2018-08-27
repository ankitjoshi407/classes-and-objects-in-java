import java.util.*;
class waveform
{
	public static void main(String ar[])
		{
		Scanner scan=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
			{
			a[i]=scan.nextInt();
			}
		for(int i=0;i<(a.length-1);i=i+2)
			{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			}
		for(int i=0;i<a.length;i++)
			{
			
			System.out.print(a[i]+" ");
			}
		}
}