import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();

        for (int valor = 2; valor <=N; valor += 2){
            System.out.println(valor + "^2 = " + (valor * valor));
        }
    }
}