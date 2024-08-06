public class Q10 {
    public static void main(String[] args) {
       /*
        azbycxdw....
        */
        char N1 = 'a';
        char N2 = 'z';
        for (int i = (int) 'a'; i <= (int) 'z'; i++) {
            System.out.print(N1);
            System.out.print(N2);
            N1++;
            N2--;
        }
    }
}
