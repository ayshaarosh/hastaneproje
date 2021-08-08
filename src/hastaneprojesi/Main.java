package hastaneprojesi;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Movie> movieList = new ArrayList<Movie>();  // Movie türünden liste oluşturularak günler ekleniyor.

        movieList.add(new Movie(1, "Pazartesi ", "hafta içi", 09.00-12.00));
        movieList.add(new Movie(2, "Salı", "hafta içi", 09.00-12.00));
        movieList.add(new Movie(3, "Çarşampa", "hafta içi", 09.00-12.00));
        movieList.add(new Movie(4, "Perşembe", "hafta içi", 09.00-12.00));
        movieList.add(new Movie(5, "Cuma", "hafta içi", 09.00-12.00));
        movieList.add(new Movie(6, "Cumartesi", "hafta sonu", 09.00-12.00));
        movieList.add(new Movie(7, "Pazar", "hafta sonu", 09.00-12.00));

        DataInput data = new DataInput();  // Hasta girişi yapılabilmesi için DataInput sınıfından nesne oluşturularak getData() fonksiyonu çağrılıyor.
        data.getData(movieList);
    }


}

