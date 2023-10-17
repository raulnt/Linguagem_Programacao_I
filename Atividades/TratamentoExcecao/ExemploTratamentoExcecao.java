import java.util.Scanner;

public class ExemploTratamentoExcecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numero = Integer.parseInt(scanner.nextLine());

            int resultado = 10 / numero;

            System.out.println("O resultado da divisão de 10 por " + numero + " é: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro: Divisão por zero. Por favor, insira um número diferente de zero.");
        } catch (NumberFormatException e) {
            System.err.println("Erro: O valor inserido não é um número inteiro válido.");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("O programa foi concluído.");
        }
    }
}
