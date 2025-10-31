/**
 * CALCULADORA
 *
 * A calculadora realiza operações matemáticas entre números inteiros.
 * @author Gabriel Albuquerque
 * @version 1.0
 * @since 30/10/2025
 */

public class Calculadora {

    /**
     * Esse método é utilizado para calcular dois numeros interios
     * @param num1 este é o primeiro parametro
     * @param num2 este é o segundo parametro
     * @return int o resultado da soma
     */

    public int somar(int num1, int num2){
        return num1 + num2;
    }


    public static void main(String[] args){
        Calculadora calculo = new Calculadora();
        Calculadora imprimir =  new Calculadora();
        int numero_1 = 5, numero_2 = 10;

        System.out.println(calculo.somar(numero_1,numero_2));
    }

}
