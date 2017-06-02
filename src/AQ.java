import java.util.Scanner;

/**
 * Created by shahsparx on 23/4/17.
 */
public class AQ {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0)
        {
            int n = sc.nextInt();
            long[] ar = new long[n];
            int count=0;
            for (int i =0;i<n;++i)
            {
                ar[i]=sc.nextInt();
                count+=ar[i];
            }

            long m=sc.nextLong();
            m%=count;
            int ans=0;
            if (m==0)
            {
                for (int i =n-1;i>=0;--i)
                {
                    if (ar[i]!=0)
                    {
                        ans=i;
                        break;
                    }
                }
            }
            else
            {
                for (int i=0;i<n;++i)
                {
                    m-=ar[i];
                    if (m<=0)
                    {
                        ans=i;
                        break;
                    }
                }
            }
            System.out.println(ans+1);

        }

    }
}
