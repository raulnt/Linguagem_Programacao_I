public class Teclado {
    
    //Atributos
    private String cor;
    private String marca;
    private int numTeclas;

    public Teclado(String cor, String marca, int numTeclas){
        this.cor = cor;
        this.marca = marca;
        this.numTeclas = numTeclas;
    }

    public Teclado() {
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

    public void setNumTeclas(int numTeclas){
        this.numTeclas = numTeclas;
    }

    public int getNumTeclas(){
        return numTeclas;
    }

    //Métodos
    void ligar(){
        System.out.println("O teclado foi ligado");
    }

    void teclar(){
        System.out.println("Estou digitando...");
    }

    void desligar(){
        System.out.println("O teclado foi desligado.");
    }
}
