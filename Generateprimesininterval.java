import java.util.Scanner;
class sample
{
    public static boolean isprime(int a)
    {
        if(a==1)
        return false;
        int count=0;
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            count++;
        }
        if(count==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(isprime(i))
            {
                System.out.println(i);
            }
        }
        
    }
}