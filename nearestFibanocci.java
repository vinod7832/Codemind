import java.util.Scanner;
class fibanocci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        n=sc.nextInt();
        c=a+b;
        while(n>0)
        {
            a=b;
            b=c;
            c=a+b;
            if(c>n)
            {
                if(c-n>n-b)
                {
                    System.out.println(b);
                    break;
                }
                if(c-n<n-b)
                {
                    System.out.println(c);
                    break;
                }
                else
                {
                    System.out.println(b+" "+c);
                    break;
                }
            }
        }
    }
}