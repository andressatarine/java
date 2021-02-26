import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float N, media=0;
        int qtd=0;

        for (int cont = 1; cont <=6; cont++){
            N = teclado.nextFloat();
            if (N > 0){
                //System.out.println("Numero digitado é positivo");
                qtd++;
                media = media + N;
            }
        }
        System.out.println(qtd + " valores positivos");
        System.out.printf("%.1f\n", media/qtd);
    }
}