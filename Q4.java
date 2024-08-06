public class Q4 {
    public static void main(String[] args) {
    /*
    n=6
     1
    22
   333
  4444
 55555
666666
     */
        int n = 6;
        int n1 = n;

        for (int i = 0; i < n; i++) {
            for (int j = n1 - 1; j > 0; j--) {
                System.out.print(" ");
            }
            n1--;
            for (int k = 0; k < i+1; k++) {
                System.out.print(i+1);
            }
            System.out.println();
        }

    }
}
