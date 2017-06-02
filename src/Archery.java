import java.util.Scanner;

/**
 * Created by shahsparx on 4/5/17.
 */
public class Archery {
    public static long gcd(long a, long b)
    {
        if (b==0)
            return a;
        return gcd(b,a%b);
    }
    public static long lcm(long[] a,int n)
    {
        long res =1;
        for (int i=0;i<n;i++)
        {
            res = res*a[i]/gcd(res,a[i]);
        }
        return res;
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc= new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-->0)
        {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            System.out.println(lcm(a,n));
        }
    }
}
