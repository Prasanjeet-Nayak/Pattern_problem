public class Q5 {
    public static void main(String[] args) {
        /*
        n=5
    1
   222
  33333
 4444444
555555555
         */
        int n=6;
        int n1=n;
        for (int i=0;i<n-1;i++){
            for (int j=n1-2;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print(i+1);
            }
            n1--;
            System.out.println();
        }

    }
}
