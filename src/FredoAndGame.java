import java.util.Scanner;

/**
 * Created by shahsparx on 22/4/17.
 */
public class FredoAndGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0)
        {
            int ammo = sc.nextInt();
            int obs = sc.nextInt();
            int[] obsarr = new int[obs];

            for (int i =0;i<obs;i++)
            {
                obsarr[i]=sc.nextInt();
            }
            for (int i =0;i<obs;i++)
            {

                if (i==obs-1)
                {
                    System.out.println("Yes "+ammo);
                }
            }

        }
    }
}
