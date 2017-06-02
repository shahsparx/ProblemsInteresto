import java.util.*;


/* Shahsparx*/
public class Mode
{

      public static void mode(int a[]){

        LinkedHashSet modes = new LinkedHashSet();


        int maxCount=0;
        for (int i = 0; i < a.length; ++i){
            int count = 0;
            for (int j = 0; j < a.length; ++j){
                if (a[j] == a[i]) ++count;
            }
            if (count > maxCount){
                maxCount = count;
                modes.clear();
                modes.add( a[i] );
            } else if ( count == maxCount ){
                modes.add( a[i] );
            }
        }

        TreeSet tr = new TreeSet();

        Iterator itr = tr.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

    }
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-->0)
        {
            int N = sc.nextInt();
            int[] a = new int[N];
            for (int i =0;i<N;i++)
            {
                a[i]=sc.nextInt();
            }
            mode(a);
            System.out.println();

        }


    }
}
