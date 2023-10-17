
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        // Quantidade de nomes
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
        }

        System.out.print("Digite um nome para buscar: ");
        String nomeBuscado = scanner.nextLine();

        boolean encontrou = false;

        // Procura o nome na lista
        for (String nome : nomes) {
            if (nomeBuscado.equals(nome)) {
                encontrou = true;
                break;
            }
        }

        // Resultado da busca
        if (encontrou) {
            System.out.println("Encontrado");
        } else {
            System.out.println("Não encontrado");
        }
    }
}
