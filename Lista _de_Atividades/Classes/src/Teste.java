public class Teste {
    
    public static void main(String[] args) {
        
        //CARRO
        Carro c1 = new Carro();

        //Atributos
        c1.nome = "Uno";
        c1.marca = "FIAT";
        c1.vel = 20;

        System.out.println(c1.nome + "\n" + c1.marca + "\n" + c1.vel);
        
        //Métodos
        c1.acelerar(100);

        System.out.println("Velocidade acelerando " +c1.vel+"Km/h");

        c1.freiar(120);

        System.out.println("Velocidade reduzindo " +c1.vel+"Km/h");

        c1.buzinar();

        //-----------------------------------------------------------//

        //CADEIRA
        Cadeira cad1 = new Cadeira();

        //Atributos
        cad1.cor = "Couro";
        cad1.material = "Metal";
        cad1.tipo = "Escritório";

        System.out.println("\n" + cad1.cor +"\n"+ cad1.material + "\n" + cad1.tipo);

        //Métodos
        cad1.arrastar();

        cad1.sentar();

        cad1.levantar();

        //-----------------------------------------------------------//

        //CANETA
        Caneta can1 = new Caneta();

        //Atributos
        can1.cor = "Azul";
        can1.marca = "BIC";
        can1.ponta = 1.0f;

        System.out.println("\n" + can1.cor +"\n"+ can1.marca + "\n" + can1.ponta);
        
        //Métodos
        can1.destampar();

        can1.escrever();

        can1.tampar();

        //-----------------------------------------------------------//

        //LIVRO
        Livro l1 = new Livro();

        //Atributos
        l1.cor = "Amarelo";
        l1.genero = "Auto-Ajuda";
        l1.paginas = 200;

        System.out.println("\n" + l1.cor +"\n"+ l1.genero + "\n" + l1.paginas + " páginas");

        //Métodos
        l1.abrir();

        l1.ler();

        l1.fechar();

        //-----------------------------------------------------------//

        //MOTO
        Moto m1 = new Moto();
        
        //Atributos
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
    }

}
