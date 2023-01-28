import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import Conta.conta;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        conta conta;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)?");
        char response = sc.next().charAt(0);

        if(response  == 'y'){
            System.out.printf("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            conta = new conta(number, holder, initialDeposit);
        }else{
            conta = new conta(number, holder);
        }
        System.out.println("");

        System.out.printf("Account data: ");
        System.out.print(conta);

        System.out.println("");
        System.out.printf("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);

        System.out.printf("Updated account data: ");
        System.out.print(conta);

        System.out.println("");
        System.out.printf("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);

        System.out.printf("Updated account data: ");
        System.out.print(conta);

        sc.close();

    }
}