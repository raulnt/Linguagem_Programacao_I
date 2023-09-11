public class Teste {
    
    public static void main(String[] args) {

        //CADEIRA
        Cadeira cad1 = new Cadeira();
        cad1.setCor("Azul");
        cad1.setMaterial("Madeira");
        cad1.setTipo("Escritório");
        System.out.println("\n CADEIRA");
        System.out.println("Cor: "+cad1.getCor());
        System.out.println("Material: "+cad1.getMaterial());
        System.out.println("Tipo: "+cad1.getTipo());
        cad1.arrastar();
        cad1.sentar();
        cad1.levantar();

        //-----------------------------------------------------------//

        //CANETA
        Caneta can1 = new Caneta();
        can1.setCor("Azul");
        can1.setMarca("BIC");
        can1.setPonta(1.0f);
        System.out.println("\n CANETA");
        System.out.println("Cor: "+can1.getCor());
        System.out.println("Marca: "+can1.getMarca());
        System.out.println("Ponta: "+can1.getPonta());
        can1.destampar();
        can1.escrever();
        can1.tampar();

        //-----------------------------------------------------------//

        //CARRO
        Carro c1 = new Carro();
        c1.setNome("Uno");
        c1.setMarca("FIAT");
        c1.setVel(20);
        System.out.println("\n CARRO");
        System.out.println("Nome: "+c1.getNome());
        System.out.println("Marca: "+c1.getMarca());
        System.out.println("Velocidade: "+c1.getVel());
        c1.acelerar();
        c1.freiar();
        c1.buzinar();

        //-----------------------------------------------------------//

        //LIVRO
        Livro l1 = new Livro();
        l1.setCor("Amarelo");
        l1.setGenero("Auto-Ajuda");
        l1.setPaginas(200);
        System.out.println("\n LIVRO");
        System.out.println("Cor: "+l1.getCor());
        System.out.println("Genero "+l1.getGenero());
        System.out.println("Numero de Paginas: "+l1.getPaginas());        
        l1.abrir();
        l1.ler();
        l1.fechar();

        //-----------------------------------------------------------//

        //MOTO
        Moto m1 = new Moto();
        m1.nome = "Tornado";
        m1.marca = "Honda";
        m1.cl = 250; //Cilindradas
        
        System.out.println("\n" +m1.nome +"\n"+ m1.marca + "\n" + m1.cl + " cilindradas");

        //Métodos
        m1.ligar();
        
        m1.passarMarcha();

        m1.acelerar();
        
        //-----------------------------------------------------------//

        //PORTA
        Porta p1 = new Porta();

        //Atributos
        p1.cor = "Branca";
        p1.material = "Madeira";
        p1.macaneta = true;

        System.out.println("\n" +p1.cor +"\n"+ p1.material + "\n" + p1.macaneta);

        //Métodos
        p1.destrancar();

        p1.abrir();
        
        p1.fechar();

        //-----------------------------------------------------------//

        //TECLADO
        Teclado t1 = new Teclado();

        //Atribudos
        t1.cor = "Preto";
        t1.marca = "HyperX";
        t1.numTeclas = 88;

        System.out.println("\n" + t1.cor + "\n" + t1.marca + "\n" + t1.numTeclas );

        //Métodos
        t1.ligar();

        t1.teclar();

        t1.desligar();

        //-----------------------------------------------------------//

        //TELEFONE
        Telefone tel1 = new Telefone();

        //Atributos
        tel1.marca = "Samgung";
        tel1.sistema = "Android";
        tel1.cor = "Prata";

        System.out.println("\n" + tel1.marca + "\n" + tel1.sistema + "\n" + tel1.cor);

        //Métodos
        tel1.discar();
        
        tel1.ligarChamada();

        tel1.desligarChamada();

        //-----------------------------------------------------------//

        //TV
        Tv tv1 = new Tv();

        //Atributos
        tv1.marca = "LG";
        tv1.cor = "Prata";
        tv1.funciona = true;

        System.out.println("\n" +tv1.marca+ "\n" +tv1.cor+ "\n" +tv1.funciona);

        //Métodos
        tv1.ligar();

        tv1.mudarCanal();

        tv1.desligar();

        //-----------------------------------------------------------//

        //VENTILADOR
        Ventilador vent1 = new Ventilador();

        //Atributos
        vent1.marca = "Britania";
        vent1.cor = "Preto";
        vent1.voltz = 220;

        System.out.println("\n" +vent1.marca+ "\n" +vent1.cor+ "\n" +vent1.voltz);

        vent1.ligar();

        vent1.mover();

        vent1.desligar();
    }

}
