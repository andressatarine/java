import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, qtdpar, qtdimp, qtdneg, qtdpos;

        qtdpar = 0;
        qtdimp = 0;
        qtdneg = 0;
        qtdpos = 0;

        for (int cont = 1; cont <=5; cont++){
            N = teclado.nextInt();

            if (N %2 ==0){
                qtdpar++;
            }
            else{
                qtdimp++;
            }
            if (N < 0){
                qtdneg ++;
            }
            else if (N > 0){
            qtdpos++;
            }
        }
        System.out.println(qtdpar + " valor(es) par(es)");
        System.out.println(qtdimp + " valor(es) impar(es)");
        System.out.println(qtdpos + " valor(es) positivo(s)");
        System.out.println(qtdneg + " valor(es) negativo(s)");
    }
}