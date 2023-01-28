import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar? ");
        int numero = sc.nextInt();
        int[] num = new int[numero];

        for (int i = 0;i < numero; i++){
            System.out.println("Digite um numero: ");
            num[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < numero; i++){

            if(num[i]<0){
                System.out.println(num[i]);
            }
        }
        sc.close();
    }
}
