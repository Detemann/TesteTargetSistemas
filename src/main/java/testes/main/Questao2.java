package testes.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        int numero = Integer.parseInt(scanner.nextLine());

        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        while (fibonacci.get(fibonacci.size() - 1) < numero) {
            int proximoNumero = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(proximoNumero);
        }

        if (fibonacci.contains(numero)) {
            System.out.println("O número " + numero + " é da sequência de Fibonacci");
        } else {
            System.out.println("O número " + numero + " não é da sequência de Fibonacci");
        }
        scanner.close();
    }
}
