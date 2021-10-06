public class WordCalculator {

    public boolean esPalindromo(String word){

        word = word.toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace(" ", "")
                .replace(".", "")
                .replace(",", "");

        String invertida = new StringBuilder(word).reverse().toString();
        return invertida.equals(word);
    }
}
