import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2023-02-03");
        LocalDateTime d05 = LocalDateTime.parse("2023-02-03T12:35:20");
        Instant d06 = Instant.parse("2023-02-03T12:35:20Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));



        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R2 = " + r3);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonth());
        System.out.println("d04 ano = " + d04.getYear());
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minuto = " + d05.getMinute());




    }
}
