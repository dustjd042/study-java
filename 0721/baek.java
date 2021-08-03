import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.print.event.PrintEvent;
import javax.security.auth.kerberos.KerberosKey;

public class baek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        List<Integer> c = new ArrayList<Integer>();


        for (int i = 0 ; 10 > i; i++) {
            a[i] = scan.nextInt();
            b[i] = a[i]%42;
        }

        for (int j = 0 ; a.length > j; j++) {
            for (int k = j ; b.length > k; k++) {
                if(j != k){
                    if(b[j] == b[k]){
                        c.add(b[j]);
                    }
                }
            }
        }

        System.out.print(c);

    }
}
