import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int tempo, velo;
        double litros;

        tempo = teclado.nextInt();
        velo = teclado.nextInt();
        
        litros = tempo * velo / 12.0;

        System.out.printf("%.3f\n" , litros);
      
    }
}