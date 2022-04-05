package listadecontatos;

public class Contato {
    String nome;
    String email;
    String celular;
    public Contato(){

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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Contato(String nome, String celular, String email){
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", telefone='" + celular + '\'' +
                ", endereco='" + email + '\'' +
                '}';
    }


}
