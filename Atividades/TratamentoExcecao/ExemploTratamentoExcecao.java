import java.util.Scanner;
public class ExemploTratamentoExcecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        try {
            while (true) {
                System.out.print("Digite um numero inteiro positivo (ou um numero negativo para encerrar): ");
                int numero = scanner.nextInt();
                
                if (numero < 0) {
                    System.out.println("Numeros negativos nao sao permitidos. Encerrando o programa.");
                    break;
                }

                soma += numero;
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Certifique-se de digitar um numero inteiro valido.");
        } finally {
            scanner.close();
        }

        System.out.println("A soma dos numeros positivos e: " + soma);
    }
}
