package hastaneprojesi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class time {
    public static void main(String args[]){
        LocalDateTime LocalDate = LocalDateTime.now();
        System.out.println(LocalDate);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-YY h:mm a");
        System.out.println(dtf.format(LocalDate));
    }
}
