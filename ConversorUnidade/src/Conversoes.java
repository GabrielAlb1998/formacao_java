import java.text.DecimalFormat;
import java.util.Scanner;
public class Conversoes {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("##,#");
    int escolha;
    double valorConvertido;
    public void temperatura(){

        double temp_1;

        System.out.println("Qual conversão deseja realizar?\n1. Celsius > Fahrenheit\n2. Fahrenheit > Celsius\n3. Celsius > Kelvin\n4. Kelvin > Celsius\n0. Sair");
        System.out.print("Digite o opção desejada:");
        while(!sc.hasNext()){
            System.err.println("Digite uma opção valida!");
            sc.next();
            System.out.println("Tente novamente!");
        }
        escolha = sc.nextInt();

        switch (escolha){

            case 1:
                System.out.println("------CONVERSOR DE CELSIUS PARA FAHRENHEIT------");

                System.out.println("Digite os graus em Celcius:");
                while(!sc.hasNextDouble()){
                    System.err.println("Preencha o campo corretamente. Ex: 10,0");
                    sc.next();
                    System.out.println("Tente novamente!");
                }
                temp_1 = sc.nextDouble();

                valorConvertido = temp_1 * 9/5 + 32;
                df.format(valorConvertido);
                System.out.println("O resultado da conversão é "+ valorConvertido +"Fº.");
                break;

            case 2:
                System.out.println("------CONVERSOR DE FAHRENHEIT PARA CELSIUS------");

                System.out.println("Digite os graus em Fahrenheit:");
                while(!sc.hasNextDouble()){
                    System.err.println("Preencha o campo corretamente. Ex: 10,0");
                    sc.next();
                    System.out.println("Tente novamente!");
                }
                temp_1 = sc.nextDouble();

                valorConvertido = (temp_1 - 32) * 5/9;
                df.format(valorConvertido);
                System.out.println("O resultado da conversão é "+ valorConvertido +"Cº.");
                break;

            case 3:
                System.out.println("------CONVERSOR DE CELSIUS PARA KELVIN------");

                System.out.println("Digite os graus em Celsius:");
                while(!sc.hasNextDouble()){
                    System.err.println("Preencha o campo corretamente. Ex: 10,0");
                    sc.next();
                    System.out.println("Tente novamente!");
                }
                temp_1 = sc.nextDouble();


                valorConvertido = temp_1 + 273.15;
                df.format(valorConvertido);
                System.out.println("O resultado da conversão é "+ valorConvertido +"K.");
                break;

            case 4:
                System.out.println("------CONVERSOR DE KELVIN PARA CELSIUS------");

                System.out.println("Digite os graus em Kelvin:");
                while(!sc.hasNextDouble()){
                    System.err.println("Preencha o campo corretamente. Ex: 10,0");
                    sc.next();
                    System.out.println("Tente novamente!");
                }
                temp_1 = sc.nextDouble();


                valorConvertido = temp_1 - 273.15;
                df.format(valorConvertido);
                System.out.println("O resultado da conversão é "+ valorConvertido +"Cº.");
                break;

            case 0:
                System.out.println("Retornando ao menu principal.");
                break;

            default:
                System.out.println("Escolha uma opção valida!");


        }
    }

