/**
 * Conta bancária
 *
 * Primeiro projeto do curso básico de JAVA.
 * Objetivo: Criar um projeto onde o usuário possa adicionar seus dados e o programa print em tela.
 * @author Gabriel Albuquerque
 * @version 1.0
 */
import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recebendo dados do usuário.
        System.out.println("Qual seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Qual sua agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Qual sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual valor deseja depositar: ");
        double saldo = scanner.nextDouble();



        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldo);


    }
}