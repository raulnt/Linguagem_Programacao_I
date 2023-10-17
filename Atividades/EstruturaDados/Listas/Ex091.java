
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex091 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numeroDigitado = scanner.nextInt();
            numeros.add(numeroDigitado);
        }

        List<Integer> numerosRepetidos = new ArrayList<>();

        for (int i = 0; i < numeros.size() - 1; i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i).equals(numeros.get(j))) {
                    if (!numerosRepetidos.contains(numeros.get(i))) {
                        numerosRepetidos.add(numeros.get(i));
                    }
                }
            }
        }

        if (!numerosRepetidos.isEmpty()) {
            System.out.println("Números repetidos:");
            for (Integer numero : numerosRepetidos) {
                System.out.println(numero + " na posição " + (numeros.indexOf(numero) + 1));
            }
        } else {
            System.out.println("Não há números repetidos na lista.");
        }
    }
}
