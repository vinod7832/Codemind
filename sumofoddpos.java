import java.util.Scanner;
class sumofoddpos
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,x[],sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=n-1;i>0;i--)
        {
            if(i%2!=0)
            {
                sum=sum+x[i];
            }
        }
        System.out.println(sum);
    }
}