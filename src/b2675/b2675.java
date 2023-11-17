package b2675;
import java.util.Scanner;

public class b2675 {
    public static void main(String[] args){
        // 문자열 S를 입력받아, 각 문자를 R번 반복해 새문자열 P로 만들어 출력
        Scanner sc =new Scanner(System.in);
        int bb = sc.nextInt();

        for(int i=0; i<bb; i++){
            int R = sc.nextInt();
            String S = sc.next();
            for(int k=0;k<S.length();k++) {
                for (int j = 0; j < R; j++) {
                    System.out.print(S.charAt(k));
                }
            }
            System.out.println();
        }
    }
}
