import java.util.Scanner;

/**
 * Created by shahsparx on 21/4/17.
 */
public class GoodTimesBadTimes {

    static int prime[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};

    static int good[][][]=new int[24+1][60+1][60+1];
    static int bad[][][]=new int[24+1][60+1][60+1];

    public static void sol()
    {
        int i,j,k,p;
        int n=0,t=0;

        for (i=23;i>=0;i--)
        {
            for (j=59;j>=0;j--)
            {
                for (k=59;k>=0;k--)
                {
                    good[i][j][k]=n;
                    bad[i][j][k]=t;

                    boolean f= true;
                    for (p=0;p<=16;p++)
                    {
                        if (i%prime[p]==0&&j%prime[p]==0&&k%prime[p]==0)
                        {
                            bad[i][j][k]++;
                            t++;
                            f=false;
                            break;
                        }
                    }
                    if (f)
                    {
                        good[i][j][k]++;
                        n++;
                    }

                }
            }
        }
    }
    public static int gcd(int a,int b)
    {
        if (a==0||b==0)
        {
            return a+b;
        }
        if (a>b)
        {
            return gcd(b,a%b);
        }
        else
        {
            return gcd(a,b%a);
        }
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sol();
        while (tc-->0)
        {
            int h,m,s;
            h = sc.nextInt();
            m=sc.nextInt();
            s=sc.nextInt();

            int b=bad[h][m][s];
            int g = good[h][m][s];
            int k = (b==0||g==0)?1:gcd(b,g);

            System.out.println(b/k+":"+g/k);

        }
    }
}
