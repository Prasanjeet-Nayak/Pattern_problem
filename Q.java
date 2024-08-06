public class Q {
    public static void main(String[] args) {
        /*
        n=4
1111
222
33
4
         */
        int a=1;
        int n=4;
        for (int i =n; i >0; i--) {
              for(int j =0;j<i;j++){
                System.out.print(a);
            }
              a++;
            System.out.println("");
        }
    }
}

