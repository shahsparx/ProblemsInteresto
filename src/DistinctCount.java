import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Created by shahsparx on 17/3/17.
 */
public class DistinctCount {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-->0)
        {
            int N = sc.nextInt();
            int dis = sc.nextInt();
            LinkedHashSet lhs= new LinkedHashSet();

            for (int i =0;i<N;i++)
            {
                lhs.add(sc.nextInt());
            }

            if (lhs.size()==dis)
            {
                System.out.println("Good");
            }
            if(lhs.size()<dis)
            {
                System.out.println("Bad");
            }
            else if(lhs.size()>dis) System.out.println("Average");
        }
    }
}
