import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("I'm Still Standing", "You could never know what it's like");
        trackList.put("Black Sheep", "Hello again, friend of a friend, I knew you when");
        trackList.put("Pretty Old Man", "Your breath blows my hair in this crowded space");
        trackList.put("Hold On Tight", "Baby, you and me are a twisted fantasy");

        // Obtene una canción por su título
        String title = "Canción 2";
        System.out.println("Canción: " + title);

        // Imprime todos los nombres de las pistas y las letras
        System.out.println("----- Lista de canciones -----");
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }

    }
}
