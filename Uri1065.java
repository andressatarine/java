import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, cont, qtdpar=0;

        for (cont = 1; cont <=5; cont++){
            N = teclado.nextInt();
            if (N %2 ==0){
                qtdpar++;
            }
        }
        System.out.println(qtdpar + " valores pares");
    }
}