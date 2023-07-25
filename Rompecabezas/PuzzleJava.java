import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

    // Primer ejercicio

    public ArrayList<Integer> sumaTodos(ArrayList<Integer> elementos) {
        int suma = 0;
        ArrayList<Integer> numerosMayores = new ArrayList<Integer>();

        for (int i : elementos) {
            suma += i;
            if (i > 10) {
                numerosMayores.add(i);
            }
        }

        System.out.println("la suma total es " + suma);
        return numerosMayores;
    }

    // Segundo ejercicio

    public ArrayList<String> mezclaNombres(ArrayList<String> nombres) {
        ArrayList<String> listaNombres = new ArrayList<String>(nombres);

        Collections.shuffle(listaNombres);
        System.out.println(listaNombres);

        ArrayList<String> masCincoCaracteres = new ArrayList<String>();

        for (String nombre : listaNombres) {
            if (nombre.length() > 5) {
                masCincoCaracteres.add(nombre);
            }
        }

        return masCincoCaracteres;
    }

    // Tercer ejercicio

    public ArrayList<Character> alfabeto(ArrayList<Character> alfabeto) {
        ArrayList<Character> nuevoAlfabeto = new ArrayList<Character>(alfabeto);

        Collections.shuffle(nuevoAlfabeto);

        char ultimaLetra = nuevoAlfabeto.get(nuevoAlfabeto.size() - 1);
        ;

        if (ultimaLetra == 'A' || ultimaLetra == 'E' || ultimaLetra == 'I' || ultimaLetra == 'O'
                || ultimaLetra == 'U') {
            System.out.println("La ultima letra es la vocal " + ultimaLetra);
        }

        return nuevoAlfabeto;
    }

    // Cuarto y quinto ejercicio

    public ArrayList<Integer> diezNumeros(ArrayList<Integer> diezNumeros) {
        ArrayList<Integer> nuevoArray = new ArrayList<Integer>();
        Random rand = new Random();
        int max = 100;
        int min = 55;

        for (int i = 0; i < 10; i++) {
                int rand_int1 = rand.nextInt(max - min + 1) + min;
                nuevoArray.add(rand_int1);
        }

        Collections.sort(nuevoArray);

        return nuevoArray;

    }

    // Sexto ejercicio

    public String generarCadenaAleatoria(int longitudChar) {
        StringBuilder cadenaAleatoria = new StringBuilder();

        for (int i = 0; i < longitudChar; i++) {
            Random rnd = new Random();
            char c = (char) ('a' + rnd.nextInt(26));
            cadenaAleatoria.append(c);
        }

        return cadenaAleatoria.toString();
    }

    // Septimo ejercicio

    public ArrayList<String> generarArregloCadenasAleatorias(int longitudChar, int longitudArray) {
        ArrayList<String> arrayDeStrings = new ArrayList<String>();

        for (int i = 0; i < longitudArray; i++) {
            String cadenaAleatoria = generarCadenaAleatoria(longitudChar);
            arrayDeStrings.add(cadenaAleatoria);
        }

        return arrayDeStrings;
    }

}