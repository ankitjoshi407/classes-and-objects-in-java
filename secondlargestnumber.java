import java.util.Scanner;
 class secondlargestnumber
 {
 public static void main(String args[])
    {
		Scanner s=new Scanner(System.in);
       System.out.println("Enter size of array");
	   int n=s.nextInt();
       int[]a=new int[n];
	    System.out.print("Enter "+n+" Elements\n");
	   for(int i=0;i<n;i++)
	   {
		   a[i]=s.nextInt();
	   }
	   int temp;
       for(int i=0;i<n-1;i++)
       {
        for(int j=0;j<n-i-1;j++)
		{
			if(a[j+1]<a[j])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			
		}			
       }
	System.out.print("Second largest number is : "+a[n-2]);
	   
    }
 }