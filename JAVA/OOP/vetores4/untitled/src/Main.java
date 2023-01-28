import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numeros = sc.nextInt();

        double[] num = new double[numeros];

        for(int i = 0; i < numeros; i++){
            System.out.print("Digite um numero: ");
            num[i] = sc.nextDouble();

        }
        double sum = 0.0;
        double nextNum = 0.0;
        for(int i  = 0; i < numeros; i++){
            sum += num[i];
        }
        System.out.printf("VALORES = ");
        for (int i=0; i<numeros; i++) {
            System.out.printf("%.1f  ", num[i]);
        }
        System.out.println("");
        double media = sum/numeros;
        System.out.print("SOMA = " + sum);
        System.out.println();
        System.out.print("MEDIA = " + media);
        sc.close();
    }
}
