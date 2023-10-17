import java.util.ArrayList;
import java.util.List;

public class Ex077 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(5);
        listaNumeros.add(1);
        listaNumeros.add(4);
        listaNumeros.add(2);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(3);
        listaNumeros.add(6);

        for (int i = 8; i >= 5; i--) {
            int temporario = listaNumeros.get(i);
            listaNumeros.set(i, listaNumeros.get(8 - i + 1));
            listaNumeros.set(8 - i + 1, temporario);
        }

        listaNumeros.set(3, listaNumeros.get(1));
        listaNumeros.set(listaNumeros.get(3), listaNumeros.get(listaNumeros.get(2)));

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.print(listaNumeros.get(i) + " ");
        }
    }
}
