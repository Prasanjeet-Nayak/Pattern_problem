public class Q9 {
    public static void main(String[] args) {

        /*
        n=10
1 10 2 9 3 8 4 7 5 6
n=9
1 9 2 8 3 7 4 6 5
         */
        int a=1;
        int n=9;
//        for (int i=0;i<n;i++){
//                System.out.print(a+" ");
//                System.out.print(n+" ");
//                n--;
//                a++;
//        }
        while(a<=n){
            if(a==n)
                System.out.print(a+" ");
            else {
                System.out.print(a + " ");
                System.out.print(n + " ");
            }
            a++;n--;
        }
        n=9;
        a=1;
        System.out.println();
        for (int i=0;i<n;i++) {
            System.out.print(a + " ");
            System.out.print(n + " ");
            n--;
            a++;
        }
    }
}
