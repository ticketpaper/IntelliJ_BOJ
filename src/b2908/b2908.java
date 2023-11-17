package b2908;
import java.util.Scanner;

public class b2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        int revA = (A/100)+(A%100-A%10)+(A%10*100);
        int revB = (B/100)+(B%100-B%10)+(B%10*100);
        System.out.println(Math.max(revA,revB));
    }
}
