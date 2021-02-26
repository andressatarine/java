import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double A, B, MEDIA;

        A = teclado.nextDouble() * 3.5;
        B = teclado.nextDouble() * 7.5;

        MEDIA = (A + B) / 11;

        System.out.printf("MEDIA = %.5f\n" , MEDIA );
      
    }
}