import java.util.HashMap;
import java.util.Set;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Canción 1", "Letra de la canción 1");
        trackList.put("Canción 2", "Letra de la canción 2");
        trackList.put("Canción 3", "Letra de la canción 3");
        trackList.put("Canción 4", "Letra de la canción 4");

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }
    }
}
