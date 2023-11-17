package b10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b10988 {
    public static void main(String[] args) throws IOException {
        // 문제) 팰린드롬: level, noon 일시 1 출력 아니면 0 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] urStr = br.readLine().toCharArray(); //문자열 입력받아 char배열에 넣음
        char[] urStrReverse = new char[urStr.length]; //받은 문자열 뒤집을 배열 선언
        int equal=0, stack =0;

        for(int i=urStr.length-1, j=0 ;i>=0; i--,j++){
            urStrReverse[j]=urStr[i]; //받은 문자열 뒤집어서 배열에 넣음
        }
        for(int i=0;i< urStr.length;i++){
            if(urStr[i]==urStrReverse[i]) { //배열 비교시 같으면 stack 1씩 증가
                stack++;
            }
        }
        if(stack == urStr.length) equal = 1;
        System.out.println(equal);
    }
}