public class Carro {

    //Atributos
    String nome;
    String marca;
    int vel;

    //Métodos
    void acelerar(int aceleracao) {
        vel += aceleracao;
    }

    void freiar(int reduzir) {
        vel -= reduzir; 
    }

    void buzinar(){
        System.out.println("Bibiiiiiiiih");
    }


    
}
