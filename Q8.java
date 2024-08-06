public class Q8 {
    public static void main(String[] args) {
        /*
        n=6
     *
**
   ***
****
 *****
******
         */
        int a=1;
        int n=6;
        for (int i=n;i>0;i--){
            if(n%2!=0) {
                for (int k = n - 1; k > 0; k--) {
                    System.out.print(" ");
                }
            }
            for (int j=0;j<a;j++){
                System.out.print("*");
            }
            a++;
            n--;
            System.out.println();
        }
    }
}
