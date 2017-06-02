import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

class MicroAndArrayUpdate {
    public static void main(String args[]) throws Exception {

        try {

            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                Arrays.sort(arr);
                if (k-arr[0]<0)
                {
                    System.out.println(0);
                }
                else
                    System.out.println(k - arr[0]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}