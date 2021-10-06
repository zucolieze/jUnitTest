import java.util.Locale;

public class WordCalculator {

    public String reemplaceWord(String word){
        return word.toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace(" ", "")
                .replace(".", "")
                .replace(",", "");
    }

    public boolean esPalindromo(String word){
        word = reemplaceWord(word);
        String invertida = new StringBuilder(word).reverse().toString();
        return invertida.equals(word);
    }

    public int contarVocales(String word){
        word = reemplaceWord(word);
        int contador = 0;
        for(int x=0;x<word.length();x++) {
            if ((word.charAt(x)=='a') ||
                    (word.charAt(x)=='e') ||
                    (word.charAt(x)=='i') ||
                    (word.charAt(x)=='o') ||
                    (word.charAt(x)=='u')){
                contador++;
            }
        }
        return contador;
    }

    public boolean comienzaCon(String word, String inicio){
        word = reemplaceWord(word);
        boolean b1 = false;
        if(b1 == word.startsWith(inicio)){
            return true;
        }else{
            return false;
        }
    }
}
