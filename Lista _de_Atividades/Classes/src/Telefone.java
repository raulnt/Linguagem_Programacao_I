public class Telefone {
    
    //Atributos
    private String marca;
    private String sistema;
    private String cor;

    public Telefone(){
    }

    public Telefone(String marca, String sistema, String cor){
        this.marca = marca;
        this.sistema = sistema;
        this.cor = cor;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setSistema(String sistema){
        this.sistema = sistema;
    }

    public String getSistema(){
        return sistema;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void discar(){
        System.out.println("Estou discando...");
    }

    public void ligarChamada(){
        System.out.println("Estou ligando para um amigo");
    }

    public void desligarChamada(){
        System.out.println("Deliguei a chamada telefonica");
    }


}
