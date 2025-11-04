import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversoes conversoes = new Conversoes();
        int opcao;
        boolean replay = true;

        System.out.println("**********CONVERSOR**********");
        do {
            System.out.println("Selecione o tipo de conversão:\n1. Temperatura\n2. Distãncia\n3. Peso\n0. Sair");
            System.out.print("Digite o opção desejada:");
            while (!sc.hasNextInt()) {
                System.err.println("Use apenas números!");
                sc.next();
                System.out.println("Tente novamente.");
            }
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    conversoes.temperatura();
                    break;
                case 2:
                    conversoes.distancia();
                    break;
                case 3:
                    conversoes.peso();
                case 0:
                    System.out.println("Finalizando o programa...");
                    replay = false;
                    return;
                default:
                    System.err.println("Escolha uma opção valida!");
            }
        } while (replay);
    }
}