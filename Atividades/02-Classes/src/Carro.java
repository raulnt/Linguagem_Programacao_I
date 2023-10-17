public class Carro {

    //Atributos
    private String nome;
    private String marca;
    private int vel;
    public Carro(){

    }
    //Construtor
    public Carro(String nome, String marca, int vel){
        this.nome = nome;
        this.marca = marca;
        this.vel = vel;
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

    public void setVel(int vel){
        this.vel = vel;
    }

    public int getVel(){
        return vel;
    }

    //Métodos
    public void acelerar() {
        System.out.println("Estamos acelerando pois estamos na estrada...");    }

    public void freiar() {
        System.out.println("Freiamos pois chegamos no endereço!"); 
    }

    public void buzinar(){
        System.out.println("Bibiiiiiiiih (Buzina)");
    }

    
}
