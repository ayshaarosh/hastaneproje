package hastaneprojesi;
import java.util.List;
import java.util.Scanner;

public class DataInput {

    public void getData(List<Movie> movieList) {

        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.print("TC numaranız giriniz: ");
        customer.TC = scanner.nextInt();
        System.out.print("Hasta adı giriniz: ");
        customer.name = scanner.next();
        System.out.print("Hasta soyadı giriniz: ");
        customer.surname = scanner.next();
        System.out.print("Hasta yaşı giriniz: ");
        customer.age = scanner.nextInt();
        System.out.print("il giriniz: ");
        customer.il = scanner.next();
        System.out.print("Hastane adı giriniz: ");
        customer.hatanead = scanner.next();
        System.out.print("klinik giriniz: ");
        customer.klinik = scanner.next();

        System.out.println("\n--------------------------");
        for (Movie movies : movieList) {
            System.out.println(movies.id + "\t" + movies.name);
        }
        System.out.println("--------------------------");
        System.out.print("randevu günü id giriniz: ");

        int id = scanner.nextInt();
        for (Movie movies : movieList) {
            if (id == movies.id) {
                customer.selectedMovie = movies; // Eğer seçilen randevu günün id'si movieList'teki id'lerinden birine eşitse hatanın seçtiği gün olarak atanıyor.
            }
        }
        if (customer.selectedMovie == null) { // listede olmayan bir id girilirse tekrar girmesi için fonksiyon tekrar çağrılıyor. geçerli bir id ise hesaplama fonk. çağrılyr.
            System.out.println("Yanlış id girildi. Tekrar deneyiniz.");
            getData(movieList);
        } else HospitalAppointment.calculate(customer);
    }
}





