import java.util.Scanner;
	class SmallestDigits
{
    public static int SmallestDigits(int x)
    {
        int r,min=9;
        while(x>0)
	  {
		r=x%10;
		if(r==0)
		{
		  min=r;
		  break;
		}
		if(r<min)
		 min=r;
		 x=x/10;
	  }
	  return min;
        
    }
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  int n,r,result=0;
	  n=sc.nextInt();
	  result=SmallestDigits(n);
	  System.out.println(result);
	  
      }
}
