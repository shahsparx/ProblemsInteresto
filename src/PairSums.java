import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by shahsparx on 15/3/17.
 */
public class PairSums {

    public static void main(String[] argss)
    {
        try{
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int sum = sc.nextInt();
            int[] arr = new int[size];
            String flag = "NO";
            /*for (int i = 0;i<size;i++)
            {
                arr[i]= sc.nextInt();
            }

            String flag = "NO";
            for (int i =0;i<size;i++)
            {
                for (int j = i+1;j<size;j++)
                {
                    if (sum-arr[i]==arr[j])
                    {
                        flag = "YES";
                    }
                }
            }
            */

            HashMap<Integer,Integer>  hm= new HashMap<>();

            for (int i =0;i<size;i++)
            {
                int temp = sc.nextInt();
                if (hm.containsKey(temp)) {
                    flag = "YES";
                    break;
                }
                else
                {
                hm.put(sum-temp,temp);}
            }



            System.out.println(flag);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }


}
