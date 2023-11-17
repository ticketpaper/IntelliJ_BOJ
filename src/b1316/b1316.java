package b1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/** 백준1316
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */

public class b1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 입력 받은 단어 개수
        int count = N; // 그룹 단어 개수 세기 위함


        for(int i=0; i<N; i++){
            String STR= bf.readLine(); // 문자열 입력
            char prevChar = STR.charAt(0); // 이전 문자
            boolean[] Checker = new boolean[26]; // 알파벳 개수 26개 만큼 배열 생성 (디폴트값 false)

            for (int j = 1; j < STR.length(); j++) {
                char currentChar = STR.charAt(j); // 현재 문자

                if (prevChar != currentChar) { // 이전 문자와 현재 문자가 같지 않으면
                    if (Checker[currentChar - 'a']) { //
                        count--;
                        break;
                    }
                    Checker[prevChar - 'a'] = true; // 이전 문자
                }
                prevChar = currentChar;
            }
        }
        System.out.println(count);
    }
}
