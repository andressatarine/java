import java.util.Scanner;

public class Exercicio1B{
    public static void main(String args[]){
    Scanner teclado;
        teclado = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite a valor da Base: ");
        a = teclado.nextDouble();

        System.out.println("Digite a valor da Altura: ");
        b = teclado.nextDouble();

        c = (a * b)/2;
        System.out.printf("A área do triangulo é = %.3f\n " , c );
        
    }
}