import java.util.Scanner;
class sample
{
    public static boolean ispalindrome(int a)
    {
        int sum=0,r,temp=a;
        while(a>0)
        {
            r=a%10;
            sum=sum*10+r;
            a=a/10;
        }
        if(sum==temp)
         return true;
        else
         return false;
    }
    
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
        int n,i;
        n=sc.nextInt();
        // n=Math.abs(n);
        for(i=n+1;;i++)
        {
            if((ispalindrome(i)) && (isprime(i)))
            {
                System.out.print(i);
                break;
            }
        
        }
    }
}