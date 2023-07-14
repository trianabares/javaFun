public class StringManipulator{
    public static String trimAndConcat(String str1, String str2){
        return str1.trim() + str2.trim();
    }
    public static int getIndexOrNull(String str, char letra){
        return str.indexOf(letra);
    }
    public static int getIndexOrNull(String cadena1, String cadena2){
        return cadena1.indexOf(cadena2);
    }
    public static String concatSubstring(String str1, int num1, int num2, String str2){
        String word = str1.substring(num1, num2);
        return word.trim() + str2.trim();
    }
}
