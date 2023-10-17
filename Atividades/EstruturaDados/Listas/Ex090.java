import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex090 {
    public static void main(String[] args) {
        List<Integer> vetor = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor.add(scanner.nextInt());
        }

        System.out.print("Digite um número para contar: ");
        int numeroParaContar = scanner.nextInt();

        int contador = 0;

        for (int num : vetor) {
            if (num == numeroParaContar) {
                contador++;
            }
        }

        System.out.println("O número " + numeroParaContar + " aparece no vetor " + contador + " vezes.");
    }
}
