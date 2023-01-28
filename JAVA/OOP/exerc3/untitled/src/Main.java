import java.util.Locale;
import java.util.Scanner;
import Aluno.aluno;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        aluno aluno = new aluno();

        aluno.name = sc.nextLine();
        aluno.score1 = sc.nextDouble();
        aluno.score2 = sc.nextDouble();
        aluno.score3 = sc.nextDouble();
        System.out.println(aluno.calc());
        double vamover = aluno.calc() - 10;
        System.out.println();
        System.out.println(vamover);
        if(aluno.calc() >= 60){
            System.out.println("FINAL GRADE = " + aluno.calc());
            System.out.println("PASS");
        }else{
            System.out.println("Failed");
            System.out.println(aluno);
        }

    }
}
