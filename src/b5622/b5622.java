package b5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b5622 {
    public static void main(String[] args) throws IOException {
        // 2:ABC(3초), 3:DEF(4초), 4:GHI(5초), 5:JKL(6초),
        // 6:MNO(7초), 7:PQRS(8초), 8:TUV(9초), 9:WXYZ(10초)
        // UNUCIC : 868242 = 9+7+9+3+5+3= 36초
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String URSTR =  bf.readLine();
        int second =0;
        for(int i=0; i<URSTR.length(); i++){
            char EQUAL = URSTR.charAt(i);
            if((EQUAL == 'A')||(EQUAL == 'B')||(EQUAL == 'C'))second += 3;
            else if((EQUAL == 'D')||(EQUAL == 'E')||(EQUAL == 'F'))second += 4;
            else if((EQUAL == 'G')||(EQUAL == 'H')||(EQUAL == 'I'))second += 5;
            else if((EQUAL == 'J')||(EQUAL == 'K')||(EQUAL == 'L'))second += 6;
            else if((EQUAL == 'M')||(EQUAL == 'N')||(EQUAL == 'O'))second += 7;
            else if((EQUAL == 'P')||(EQUAL == 'Q')||(EQUAL == 'R')||(EQUAL == 'S'))second += 8;
            else if((EQUAL == 'T')||(EQUAL == 'U')||(EQUAL == 'V'))second += 9;
            else second += 10;
        }
        System.out.println(second);
    }
}
