package b2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * č:c=, ć:c-, dž:dz=, đ:d-, lj:lj, nj:nj, š:s=, ž:z=
 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 */
public class b2941_V2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for (String val : croatia){
            input = input.replace(val,"A");
        }
        System.out.println(input.length());
    }
}
