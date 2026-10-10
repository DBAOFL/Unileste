public class ItemEmprestimo {
    private Livro livro;
    private boolean devolvido;

    /* CONSTRUCTOR */
    public ItemEmprestimo(Livro livro) {
        if (livro != null) {   
            this.livro = livro;
        }
        this.devolvido = false;
    }

    /* GETTERS */
    public Livro getLivro() {
        return livro;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    /* FUNCTIONS */
    public void registrarDevolucao() {
        this.devolvido = true;
        livro.devolver();
    }
}
