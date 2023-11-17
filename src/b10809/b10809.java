package b10809;

import java.util.Scanner;

public class b10809 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String urString = sc.next();

        int[] equal = new int[26];

        for(int i=0; i<equal.length; i++){
            equal[i] = -1;
        }
        for(int i=0; i< urString.length(); i++){
            char c = urString.charAt(i);
            if(equal[(int)c-97] == -1){
                equal[(int)c-97] =i;
            }
        }
        for (int i=0;i<equal.length;i++) {
            System.out.print(equal[i] + " ");
        }
    }
}
