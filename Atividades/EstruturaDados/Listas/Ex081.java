import java.util.Scanner;

public class Ex081 {
    public static void main(String[] args) {
        int[] q = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Entre com um número inteiro positivo: ");
            int verificador = scanner.nextInt();

            if (verificador < 0) {
                System.out.println("Apenas números positivos");
                i--;
            } else {
                q[i] = verificador;
            }
        }

        int menorValor = q[0]; // Inicializa o menor valor com o primeiro elemento
        int posicao = 0;

        for (int i = 1; i < 20; i++) {
            if (q[i] < menorValor) {
                menorValor = q[i];
                posicao = i;
            }
        }

        System.out.println("Menor Valor: " + menorValor + "\nPosição: " + (posicao + 1));
    }

}
    
