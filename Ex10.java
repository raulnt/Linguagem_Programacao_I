import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        System.out.println("Valor do carro é: "+calculoConsumidor(custoFabrica));
    }
    public static double calculoConsumidor(double custoFabrica){
        return (custoFabrica+(custoFabrica*0.28)+(custoFabrica*0.45));
    }
}
