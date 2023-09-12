public class Teste {
    
    public static void main(String[] args) {

        //CADEIRA
        Cadeira cad1 = new Cadeira();
        cad1.setCor("Azul");
        cad1.setMaterial("Madeira");
        cad1.setTipo("Escritório");
        System.out.println("\n1) CADEIRA");
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
        System.out.println("\n2) CANETA");
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
        System.out.println("\n3) CARRO");
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
        System.out.println("\n4) LIVRO");
        System.out.println("Cor: "+l1.getCor());
        System.out.println("Genero "+l1.getGenero());
        System.out.println("Numero de Paginas: "+l1.getPaginas());        
        l1.abrir();
        l1.ler();
        l1.fechar();

        //-----------------------------------------------------------//

        //MOTO
        Moto m1 = new Moto();
        m1.setNome ("Tornado");
        m1.setMarca ("Honda");
        m1.setCl (250); //Cilindradas 
        System.out.println("\n5) MOTO");
        System.out.println("Nome: "+m1.getNome());
        System.out.println("Marca: "+m1.getMarca());
        System.out.println("Cilindradas: "+m1.getCl());
        m1.ligar();        
        m1.passarMarcha();
        m1.acelerar();
        
        //-----------------------------------------------------------//

        //PORTA
        Porta p1 = new Porta();
        p1.setCor ("Branca");
        p1.setMaterial ("Madeira");
        p1.setMacaneta (true);
        System.out.println("\n6) PORTA");
        System.out.println("Cor: "+p1.getCor());
        System.out.println("Material: "+p1.getMaterial());
        System.out.println("Possui maçaneta?: "+p1.getMacaneta());
        p1.destrancar();
        p1.abrir();
        p1.fechar();

        //-----------------------------------------------------------//

        //PRODUTO
        Produto pro1 = new Produto();
        pro1.setNome("Garrafa(Agua)");
        pro1.setMarca("Bonafonte");
        pro1.setValor(2.20f);
        System.out.println("\n7) PRODUTO");
        System.out.println("Nome: "+pro1.getNome());
        System.out.println("Marca: "+pro1.getMarca());
        System.out.println("Valor: "+pro1.getValor());
        pro1.destampar();
        pro1.beber();
        pro1.reclicar();

        //-----------------------------------------------------------//

        //TECLADO
        Teclado t1 = new Teclado();
        t1.setCor("Preto");
        t1.setMarca("HyperX");
        t1.setNumTeclas(88);
        System.out.println("\n8) TECLADO");
        System.out.println("Cor: "+t1.getCor());
        System.out.println("Marca: "+t1.getMarca());
        System.out.println("Numero de Teclas: "+t1.getNumTeclas());
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

        //TELEVISÃO
        Televisao tv1 = new Televisao();

        //Atributos
        tv1.marca = "LG";
        tv1.cor = "Prata";
        tv1.funciona = true;

        System.out.println("\n" +tv1.marca+ "\n" +tv1.cor+ "\n" +tv1.funciona);

        //Métodos
        tv1.ligar();

        tv1.mudarCanal();

        tv1.desligar();
    }

}
