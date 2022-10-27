public class Livro {
    String titulo;
    Autor autor;
    double valor;


    public void mostrarDetalhes() throws Exception{
        System.out.println("Titulo: " + titulo);
        System.out.println("R$ " + valor);
        try {
            autor.mostrar();
        }
        catch (Exception e){
            throw new Exception("Livro sem Autor");
        }
    }
}
