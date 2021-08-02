import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class baek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] a = new int[9];
        int[] b = new int[9];

        for(int i = 0; i < 9; i++){
            int q = scan.nextInt();
            a[i] = q;
            b[i] = q;
        }

        //b = a;
        Arrays.sort(b);
    
        int z = 0;
        while(true){
            // System.out.printf("========= \n", z);
            // System.out.printf("%d \n", z);
            if(b[8] == a[z]){
                // System.out.printf("========= \n", z);
                // System.out.printf("%d \n", b[8]);
                // System.out.printf("========= \n", z);
                // System.out.printf("%d \n", z);
                // System.out.printf("========= \n", z);
                break;
            }
            z++;
        }

        System.out.printf("%d\n%d",  b[8], z+1);
    }
}
