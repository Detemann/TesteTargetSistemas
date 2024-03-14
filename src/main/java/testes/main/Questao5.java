package testes.main;

public class Questao5 {
    public static void main(String[] args) {
        String palavra = "questao";

        char[] charArr = palavra.toCharArray();

        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            char pos = charArr[esquerda];
            charArr[esquerda] = charArr[direita];
            charArr[direita] = pos;

            esquerda++;
            direita--;
        }

        palavra = String.valueOf(charArr);
        System.out.println(palavra);
    }
}
