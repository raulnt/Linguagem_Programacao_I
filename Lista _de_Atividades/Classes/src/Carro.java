public class Carro {
    
    //ATRIBUTOS
    String nome;
    String marca;
    int ano;
    int vel;

    //MÉTODOS
    void acelerar(int aceleracao) {
        vel+=aceleracao;
    }

    void freiar(int reduzir) {
        vel-=reduzir;
    }

    void buzinar() {
        System.out.println("Bibiiiiiiiih");
    }
}
