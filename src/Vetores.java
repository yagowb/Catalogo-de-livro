public class Vetores {

    public static void main(String[] args) {
        int[] lista = new int[10];

        //System.out.println(lista.length);

        for (int pos=0; pos < lista.length; pos++){
            lista[pos] = (int)(Math.random()*100);
        }

        int maior = lista[0];
        int menor = lista[0];
        double soma = 0;

        for (int pos=0; pos < lista.length; pos++){
            if (maior < lista[pos]){ maior = lista[pos];}
            if (menor > lista[pos]){ menor = lista[pos];}
            soma += lista[pos];
        }

        //mostrar vetor
        for (int pos=0; pos < lista.length; pos++){
            System.out.println("" + pos + " - " + lista[pos]);
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + (soma/ lista.length));


        //mostrar vetor
        for (int j= lista.length; j  > 1 ; j--) {
            for (int i = 0; i < (j - 1); i++) {
                if (lista[i] > lista[i + 1]) {
                    int aux = lista[i];
                    lista[i] = lista[i+1];
                    lista[i+1] = aux;
                }
            }
        }

        //mostrar vetor
        for (int pos=0; pos < lista.length; pos++){
            System.out.print(lista[pos] + "   ");
        }


    }
}