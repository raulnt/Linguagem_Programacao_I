import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex086 {
    public static void main(String[] args) {
        List<Integer> vetor = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor.add(scanner.nextInt());
        }

        Collections.sort(vetor);

        System.out.println("Vetor ordenado em ordem crescente:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
