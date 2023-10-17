import java.util.Scanner;

public class Ex080 {
    public static void main(String[] args) {
        int[] q = new int[20];
        Scanner scanner = new Scanner(System.in);
 
         for(int i = 0; i<20; i++){
             System.out.println("Digite números inteiros e positivos: ");
             int verificador = scanner.nextInt();
 
             if(verificador <0) {
                 System.out.println("Apenas números positivos");
                 i--;
              }else{
                 q[i] = verificador; 
              }
         } 
 
         int maiorvalor = 0;
         int posicao = 0;
         for(int i= 0; i<20; i++){
             if(q[i]>maiorvalor){
                 maiorvalor = q[i];
                 posicao = i;
             }
         }
 
         System.out.println("Maior Valor: "+maiorvalor+"\nPosição: "+(posicao+1));
     } 
}
