public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponivel;
    
    /* CONSTRUCTOR */
    public Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    /* GETTERS */
    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    /* FUNCTIONS */
    public void atualizarDados(String titulo, String autor) {
        if (titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        }
        if (autor != null && !autor.isBlank()) {
            this.autor = autor;
        }
    }

    public void emprestar() {
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }

    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Autor: " + autor + ", Disponível: " + disponivel;
    }
}
