import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,a,x[],A,B,sum=0;
        a=sc.nextInt();
        x=new int[a];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        A=sc.nextInt();
        B=sc.nextInt();
        for(i=0;i<a;i++)
        {
            if(x[i]<A || x[i]>B)
                sum=sum+x[i];
        }
        System.out.print(sum);
    }
}