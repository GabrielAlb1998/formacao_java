/**
 * CALCULADORA
 *
 * A calculadora realiza operações matemáticas entre números inteiros.
 * @author Gabriel Albuquerque
 * @version 1.1
 * @since 30/10/2025
 */
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculadora {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");
        Pattern op = Pattern.compile("[+\\-*/]");
        boolean continuar = true;
        double num1, num2;
        String entradas;

    do {

        System.out.println("Digite o primeiro número:");
        while(!sc.hasNextDouble()){
            System.err.println("Digite apenas números!");
            sc.next();
            System.out.println("Tente novamente!");
        }
        num1 = sc.nextDouble();

        System.out.println("Digite o tipo de operação (+,-,*,/):");
        while(!sc.hasNext(op)){
            System.err.println("Digite apenas operadores (+,-,*,/)");
            sc.next();
            System.out.println("Tente novamente!");
        }
        entradas = sc.next();


        System.out.println("Digite o Segundo número:");
        while(!sc.hasNextDouble()){
            System.err.println("Digite apenas números!");
            sc.next();
            System.out.println("Tente novamente!");
        }
        num2 = sc.nextDouble();

        switch (entradas) {

            case "+":
                //System.out.println(df(num1) + operacao + num2 + " = " + Calculos.somar(num1, num2));
                System.out.printf("%.0f%s%.0f=%.0f\n", num1, entradas, num2, Calculos.somar(num1,num2) );
                break;
            case "-":
               // System.out.println(num1 + operacao + num2 + " = " + Calculos.subtrair(num1, num2));
                System.out.printf("%.0f%s%.0f=%.0f\n", num1, entradas, num2, Calculos.subtrair(num1,num2) );
                break;
            case "*":
              //  System.out.println(num1 + operacao + num2 + " = " + Calculos.multiplicar(num1, num2));
                System.out.printf("%.0f%s%.0f=%.0f\n", num1, entradas, num2, Calculos.multiplicar(num1,num2) );
                break;
            case "/":
              //  System.out.println(num1 + operacao + num2 + " = " + Calculos.dividir(num1, num2));
                System.out.printf("%.0f%s%.0f=%.2f\n", num1, entradas, num2, Calculos.dividir(num1,num2) );
                if (num1 % 2 != 0) System.out.println("O resto dessa operação é " + Calculos.resto(num1, num2));
                break;

            default:
                System.out.println("Escolha uma operação valida!");
        }

        System.out.println("Deseja continuar? (S/N)");
        String resposta = sc.next().toLowerCase();
        if(resposta.equals("n")){
             continuar = false;
             System.out.println("Finalizando...");
        }

    }while (continuar);
    }

}
