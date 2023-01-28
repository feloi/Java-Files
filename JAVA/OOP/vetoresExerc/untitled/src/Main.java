import entities.Rents;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nRooms, room;
        String name, email;
        Rents[] vect = new Rents[10];

        System.out.printf("How many rooms will be rented? ");
        nRooms = sc.nextInt();

        for(int i = 0; i < nRooms; i++){
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();

            vect[room] = new Rents(name, email);

        }

        System.out.println();
        System.out.println("Busy room: ");
        for(int i = 0; i < 10; i++){
            if(vect[i] != null){
                System.out.println(i + ": " +vect[i]);

            }
        }


    }
}
