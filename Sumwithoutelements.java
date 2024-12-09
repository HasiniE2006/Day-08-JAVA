import java.util.*;
public class Sumwithoutelements 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=0,s=0;
        for(int i=1;i<=n;i++)
        {
            s+=i;
            a[k]=s;
            k++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("sum="+a[n-1]);
    }
}
