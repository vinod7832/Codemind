import java.util.Scanner;
class primesinrange
{
	public static boolean isprime(int x)
	{
	int count=0;
	for(int i=2;i<=(int)Math.sqrt(x);i=i+1)
	{
	if(x%i==0)
	  count=count+1;
	}
	if(count==0)
		return true;
	else
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,i;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a==1)
		  a=2;
		for(i=a;i<=b;i++)
		{
		if(isprime(i))	 	
		System.out.println(i);  
	      }
	}
}
		