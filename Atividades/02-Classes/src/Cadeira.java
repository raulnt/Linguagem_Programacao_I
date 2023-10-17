public class Cadeira {
    
    //Atributos
    private String cor;
    private String material;
    private String tipo;
    public Cadeira(){
    }

    //Construtor
    public Cadeira(String cor, String material, String tipo){
        this.cor = cor;
        this.material = material;
        this.tipo = tipo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    //Métodos 
    public void arrastar(){
        System.out.println("Você puxou a cadeira para sentar");           
    }

    public void sentar(){
        System.out.println("Você esta sentado na cadeira para estudar");
    }

    public void levantar(){
        System.out.println("Você se levantou da cadeira depois que estudou");
    }

    public void destampar() {
    }

    public void tampar() {
    }

    public void escrever() {
    }

}
