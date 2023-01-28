import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade = 0, result = 0, qntPares = 0;

        System.out.printf("Quantos numeros voce vai digitar? ");
        quantidade = sc.nextInt();
        int[] num = new int[quantidade];

        for(int i = 0; i < quantidade; i++){
            System.out.printf("Digite um numero: ");
            num[i] = sc.nextInt();
        }
        System.out.printf("\nNÚMEROS PARES = ");
        for(int i = 0; i < quantidade; i++){
            result = num[i] % 2;
            if (result == 0){
                System.out.printf("%d ", num[i]);
                qntPares++;
            }
        }
        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qntPares);
    }
}
