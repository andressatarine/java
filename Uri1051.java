import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

         double sal, imp;

        sal = teclado.nextDouble();

        if (sal <= 2000.00){
            System.out.println("Isento");
        }
        else if (sal <= 3000.00){
            imp = (sal - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n" , imp);
        }
        else if (sal <= 4500.00){
            imp = (sal - 3000.00) * 0.18 + 80.00;
            System.out.printf("R$ %.2f\n" , imp);
        }
        else{
            imp = (sal - 4500.00) * 0.28 + 270.00 + 80.00;
            System.out.printf("R$ %.2f\n" , imp);
        }
    }
}

