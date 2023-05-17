import java.util.Scanner;
class sample
{
    public static boolean isprime(int n)
    {
        int count=0;
        if(n==1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==0)
            return true;
        else
            return false;
    }
    public static boolean Digit(int n)
    {
        int d=0;
        while(n>0)
        {
            d=n%10;
            if(d!=2&&d!=3&&d!=5&&d!=7)
            return false;
            n=n/10;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int rem,sum=0,res;     
        if(isprime(n)&&Digit(n))
            System.out.println("Mega Prime");
        else
            System.out.println("Not Mega Prime");
    }
}