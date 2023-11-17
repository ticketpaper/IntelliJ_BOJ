package b1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1157 {
    public static void main(String[] args) throws IOException {
        /** 백준 1157 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
        *   첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
        *   Mississipi -> ?
        *   ASCII Code A:65 a:97
        */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int[] Alphabet = new int[26];
        for(int i=0;i<str.length();i++){
            int a = str.charAt(i);
            if (a>=97){ a -= 32;}
            Alphabet[a-65]++;
        }
        int max = 0;
        char ans = 0;
        for(int i=0; i<Alphabet.length; i++){
            if (Alphabet[i]>max){
                max = Alphabet[i];
                ans = (char)(i+65);
            }
            else if(Alphabet[i]==max)
                ans = '?';
        }
        System.out.println(ans);
    }
}
