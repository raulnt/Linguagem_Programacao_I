public class Moto {

    //Atributos
    private String nome;
    private String marca;
    private int cl;
    public Moto(){
    }

    public Moto(String nome, String marca, int cl){
        this.nome = nome;
        this.nome = marca;
        this.cl = cl;
    }

    //Métodos
   public void ligar(){
        System.out.println("A moto esta ligada");
    }

    public void passarMarcha(){
        System.out.println("Engatando a primeira marcha para baixo");
    }

    public void acelerar(){
        System.out.println("Acelerando e saindo de casa.");
    }
}
