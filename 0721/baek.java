import java.util.Scanner;

public class baek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int[] c = new int[a];
        
        for (int i = 0; i < a; i++){

            c[i] = scan.nextInt();
        }

        for (int i = 0; i < a; i++){

            if (b > c[i]){
                System.out.printf("%d ",  c[i]);
            }
        }
    }
}