    public void distancia() {
        double distancia_1;

        System.out.println("Qual conversão deseja realizar?\n1. Metros > Kilometros\n2. Kilometros > Metros\n3. Metros > Milhas\n0. Sair");
        System.out.print("Digite o opção desejada:");
        while (!sc.hasNext()) {
            System.err.println("Digite uma opção valida!");
            sc.next();
            System.out.println("Tente novamente!");
        }
        escolha = sc.nextInt();

        switch (escolha) {

            case 1:
                System.out.println("------CONVERSOR DE METROS PARA KILOMETROS------");

                System.out.println("Digite o valor em Metros:");
                while (!sc.hasNextDouble()) {
                    System.err.println("Preencha o campo corretamente. Ex: 10,0");
                    sc.next();
                    System.out.println("Tente novamente!");
                }
                distancia_1 = sc.nextDouble();


                valorConvertido = distancia_1 / 1000;
                df.format(valorConvertido);
                System.out.println("O resultado da conversão é " + valorConvertido + "Km's.");
                break;

            case 2:
                System.out.println("------CONVERSOR DE KILOMETROS PARA METROS------");

                System.out.println("Digite o valor em Kilometros:");
                while (!sc.hasNextDouble()) {
                    System.err.println("Preencha o campo corretamente. Ex: 10,0");
                    sc.next();
                    System.out.println("Tente novamente!");
                }
                distancia_1 = sc.nextDouble();



                valorConvertido = distancia_1 * 1000;
                df.format(valorConvertido);
                System.out.println("O resultado da conversão é " + valorConvertido + "M's.");
                break;

            case 3:
                System.out.println("------CONVERSOR DE METROS PARA MILHAS------");

                System.out.println("Digite o valor em Metros:");
                while (!sc.hasNextDouble()) {
                    System.err.println("Preencha o campo corretamente. Ex: 10,0");
                    sc.next();
                    System.out.println("Tente novamente!");
                }
                distancia_1 = sc.nextDouble();


                valorConvertido = distancia_1 / 1609.34;
                df.format(valorConvertido);
                System.out.println("O resultado da conversão é " + valorConvertido + "Milhas.");
                break;

            case 0:
                System.out.println("Retornando ao menu principal.");
                break;

            default:
                System.out.println("Escolha uma opção valida!");

        }
    }

    public void peso(){
        double peso_1, peso_2;

        System.out.println("Qual conversão deseja realizar?\n1. Quilogramas > Libras\n2. Libras > Quilogramas\n3. Gramas > Quilogramas\n4. Quilogramas > Gramas\n0. Sair");
        System.out.print("Digite o opção desejada:");
        while (!sc.hasNext()) {
            System.err.println("Digite uma opção valida!");
            sc.next();
            System.out.println("Tente novamente!");
        }
        escolha = sc.nextInt();

        switch (escolha) {

            case 1:
                System.out.println("------CONVERSOR DE QUILOGRAMAS PARA LIBRAS------");

                System.out.println("Digite o valor em Quilogramas:");
                while (!sc.hasNextDouble()) {
                    System.err.println("Preencha o campo corretamente. Ex: 10.0");
                    sc.next();
                    System.out.println("Tente novamente!");
                }
                peso_1 = sc.nextDouble();


                valorConvertido = peso_1 * 2.20462;
                df.format(valorConvertido);
                System.out.println("O resultado da conversão é " + valorConvertido + " Libras.");
                break;

            case 2:
                System.out.println("------CONVERSOR DE LIBRAS PARA QUILOGRAMAS------");

                System.out.println("Digite o valor em Libras:");
                while (!sc.hasNextDouble()) {
                    System.err.println("Preencha o campo corretamente. Ex: 10.0");
                    sc.next();
                    System.out.println("Tente novamente!");
                }
                peso_1 = sc.nextDouble();


                valorConvertido = peso_1 * 2.20462;
                df.format(valorConvertido);
                System.out.println("O resultado da conversão é " + valorConvertido + "Kg.");
                break;

            case 3:

                System.out.println("------CONVERSOR DE GRAMAS PARA QUILOGRAMAS------");

                System.out.println("Digite o valor em Gramas:");
                while (!sc.hasNextDouble()) {
                    System.err.println("Preencha o campo corretamente. Ex: 10.0");
                    sc.next();
                    System.out.println("Tente novamente!");
                }
                peso_1 = sc.nextDouble();


                valorConvertido = peso_1 / 1000;
                df.format(valorConvertido);
                System.out.println("O resultado da conversão é " + valorConvertido + "Kg.");
                break;

            case 4:

                System.out.println("------CONVERSOR DE QUILOGRAMAS PARA GRAMAS------");

                System.out.println("Digite o valor em Quilogramas:");
                while (!sc.hasNextDouble()) {
                    System.err.println("Preencha o campo corretamente. Ex: 10.0");
                    sc.next();
                    System.out.println("Tente novamente!");
                }
                peso_1 = sc.nextDouble();


                valorConvertido = peso_1 * 1000;
                df.format(valorConvertido);
                System.out.println("O resultado da conversão é " + valorConvertido + "g.");
                break;

            case 0:
                System.out.println("Retornando ao menu principal.");
                break;

            default:
                System.out.println("Escolha uma opção valida!");

        }
    }
}
