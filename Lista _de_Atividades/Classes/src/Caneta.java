public class Caneta {
    
    //Atributos
    private String cor;
    private String marca;
    private float ponta;
    public Caneta(){

    }
    //Construtor
    public Caneta(String cor, String marca, float ponta){
        this.cor = cor;
        this.marca = marca;
        this.ponta = ponta;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }

    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    public float getPonta(){
        return ponta;
    }

    //Métodos
    public void destampar(){
        System.out.println("A caneta está destampada");
    }
    
    public void tampar(){
        System.out.println("A caneta foi tampada e guardada.");
    }
    
    public void escrever(){
        System.out.println("Estou escrevendo...");
    }
}
