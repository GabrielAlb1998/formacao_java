/**
 * Contador
 * O intuito é criar um contador que indentifique 2 parametros e mostre os valores entre eles.
 *
 * @author Gabriel Albuquerque
 * @version 1.0
 *
 */

import java.util.Scanner;



public class Contador {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        int num1 = sc.nextInt();
        System.out.print("\nDigite o segundo número:");
        int num2 = sc.nextInt();

        try{
            contar(num1,num2);
        }catch(ParametrosInvalidosException e){
            System.err.println("Primeiro parametro é maior que o segundo parametro!");

        }
    }

    static void contar(int n1, int n2) throws ParametrosInvalidosException{
        if(n1 > n2){//Indentifica se o primeiro parametro é maior que o segundo
            throw new ParametrosInvalidosException(); // Lança o err caso for true
        }
        for(int i =n1;i<=n2;n1++){
             System.out.println(i++);
        }

    }
}