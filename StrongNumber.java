import java.util.Scanner;
class StrongNumber
{
    public static int isfact(int n)
    {
        int i=1, fact=1;
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,r=0,fact=0,temp=n,res=0;
        while(n!=0)
        {
            r=n%10;
            fact=isfact(r);
            sum=sum+fact;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("The number 145 is a strong number");
        else
            System.out.println("The number 100 is not a strong number");
    }
}