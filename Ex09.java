import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salário atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Porcentagen de aumento: ");
        double porcentagem = scanner.nextDouble();

        System.out.println("\nNovo salário: "+novoSalario(salarioAtual, porcentagem));
    }
    public static double novoSalario(double salario, double aumento){
        return (salario+(salario*(aumento/100)));
    }
}