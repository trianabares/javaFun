public class TestHashMapFun {
    public static void main(String[] args){
        HashMapFun trackList = new HashMapFun();

        // Obtene una canción por su título
        String title = "Canción 2";
        String lyrics = trackList.get(title);
        System.out.println("Canción: " + title);
        System.out.println("Letra: " + lyrics);

        // Imprimi todos los nombres de las pistas y las letras
        System.out.println("----- TrackList -----");
        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            String track = entry.getKey();
            String songLyrics = entry.getValue();
            System.out.println(track + ": " + songLyrics);
        }

    }
    
}