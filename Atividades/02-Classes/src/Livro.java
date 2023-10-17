public class Livro {
    
    //Atributos
    private String cor;
    private String genero;
    private int paginas;
    public Livro(){

    }

    public Livro(String cor, String genero, int paginas){
        this.cor = cor;
        this.genero = genero;
        this.paginas = paginas;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }
    
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public int getPaginas(){
        return paginas;
    }

    //Métodos
    void abrir(){
        System.out.println("O livro foi aberto");
    }

    void ler(){
        System.out.println("Estou lendo...");
    }

    void fechar(){
        System.out.println("Após a leitura, fechei o livro e o guardei.");
    }
}
