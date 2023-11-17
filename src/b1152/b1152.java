package b1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String urStr = bf.readLine();
        StringTokenizer st = new StringTokenizer(urStr," ");
        System.out.print(st.countTokens());
    }
}
