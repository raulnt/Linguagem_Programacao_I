public class Porta {
    
    //Atributos
    private String cor;
    private String material;
    private Boolean macaneta;

    public Porta(String cor, String material, Boolean macaneta){
        this.cor = cor;
        this.material = material;
        this.macaneta = macaneta;
    }

    public Porta() {
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

    public void setMacaneta(Boolean macaneta){
        this.macaneta = macaneta;
    }

    public Boolean getMacaneta(){
        return macaneta;
    }

    //Métodos
    public void destrancar(){
        System.out.println("A porta foi destrancada");
    }

    public void abrir(){
        System.out.println("A porta foi aberta");
    }

    public void fechar(){
        System.out.println("Após a passagem a porta foi fechada");
    }
}
