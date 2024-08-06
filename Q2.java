public class Q2 {
    public static void main(String[] args) {
                   /*
                   n=4
1111
 222
  33
   4
                    */
        int n=4;
        for(int f=0;f<5*n;f++){
            for (int i=0;i<f;i++){
                System.out.print(" ");
            }
            for(int j=n;j>0;j--){
                System.out.print(f+1);
            }
            n--;
            System.out.println();
        }
    }
}
