import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * Created by shahsparx on 21/4/17.
 */
public class Divs {

    public static int[] div(int[] a,int num)
    {
        for (int i=0;i<a.length;i++)
        {
            a[i]/=num;
        }
        return a;

    }
    public static void main(String[] args)
    {
        try {
            Scanner sc = new Scanner(System.in);
            int N=sc.nextInt();
            int[] arr = new int[N];

            for (int i =0;i<N;i++)
            {
                arr[i]=sc.nextInt();
            }

            int d = sc.nextInt();

            for (int i=0;i<d;i++)
            {
                int n = sc.nextInt();
                arr=div(arr,n);
            }

            for (int i =0;i<N;i++)
            {
                System.out.print(arr[i]+" ");
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
