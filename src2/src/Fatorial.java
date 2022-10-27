import java.util.InputMismatchException;
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        try{
            System.out.println("Digite um numero: ");
            int i = ler.nextInt();
            if (i < 0){
                Exception e = new Exception("Valor de termo inválido!");
                throw e;
            }
            int fat = 1;
            for (int n = 1; n <= i; n++){
                fat = fat * n;
            }
            System.out.println("Fat(" + i + ") = " + fat);
        } catch (InputMismatchException ex){
            System.out.println("Erro - Digite um numero válido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Boa noite!");
        }
    }
}
