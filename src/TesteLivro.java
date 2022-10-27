public class TesteLivro {

    public static void main(String[] args) {

        Autor a = new Autor("Leo");
        Livro l = new Livro();

        try {
            l.titulo = "Aprenda sobre Exceções";
            l.valor = 10.5;
            //l.autor = a;

            a.mostrar();
            System.out.println("-");

            l.mostrarDetalhes();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
