import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        int senhaC = 2002;
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while(num != 2002){
            System.out.println("Senha inválida!");
            num = sc.nextInt();

        }
        System.out.println("Acesso Permitido!");
        sc.close();
    }
}


