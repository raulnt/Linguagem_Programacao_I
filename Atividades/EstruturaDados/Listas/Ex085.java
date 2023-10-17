import java.util.ArrayList;
import java.util.Scanner;

public class Ex085 {
    public static void main(String[] args) {
        ArrayList<Double> temperatura = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 365; i++) {
            System.out.println("Entre com a temperatura média do dia " + (i + 1) + ": ");
            temperatura.add(scanner.nextDouble());
        }

        double menorTemp = Double.MAX_VALUE; // Inicialize com o maior valor possível
        double maiorTemp = Double.MIN_VALUE; // Inicialize com o menor valor possível
        double mediaTemp = 0;

        for (int i = 0; i < 365; i++) {
            double temp = temperatura.get(i);
            if (temp > maiorTemp) {
                maiorTemp = temp;
            }
            if (temp < menorTemp) {
                menorTemp = temp;
            }
            mediaTemp += temp;
        }
        mediaTemp /= 365;

        int diasInferior = 0;

        for (int i = 0; i < 365; i++) {
            if (temperatura.get(i) < mediaTemp) {
                diasInferior++;
            }
        }

        System.out.println("Menor Temperatura do Ano: " + menorTemp);
        System.out.println("Maior temperatura do Ano: " + maiorTemp);
        System.out.println("Média de Temperaturas do Ano: " + mediaTemp);
        System.out.println("Número de dias no ano em que a temperatura foi inferior à média anual: " + diasInferior);
    }
}
