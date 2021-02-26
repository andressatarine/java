public class Continhas{
    public static void main(String args[]){
        int a,b,c;

        a = 10;
        b = 7;
        
        c = a + b;
        System.out.println("Valor da Soma = " + c);

        c = a - b;
        System.out.println("Valor da Subtração = " + c);

        c = a * b;
        System.out.println("Valor da Multiplicação = " + c);

        c = a / b;
        System.out.println("Valor da Divisão = " + c);

        c = a % b; //aqui eu pego o resto da divisao de 10 por 7
        System.out.println("Valor do Resto = " + c);

        float d;
        d = (float)a / b;

        System.out.println("Valor da divisao real = " + d);

        d = 10.0f/3;
        System.out.println("Valor da divisao = " + d);

    }
}