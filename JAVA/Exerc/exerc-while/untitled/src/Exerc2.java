import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        while(x!= 0 || y !=0){
            if(x > 1 && y > 1){
                System.out.println("Prmeiro");
            }else if(x < 0 && y > 0){
                System.out.println("Segundo");
            }else if(x < 0 && y < 0){
                System.out.println("Terceiro");
            }else if (x > 0 && y < 0){
                System.out.println("Quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

    }
}
