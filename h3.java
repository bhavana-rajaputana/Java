import java.util.*;


public class h3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number;
        number=scan.nextInt();
        int i = number, j;
        while (i> 0) {
            j = 0;
            while (j++ < number - i) {
                System.out.print(" ");}
            j = 0;
            while (j++ < i * - 1) {
                System.out.print("*");
            }
            System.out.println(" ");
            i--;
        }
    }
}