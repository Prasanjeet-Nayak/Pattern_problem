public class Q11 {
    public static void main(String[] args) {
/*
n=5
    *
   * *
  *   *
 *     *
*       *
 */
//        int n = 5;
//        int a = 1;
//        int n1 = n;
//        while (a < n) {
//            for (int j = n1 - 1; j > 0; j--) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//            n1--;
//            for (int k = 0; k < a; k++) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//            a++;
//        }

        int n=5;
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <= n + i; j++)
                if (j == (n - i) || j == (n + i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}
