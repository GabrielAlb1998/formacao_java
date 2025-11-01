/**
 * Aprendendo o uso do Scanner
 * Nessa aula foi usado o AboutMe para demonstrar o uso do scanner de forma inicial.
 *
 * @author Gabriel Albuquerque
 * @version 1.1
 * Na versão 1.1 foi acresentado o uso do Try-Catch-finally
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class AboutMe {



    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
            System.out.println("Digite sua idade:");
            int cep = scanner.nextInt();

            System.out.println("Meu nome é " + nome + " e minha idade é " + idade + " anos.");
            System.out.println("Meu CEP é "+ cep);
        }catch (InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser númericos");
        }
    }
}