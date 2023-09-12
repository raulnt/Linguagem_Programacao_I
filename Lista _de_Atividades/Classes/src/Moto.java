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

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setCl(int cl){
        this.cl = cl;
    }

    public int getCl(){
        return cl;
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
