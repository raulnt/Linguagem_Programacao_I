public class Ex02 {
    public static void main(String[] args){

        /*a)*/
        System.out.println("a)");
        exA();

        /*b)*/
        System.out.println("\nb)");
        exB();

        /*c)*/
        System.out.println("\nc)");
        exC();

        /*d)*/
        System.out.println("\nd)");
        exD();

        /*e)*/
        System.out.println("\ne)");
        exE();

        /*f)*/
        System.out.println("\nf)");
        exF();

    }
    public static void exA(){
        int a = 10;
        int b = 20;
        System.out.println("B = "+b);
        b = 5;
        System.out.println("\nA = "+a+"\nB= "+b);
    }
    public static void exB(){
        int a = 30;
        int b = 20;
        int c = a+b;
        System.out.println("C = "+c);
        b = 10;
        System.out.println("\nB = "+b+"\nC = "+c);
        c = a+b;
        System.out.println("\nA = "+a+"\nB = "+b+"\nC = "+c);
    }
    public static void exC(){
        int a = 10;
        int b = 20;
        int c = a;
        b = c;
        a = b;
        System.out.println("A = "+a+"\nB = "+b+"\nC = "+c);
    }
    public static void exD(){
        int a = 10;
        int b = a + 1;
        a = b + 1;
        b = a + 1;
        System.out.println("A = "+a);
        a = b + 1;
        System.out.println("\nA = "+a+"\nB = "+b);
    }
    public static void exE(){
        int a = 10;
        int b = 5;
        int c = a+b;
        b = 20;
        a = 10;
        System.out.println("A = "+a+"\nB = "+b+"\nC = "+c);
    }
    public static void exF(){
        int x = 1;
        int y = 2;
        int z = y - x;
        System.out.println("Z = "+z);
        x = 5;
        y = x + z;
        System.out.println("\nX = "+x+"\nY = "+y+"\nZ = "+z);
    }
}
