import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double A, B, C, MEDIA;

        A = teclado.nextDouble() * 2;
        B = teclado.nextDouble() * 3;
        C = teclado.nextDouble() * 5;

        MEDIA = (A + B + C) / 10;

        System.out.printf("MEDIA = %.1f\n" , MEDIA );
      
    }
}