import java.util.InputMismatchException;
import java.util.Scanner;
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Digite um valor inteiro..:");
            int numero1 = s.nextInt();
            System.out.print("Digite um valor inteiro..:");
            int numero2 = s.nextInt();

            System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
        } catch (InputMismatchException ex) {
              System.out.println("ERRO - Valor digitado nao e um numero inteiro!");
        } catch (ArithmeticException ex){
            System.out.println("ERRO - Impossivel realizar divisão por zero!");
        }

    }
}