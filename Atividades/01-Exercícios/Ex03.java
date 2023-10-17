public class Ex03 {
    public static void main(String[] args){
        System.out.println("a)");
        exA();

        System.out.println("\nb)");
        exB();

        System.out.println("\nc)");
        exC();
    }
    public static void comp(double a, double b) {
        if (a == b){
            System.out.println("As operações são iguais.");
        }else{
            System.out.println("As operações são diferentes.");
        }
    }
    public static void exA(){
        double a1 = (4/2)+(2/4);
        double a2 = 4/2+2/4;
        comp(a1, a2);
    }
    public static void exB(){
        double b1 = 4/(2+2)/4;
        double b2 = 4/2+2/4;
        comp(b1, b2);
    }
    public static void exC(){
        double c1 = (4+2)*2-4;
        double c2 = 4+2*2-4;
        comp(c1, c2);
    }
}
