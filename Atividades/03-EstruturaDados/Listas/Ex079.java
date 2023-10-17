
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        double somaDasNotas = 0;
        int quantidadeDeAlunosAcimaDaMedia = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            somaDasNotas += nota;
        }

        double media = somaDasNotas / notas.size();

        for (Double nota : notas) {
            if (nota >= media) {
                quantidadeDeAlunosAcimaDaMedia++;
            }
        }

        System.out.println("A média da turma é: " + media);
        System.out.println("Quantidade de alunos com nota acima da média: " + quantidadeDeAlunosAcimaDaMedia);
    }
}
