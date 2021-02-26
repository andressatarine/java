import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        // variaveis
        int X;
        double Y, kml;

        // entrada
        X = teclado.nextInt();
        Y = teclado.nextDouble();

        //processamento
        kml = X / Y;

        //saida
        System.out.printf("%.3f km/l\n" , kml);
      
    }
}