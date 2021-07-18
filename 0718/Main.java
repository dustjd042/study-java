import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        int C = B - 45;

        if (C >= 0) {
            System.out.printf("%d %d", A , C);
        }else if(C < 0) {

            C = 60+(C);

            if (A == 0){
                System.out.printf("%d %d", 23 , C);
            }else{
                System.out.printf("%d %d", A-1 , C);
            }
        }
    }
}