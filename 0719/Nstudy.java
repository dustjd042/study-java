import java.util.Scanner;

public class Nstudy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();

        for (int i = A-1; i > 0; i--){
            System.out.println(i);
        }
    }
}