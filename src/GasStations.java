import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shahsparx on 4/5/17.
 */
public class GasStations {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int X =sc.nextInt();
        ArrayList al = new ArrayList();
        for (int i =0;i<N;i++)
        {
            int temp = sc.nextInt();
            X=X-temp;
            if (X>0)
            {
                al.add(temp);
            }
            else
            {
                System.out.println(al.size()+1);
                break;
            }

        }



    }
}
