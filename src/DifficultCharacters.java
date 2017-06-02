import java.util.*;
import java.util.Map.Entry;

/**
 * Created by shahsparx on 14/3/17.
 */
public class DifficultCharacters {
    public static void main(String[] args)
    {

        try
        {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            sc.nextLine();


            while(tc-->0)
            {
                String S = sc.nextLine();
                TreeMap<Character,Integer> hm = new TreeMap();
                hm.put('a',1);
                hm.put('b',1);
                hm.put('c',1);
                hm.put('d',1);
                hm.put('e',1);
                hm.put('f',1);
                hm.put('g',1);
                hm.put('h',1);
                hm.put('i',1);
                hm.put('j',1);
                hm.put('k',1);
                hm.put('l',1);
                hm.put('m',1);
                hm.put('n',1);
                hm.put('o',1);
                hm.put('p',1);
                hm.put('q',1);
                hm.put('r',1);
                hm.put('s',1);
                hm.put('t',1);
                hm.put('u',1);
                hm.put('v',1);
                hm.put('w',1);
                hm.put('x',1);
                hm.put('y',1);
                hm.put('z',1);



                for (int i =0;i<S.length();i++)
                {
                    if (hm.containsKey(S.charAt(i)))
                    {
                        hm.put(S.charAt(i),hm.get(S.charAt(i))+1);
                    }
                    else hm.put(S.charAt(i),1);
                }


                Set<Entry<Character, Integer>> set = hm.entrySet();
                List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
                Collections.sort( list, new Comparator<Map.Entry<Character, Integer>>()
                {
                    public int compare( Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2 )
                    {
                        return (o2.getValue()).compareTo( o1.getValue() );
                    }
                } );
                Collections.reverse(list);
                for(Map.Entry<Character, Integer> entry:list){
                    System.out.print(entry.getKey()+ " ");
                }
                System.out.println();
            }

            }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


}
