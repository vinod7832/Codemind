import java.util.Scanner;
class smaple
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        while(n<0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        //System.out.println(sum);
        System.out.println(sum);
    }
}