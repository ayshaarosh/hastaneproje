package hastaneprojesi;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class HospitalAppointment {
    public static void calculate(Customer customer) {
        double amount;
        if (customer.age < 0) {
            amount = customer.selectedMovie.time - customer.selectedMovie.time * 0.0;
        } else if (customer.age < 18) {
            amount = customer.selectedMovie.time - customer.selectedMovie.time * 0.0;
        } else {
            amount = customer.selectedMovie.time;
        }
        if (customer.selectedMovie.kind.equals("")) {
            amount = amount + amount ;
        }

    }


}