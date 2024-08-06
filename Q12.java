public class Q12 {
    public static void main(String[] args) {
  /*
*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *

*/
        int n=5;
        for (int i = 0; i <n; i++) {
            for(int j=1;j<=n+i;j++)
                if(j==(n-i)||j==(n+i))
                    System.out.print("*");
                else
                    System.out.print(" ");
                System.out.println();



        }


    }
}
