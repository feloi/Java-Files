
import currencyConvert.convert;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        convert convert = new convert();



        System.out.printf("What is the dollar price? ");
        convert.dolar = sc.nextDouble();
        System.out.printf("How many dollars will be bought? ");
        convert.amount = sc.nextDouble();
        System.out.println(convert.sum);
        System.out.printf("%.2f", convert.convertDolar());
    }
}
