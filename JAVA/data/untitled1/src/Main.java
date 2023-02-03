import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-02-03");
        LocalDateTime d05 = LocalDateTime.parse("2023-02-03T11:20:40");
        Instant d06 = Instant.parse("2023-02-03T11:20:40Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ISO_DATE_TIME;

        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d06 = " + fmt4.format(d06));

        System.out.println("d07 = " + d05.format(fmt3));
        System.out.println("d08 = " + fmt5.format(d06));


    }
}
