import java.util.Scanner;

/**
 * Created by shahsparx on 15/4/17.
 */
public class IntervalC {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0)
        {
            int N = sc.nextInt();
            int L = sc.nextInt();
            int R = sc.nextInt();

            int[] primes = new int[N];
            for (int i = 0;i<N;i++)
            {
                primes[i]=sc.nextInt();
            }

            int count = 0;
            for (int i = L;i<=R;i++)
            {
                for(int j=0;j<N;j++)
                {
                    if (i%primes[j]==0)
                    {
                        count++;
                    }
                }
            }
        }
    }
}
