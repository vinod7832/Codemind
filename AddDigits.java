import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,sum=0,res=0,a=0;
        while(n>0)
        {
            rem=n%10;
            a=n/10;
            sum=rem+a;
            n=sum;
            if(n<10)
            {
                System.out.println(sum);
                break;
            }
            
            
        }
    }
}