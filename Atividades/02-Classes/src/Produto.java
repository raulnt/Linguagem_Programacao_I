public class Produto {
    
    // ATRIBUTOS
    private String nome;
    private String marca;
    private float valor;

    //CONSTRUTORES
    public Produto(){    
    }

    public Produto(String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
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

    public void setValor(float valor){
        this.valor = valor;
    }

    public float getValor(){
        return valor;
    }

    public void destampar(){
        System.out.println("Destampei a Guarrafa de Água");
    }

    public void beber(){
        System.out.println("Bebendo água até acabar");
    }

    public void reclicar(){
        System.out.println("Após terminar de beber, reclico ela no lixo correto.");
    }
}

