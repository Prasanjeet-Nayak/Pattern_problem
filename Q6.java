public class Q6 {
    public static void main(String[] args) {

        /*
        n=5
11112
32222
33334
54444
55556
         */
        int n=5;
        for(int i=1;i<=n;i++){


                if (i%2!=0){
                    System.out.print(i);
                }
                else{
                    System.out.print(i+1);
                }

                for (int j=0;j<n-2;j++) {
                    System.out.print(i);
                }
                if ((i)%2==0){
                    System.out.print(i);
                }
                else {
                    System.out.print(i+1);
                }
            System.out.println();
        }
    }
}
