import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,square,r=0,sum=0,Digit=0;
        n=sc.nextInt();
        square=n*n;
        while(square>0)
        {
            Digit=square%10;
            sum=sum+Digit;
            square=square/10;
        }
        
        if(n==sum)
         System.out.println("Neon Number");
        else
         System.out.println("Not Neon Number");
    }
}