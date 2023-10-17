import java.util.ArrayList;
import java.util.Scanner;

public class Ex083 {
    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor:");
            vetor.add(scanner.nextInt());
        }

        System.out.println("Inverso do vetor:");
        for (int i = vetor.size() - 1; i >= 0; i--) {
            System.out.println(vetor.get(i));
        }
    }
}
