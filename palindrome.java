import java.util.Scanner;
class sample
{
    public static int ispalindrome(int a)
    {
        int sum=0,r,temp=a;
        while(a>0)
        {
            r=a%10;
            sum=sum*10+r;
            a=a/10;
        }
        if(sum==temp)
         return 2;
        else
         return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,res;
        n=sc.nextInt();
        n=Math.abs(n);
        res=ispalindrome(n);
        System.out.println(res);
    }
}