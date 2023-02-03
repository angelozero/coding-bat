package _01_warmup;

import java.util.Arrays;

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 * <p>
 * <p>
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */
public class FrontBack {

    public static void main(String[] args) {

        String palavra = "code";
        System.out.println(frontBack(palavra));

    }

    public static String frontBack(String str) {

        String palavraInvertida = "";
        String[] listaDaPalavra = str.split("");
        int ultimaPosicao = listaDaPalavra.length - 1;

        String primeiraLetra = listaDaPalavra[0];
        String ultimaLetra = listaDaPalavra[ultimaPosicao];
        listaDaPalavra[0] = ultimaLetra;
        listaDaPalavra[ultimaPosicao] = primeiraLetra;

        for (int x = 0; x < listaDaPalavra.length; x++) {
            palavraInvertida += listaDaPalavra[x];
        }

        return palavraInvertida;
    }

}
