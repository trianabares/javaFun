import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Random;

public class TestPuzzleJava {
        public static void main(String[] args) {

        // Primer ejercicio 

        PuzzleJava Puzzle = new PuzzleJava();

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(1);
        numeros.add(2);
        numeros.add(7);
        numeros.add(9);
        numeros.add(8);
        numeros.add(13);
        numeros.add(25);
        numeros.add(32);

        System.out.println(Puzzle.sumaTodos(numeros));

        // Segundo ejercicio

        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Nancy");
        nombres.add("Jinichi");
        nombres.add("Fujibayashi");
        nombres.add("Momochi");
        nombres.add("Ishikawa");

        System.out.println(Puzzle.mezclaNombres(nombres));

        // Tercer ejercicio

        ArrayList<Character> alfabeto = new ArrayList<Character>();

        for(char c = 'A'; c <= 'Z'; c++){
            alfabeto.add(c);
        }

        System.out.println(alfabeto);
        System.out.println(Puzzle.alfabeto(alfabeto));

        // Cuarto y quinto ejercicio

        ArrayList<Integer> diezNumeros = new ArrayList<Integer>();
        System.out.println(Puzzle.diezNumeros(diezNumeros));
    
        // Sexto y septimo ejercicio

        System.out.println(Puzzle.generarCadenaAleatoria(5));
        System.out.println(Puzzle.generarArregloCadenasAleatorias(5,10));



    }
}
