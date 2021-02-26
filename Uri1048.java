import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double s, ns, rea;
        int perc;

        s = teclado.nextDouble();

        if (s >= 0 && s <= 400.00){
            perc = 15;
            rea = s * perc / 100;
            ns = s + rea;

            System.out.printf("Novo salario: %.2f\n" , ns);
            System.out.printf("Reajuste ganho: %.2f\n" , rea);
            System.out.printf("Em percentual: %d %%\n" , perc);
        }
        else if (s >= 400.01 && s <= 800.00){
            perc = 12;
            rea = s * perc / 100;
            ns = s + rea;

            System.out.printf("Novo salario: %.2f\n" , ns);
            System.out.printf("Reajuste ganho: %.2f\n" , rea);
            System.out.printf("Em percentual: %d %%\n" , perc);
        }
        else if (s >= 800.01 && s <= 1200.00){
            perc = 10;
            rea = s * perc / 100;
            ns = s + rea;

            System.out.printf("Novo Salario: %.2f\n" , ns);
            System.out.printf("Reajuste ganho: %.2f\n" , rea);
            System.out.printf("Em percentual: %d %%\n" , perc);
        }
        else if (s >= 1200.01 && s <= 2000.00){
            perc = 7;
            rea = s * perc / 100;
            ns = s + rea;

            System.out.printf("Novo Salario: %.2f\n" , ns);
            System.out.printf("Reajuste ganho: %.2f\n" , rea);
            System.out.printf("Em percentual: %d %%\n" , perc);
        }
        else if (s >= 2000.01){
            perc = 4;
            rea = s * perc / 100;
            ns = s + rea;

            System.out.printf("Novo Salario: %.2f\n" , ns);
            System.out.printf("Reajuste ganho: %.2f\n" , rea);
            System.out.printf("Em percentual: %d %%\n" , perc);
        }
    }
}

