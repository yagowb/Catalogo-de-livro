public class Autor {

    private String nome;
    private String email;
    private String cpf;


    public Autor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrar(){
        System.out.println("Nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("e-mail: " + email);
    }
}
