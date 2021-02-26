import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C, peri, area;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        if ( ( A + B > C ) && ( A + C > B ) && ( B + C > A)){
            peri = A + B + C;
            System.out.printf("Perimetro = %.1f\n" , peri);
        }
        else{
            area = (A + B) * C/ 2;
            System.out.printf("Area = %.1f\n" , area);
        }
    }
}       