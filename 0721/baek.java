import java.util.Arrays;
import java.util.Scanner;

public class baek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        
        int[] b = new int[a];

        for(int i = 0; i < a; i++){
            b[i] = scan.nextInt();
        }

        Arrays.sort(b);

        System.out.printf("%d %d", b[0], b[b.length-1]);
    }
}
