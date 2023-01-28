import java.util.Scanner;
//exercicio resolvido de forma diferente

public class exerc3 {
    public static void main(String[] args) {
        int produto = 0, alcool = 0,gasolina = 0,diesel = 0;

        Scanner sc = new Scanner(System.in);

        produto = sc.nextInt();

        while(produto != 4){

            if(produto == 1){
                alcool++;
            }else if(produto == 2){
                gasolina++;
            }else if(produto == 3){
                diesel++;
            }else if(produto == 5){
                System.out.println("MUITO OBRIGADO!");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
            }
            produto = sc.nextInt();
        }

    }
}

//!= 1 && produto != 2 && produto != 3 && produto != 4)
