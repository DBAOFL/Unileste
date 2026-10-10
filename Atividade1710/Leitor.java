public class Leitor {
    private int codigo;
    private String nome;
    private String email;

    /* CONSTRUCTOR */
    public Leitor(int codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
    }

    /* GETTERS */
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }

    /* FUNCTIONS */
    public void atualizarDados(String nome, String email) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
        if (email != null && !email.isBlank()) {
            this.email = email;
        }
    }

    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Email: " + email;
    }
}
