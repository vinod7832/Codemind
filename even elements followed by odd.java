    import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,a,x[],A,B;
        a=sc.nextInt();
        x=new int[a];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            if(x[i]%2==0)
            {
                System.out.print(x[i]+" ");
                
            }
        }
        for(i=0;i<a;i++)
        {
             if(x[i]%2!=0)
            {
                System.out.print(x[i]+" ");
                
            }
        }
        
    }
}