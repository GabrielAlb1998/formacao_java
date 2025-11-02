public class Calculos {


    static double somar(double numero_1, double numero_2) {
        return numero_1 + numero_2;
    }
    static double subtrair(double numero_1, double numero_2){
        return numero_1 - numero_2;
    }
    static double multiplicar(double numero_1, double numero_2){
        return numero_1 * numero_2;
    }
    static double dividir(double numero_1, double numero_2){

        if(numero_1==0) {
            //Montar mensagem de erro
            System.err.println("Digite um número maior que 0.");
            return 0;
        }

        return numero_1 - numero_2;
    }
    static double resto(double numero_1, double numero_2){
        return numero_1 % numero_2;
    }
}
