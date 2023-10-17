import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex088 {
    public static void main(String[] args) {
        List<Integer> v = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            v.add(scanner.nextInt());
        }

        System.out.print("Entre com o valor de N: ");
        int n = scanner.nextInt();

        boolean existe = v.contains(n);

        if (existe) {
            v.remove(Integer.valueOf(n)); // Remove a primeira ocorrência de 'n' na lista
            System.out.println("Novo vetor sem o " + n + ": ");
            for (int num : v) {
                System.out.println(num);
            }
        } else {
            System.out.println("O " + n + " não está no vetor.");
        }
    }
}
