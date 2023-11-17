package b25206;
import java.util.Scanner;

public class b25206 {
    public static void main(String args[]){
        String[] Grade = {"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};
        int i =0;
        Double qusgka =0.D,qusgkasum=0.D,sum = 0.D;
        String[] UrClass = new String[20];
        String[] UrGrade = new String[20];
        Double[] UrScore = new Double[20];
        Scanner sc = new Scanner(System.in);

        for (i=0;i< UrClass.length;i++){
            UrClass[i]=sc.next();
            UrScore[i]=sc.nextDouble();
            UrGrade[i]=sc.next();
        }

        for (i=0;i<UrClass.length;i++) {
            switch (UrGrade[i]){
                case "A+": qusgka=4.5; break;
                case "A0": qusgka=4.0; break;
                case "B+": qusgka=3.5; break;
                case "B0": qusgka=3.0; break;
                case "C+": qusgka=2.5; break;
                case "C0": qusgka=2.0; break;
                case "D+": qusgka=1.5; break;
                case "D0": qusgka=1.0; break;
                case "F": qusgka=0.0; break;
                case "P": continue;
            }
            sum += UrScore[i];
            qusgkasum += UrScore[i] * qusgka;
        }
        System.out.printf("%6f",qusgkasum/sum);
    }
}