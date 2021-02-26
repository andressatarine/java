import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float N;
        int qtd=0;

        for (int cont = 1; cont <=6; cont++){
            N = teclado.nextFloat();
            if (N > 0){
                //System.out.println("Numero digitado é positivo");
                qtd = qtd + 1;
            }
        }
        System.out.println(qtd + " valores positivos");
    }
}