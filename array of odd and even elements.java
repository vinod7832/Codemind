import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,x[],n;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%2!=0)
                System.out.print(x[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%2==0)
                System.out.print(x[i]+" ");
        }
    }
}