import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shahsparx on 23/4/17.
 */
public class LegendOfTanmay {

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int tc= sc.nextInt();
        while (tc-->0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            long mxp=0,mnp=0,p;

            if (n>1)
            {
                int temp=-1,e=1;
                p=arr[0];
                for (int i =0;i<n;i++)
                {
                    if (p==0)
                    {
                        p=arr[i];
                        e=0;
                    }
                    else if(i>0&&arr[i]!=0)
                    {
                        p = p*arr[i];
                        e++;
                    }
                    if (arr[i]<0)
                        temp++;
                }

                if (p>0)
                {
                    mxp = p;
                    if (temp>0)
                        mnp=p/arr[temp];
                    else mnp = arr[0];
                }
                else if(p<0)
                {
                    if (e>1)
                        mxp = p/arr[temp];
                    else
                        mxp=0;
                    mnp=p;
                }
                else if(p==0)
                {
                    mxp=p;
                    mnp=p;
                }
            }
            else
            {
                mxp=arr[0];
                mnp=arr[0];
            }
            System.out.println(mxp+" "+ mnp);
        }
    }
}
