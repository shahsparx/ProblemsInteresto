import java.util.*;

/**
 * Created by shahsparx on 14/3/17.
 */
public class MaximumOccurence {
    public static void main(String[] args)
    {

        try
        {
            Scanner sc = new Scanner(System.in);
            String S = sc.nextLine();

            TreeMap<Character,Integer> hm = new TreeMap();

            for (int i =0;i<S.length();i++)
            {
                if (hm.containsKey(S.charAt(i)))
                {
                    hm.put(S.charAt(i),hm.get(S.charAt(i))+1);
                }
                else hm.put(S.charAt(i),1);
            }

            char c = Collections.max(hm.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
            System.out.println(c + " " + hm.get(c));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


}
