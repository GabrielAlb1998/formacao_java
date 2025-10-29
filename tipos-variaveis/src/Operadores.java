public class Operadores {

    public static void main(String[] args){

        String concatenacao = "?";

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = (1+1+1)+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);



        int numero = 5;

        numero = - 5;

        System.out.println(numero);

        //Para converter o número para positivo é necessario multiplicar o mesmo por -1
        numero = numero * -1;

        System.out.println(numero);

        //Imprime o numero já incrementado
        System.out.println(++numero);

        numero = 5;
        //Imprime o numero e so depois incrementa
        System.out.println(numero++);
        //Obs: a regra é a mesma para decremento



        numero = 5;
        int numero2 = 5;

        boolean numeroIgual = numero2 == numero;

        System.out.println(numeroIgual);
         numeroIgual = numero2 != numero;

        System.out.println(numeroIgual);
         numeroIgual = numero2 > numero;

        System.out.println(numeroIgual);
        numeroIgual = numero2 < numero;

        System.out.println(numeroIgual);


    }
}
