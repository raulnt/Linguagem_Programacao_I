
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex080 {
    public static void main(String[] args) {
        List<Integer> numerosPositivos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Entre com um número inteiro positivo: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("É aceito apenas números positivos");
                i--;
            } else {
                numerosPositivos.add(numero);
            }
        }

        int maiorValor = 0;
        int posicaoMaiorValor = 0;

        for (int i = 0; i < numerosPositivos.size(); i++) {
            if (numerosPositivos.get(i) > maiorValor) {
                maiorValor = numerosPositivos.get(i);
                posicaoMaiorValor = i;
            }
        }

        System.out.println("Maior Valor: " + maiorValor + "\nPosição: " + (posicaoMaiorValor + 1));
    }
}
