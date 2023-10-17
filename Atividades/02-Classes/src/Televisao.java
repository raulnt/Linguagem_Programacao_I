public class Televisao{

    //Atributos
    private String marca;
    private String cor;
    private Boolean funciona;

    public Televisao(){
    }

    public Televisao(String marca, String cor, Boolean funciona){
        this.marca = marca;
        this.cor = cor;
        this.funciona = funciona;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setFunciona(Boolean funciona){
        this.funciona = funciona;
    }

    public Boolean getFunciona(){
        return funciona;
    }

    //Métodos 
    void ligar(){
        System.out.println("A TV esta sendo ligada!");
    }

    void mudarCanal(){
        System.out.println("Bipi(Mudando de canal)");
    }
    void desligar(){
        System.out.println("A TV foi desligada");
    }
}