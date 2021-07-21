import java.util.Scanner;

public class baek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        int[] b = new int[a];
        int[] c = new int[a];
        
        for (int i = 0; i < a; i++){
            b[i] = scan.nextInt();
            c[i] = scan.nextInt();
        }

        for (int i = 0; i < a; i++){
            System.out.printf("Case #%d: %d + %d = %d \n", i + 1, b[i], c[i], b[i] + c[i]);
        }
    }
}
