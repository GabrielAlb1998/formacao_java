
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
// TODO: complete os espaços em branco com sua solução para o problema
        String[] nomes = new String[10];

        for(i=0 ; i<10 ; i++) {
            nomes[i] = sc.nextLine();

            if (nomes[i].equals(nomes[2])) {
                System.out.printf(nomes[i]);
            }
            if (nomes[i].equals(nomes[6])) {
                System.out.printf(nomes[i]);
            }
            if (nomes[i].equals(nomes[8])) {
                System.out.printf(nomes[i]);
            }
        }
    }
}

