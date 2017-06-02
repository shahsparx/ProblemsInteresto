import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shahsparx on 15/4/17.
 */
public class SMPSEQ3 {
    public static void main(String[] arhs) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[n];
        ArrayList al = new ArrayList();
        for (int i =0;i<n;i++)
        {
            S[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        for (int k = 0;k<m;k++)
        {
            al.add(sc.nextInt());
        }

        for (int i = 0; i<n;i++)
        {
            if (!al.contains(S[i]))
            {
                System.out.print(S[i] + " ");
            }
        }

    }
}
