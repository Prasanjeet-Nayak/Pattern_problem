public class Q3 {
    public static void main(String[] args) {
/*
n=6
1
 22
333
 4444
555555
 6666666

 */
        int n = 6;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                System.out.print(" ");

            }
            for (int i = 0; i <j; i++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
