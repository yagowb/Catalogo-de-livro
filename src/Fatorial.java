import java.util.InputMismatchException;
import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        try{
            int n, prod = 1, i = 0;

            System.out.println("Digite um número: ");
            n = prompt.nextInt();

            if (n<0){
                throw new Exception("Termo inválido");
            }

            while(i < n){
                i = i + 1;
                prod = prod * i;
            }
            System.out.println("O fatorial de " + n + " é igual a: " + prod);

        }
        catch (InputMismatchException e) {
            System.out.println("Apenas números são aceitos!");
        }
        catch (Exception  e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Boa noite!");
        }
    }
}
