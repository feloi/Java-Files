import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidade = sc.nextInt();

        String[] name = new String[quantidade];
        int[] idade = new int[quantidade];
        double[] altura = new double [quantidade];

        for(int i = 0; i< quantidade; i++){
            int alt = i + 1;
            System.out.println("Dados da " + alt +  "a pessoa: ");
            sc.nextLine();
            System.out.printf("Nome: ");
            name[i] = sc.nextLine();
            System.out.printf("Idade: ");
            idade[i] = sc.nextInt();
            System.out.printf("Altura: ");
            altura[i] = sc.nextDouble();

        }
        int sumIdade = 0;
        double sumAltura = 0.0;
        int menorIdade = 0;

        for(int i = 0; i < quantidade; i++){
            sumIdade += idade[i];
            sumAltura += altura[i];

        }
        for(int i = 0; i < quantidade; i++){
            if (idade[i] < 16){
                menorIdade++;
            }
        }
        double calc = ((double)menorIdade/quantidade) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", calc);

        System.out.println();
        double alturaMedia = sumAltura/quantidade;
        System.out.printf("Altura média: %.2f\n", alturaMedia);

        for(int i = 0; i < quantidade; i++){
            if(idade[i] < 16){
                System.out.println(name[i]);
            }
        }

    }
}
