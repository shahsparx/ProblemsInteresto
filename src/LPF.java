import java.util.Scanner;

/**
 * Created by shahsparx on 15/4/17.
 */
public class LPF {
    public static void main(String[] arhs) throws Exception
    {
        try {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-->0)
            {
                int i;
                long num = sc.nextLong();

                for (i=2;i<=num;i++)
                {
                    if (num%i==0)
                    {
                        num/=i;
                        i--;
                    }
                }

                System.out.println(i);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
