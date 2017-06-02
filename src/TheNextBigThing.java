import java.util.Scanner;

/**
 * Created by shahsparx on 22/3/17.
 */
public class TheNextBigThing {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();

        while (tc-->0)
        {
            int count=0;
            String s = sc.nextLine()+" ";
            char[] ch = s.toCharArray();


            for (int i =0;i<s.length()-1;i++)
            {
                if (ch[i]=='O'&&ch[i+1]=='R')
                {
                   count++;
                }
            }

            System.out.println(count);
        }
    }
}
