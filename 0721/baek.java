import java.util.Scanner;

public class baek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        
        for (int i = 1; i <= a; i++){

            for (int f = a; f > 0+i; f--){
                System.out.printf(" ");
            }

            for (int j = 0; j < i; j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
