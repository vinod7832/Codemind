import java.util.Scanner;
class count elements notdivisibleby k in array
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,n,x[],k,count=0;
        n=sc.nextInt();
        k=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%k>=1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}