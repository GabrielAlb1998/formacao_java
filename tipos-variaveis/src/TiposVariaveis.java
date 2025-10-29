public class TiposVariaveis {

    public static void main(String[] args){

        //String representa texto.
        String meuNome = "Gabriel Albuquerque";
        double salarioMinino = 2500;

        short numero = 2;
        int numeroLongo = numero;
        short numeroCurto = (short) numeroLongo; //Informo que o 'numeroLongo' nunca vai ser auterada para um número maior.

        int num = 5;

        numero = 10;

        System.out.println(numero);

        //final é usado para determinar que a variavel está com o valor final.(CONSTANTE)
        final int ano_1998 = 1998;
    }
}