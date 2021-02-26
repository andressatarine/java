import java.util.Scanner;

public class Exercicio1{
    public static void main(String args[]){
    Scanner teclado;
        teclado = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite o valor do Lado ");
        a = teclado.nextDouble();

        b = a * a;
        System.out.println("A área do quadrado é = " + b);
        
    }
}