import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m, n;

        m = sc.nextInt();
        n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for(int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        int pos = sc.nextInt();

        for (int i=0; i<n;i++){
            for (int j=0;j<n;j++){
                if(pos == matriz[i][j]){
                    if (j > 0){
                        System.out.println("valores: "+ i + ", " + j);
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if(j > 0){
                        System.out.println("valores: "+ i + ", " + j);
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }
    }
}
