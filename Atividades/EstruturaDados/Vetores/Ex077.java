public class Ex077 {
     public static void main(String[] args) {
        int[] v = {2, 8, 1, 3, 5, 4, 6, 7};
        
        for (int i = 8; i >= 5; i--) {
            int aux = v[i];
            v[i] = v[8 - i + 1];
            v[8 - i + 1] = aux;
        }
        
        v[3] = v[1];
        v[v[3]] = v[v[2]];
        
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
