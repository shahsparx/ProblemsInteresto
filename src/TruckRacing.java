import java.util.Scanner;

/**
 * Created by shahsparx on 15/4/17.
 */
public class TruckRacing {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-->0)
        {
            int N = sc.nextInt();
            int[] trucks = new int[N];
            for (int i =0;i<N;i++)
            {
                trucks[i]=sc.nextInt();
            }

            int count=0;

            for (int i=1;i<N;i++)
            {
                if (trucks[i]<=trucks[i-1])
                {
                    count++;
                }
                else trucks[i]=trucks[i-1];
            }
            System.out.println(count+1);
        }
    }
}
