import java.util.Scanner;
class sample
{
    public static boolean ispalindrome(int n)
    {
        int rem=0,sum=0,temp=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(sum==temp)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[];
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(ispalindrome(x[i]))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}