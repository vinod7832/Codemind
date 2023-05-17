import java.util.Scanner;
	class LargestDigits
{
    public static int LargestDigits(int x)
    {
        int r,max=0;
        while(x>0)
	  {
		r=x%10;
		if(r>max)
		 max=r;
		 x=x/10;
	  }
	  return max;
        
    }
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  int n,r,result=0;
	  n=sc.nextInt();
	  result=LargestDigits(n);
	  System.out.println(result);
	  
      }
}
