import java.util.Scanner;

public class baek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        String d = Integer.toString(a*b*c);

        // System.out.println(d);
        // System.out.println(d.length());
        // System.out.println(d.charAt(0));

        int[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0 ; d.length() > i; i++) {
            for (int j = 0 ; 10 > j; j++) {
                if ( d.charAt(i) == (char)(j + '0')){
                    e[j] += 1;
                }
            }
        }

        for (int k = 0 ; 10 > k; k++) {
            //System.out.println(k);
            System.out.println(e[k]);
        }
    }
}
