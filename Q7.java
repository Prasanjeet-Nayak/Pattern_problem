public class Q7 {
    public static void main(String[] args) {
        /*
        n=3
*
**
***
**
*
         */
        int  n=3;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<a;j++){
//            System.out.print('*');
//            }
//            a++;
//            System.out.println();
//        }
//        for (int i=n;i>0;i--){
//            for (int j=a-2;j>0;j--){
//
//            System.out.print('*');
//            }
//            a--;
//            System.out.println();
//        }
        for(int i=0;i<2*n-1;i++){
            int k=i+1;
            if(i>n-1)
                k=2*n-1-i;
            for(int j=0;j<k;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
