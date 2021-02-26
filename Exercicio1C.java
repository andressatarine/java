import java.util.Scanner;

public class Exercicio1C{
    public static void main(String args[]){
    Scanner teclado;
        teclado = new Scanner(System.in);

        double a, b, c, d;

        System.out.println("Digite a valor da Base Maior: ");
        a = teclado.nextDouble();

        System.out.println("Digite a valor da Base Menor: ");
        b = teclado.nextDouble();

        System.out.println("Digite a valor da Altura: ");
        c = teclado.nextDouble();

        d = (a + b) * c / 2;
        System.out.printf("A área do trapezio de bases %.2f e altura %.2f vale %.2f\n ", a, b, c, d );
        
    }
}