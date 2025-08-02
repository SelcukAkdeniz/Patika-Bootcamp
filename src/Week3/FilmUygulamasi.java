package Week3;

import java.util.*;

public class FilmUygulamasi {

    public static void main(String[] args) {
        // Film nesneleri oluşturuluyor
        List<Film> filmler = new ArrayList<>();
        filmler.add(new Film("Inception", 2010, "Bilim Kurgu", 8.8));
        filmler.add(new Film("The Godfather", 1972, "Suç", 9.2));
        filmler.add(new Film("Parasite", 2019, "Gerilim", 8.6));
        filmler.add(new Film("Pulp Fiction", 1994, "Suç", 8.9));
        filmler.add(new Film("The Matrix", 1999, "Bilim Kurgu", 8.7));

        // IMDb puanına göre büyükten küçüğe sıralama
        System.out.println("IMDb'ye Göre Sıralama (Büyükten Küçüğe):");
        filmler.sort(Comparator.comparingDouble(Film::getImdbPuani).reversed());
        filmler.forEach(System.out::println);

        // Yayın yılına göre küçükten büyüğe sıralama
        System.out.println("\nYayın Yılına Göre Sıralama (Küçükten Büyüğe):");
        filmler.sort(Comparator.comparingInt(Film::getYayinYili));
        filmler.forEach(System.out::println);

        // Belirli türdeki filmleri filtreleme
        System.out.println("\nFiltrelenen Filmler (Tür: Suç):");
        filmTureGoreFiltrele(filmler, "Suç");
    }

    // Tür parametresine göre filtreleyen metod
    public static void filmTureGoreFiltrele(List<Film> filmler, String tur) {
        for (Film film : filmler) {
            if (film.getTur().equalsIgnoreCase(tur)) {
                System.out.println(film);
            }
        }
    }
}
