import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, valor;

        N = teclado.nextInt();
        valor = 1;

        for (int linha = 1; linha <= N; linha++){
            System.out.println(valor + " " + (valor+1) + " " + (valor+2) + " PUM");
            valor += 4;
        }
    }
}