import java.time.LocalDate;
import java.util.ArrayList;

public class Emprestimo {
    private int codigo;
    private LocalDate dataEmprestimo;
    private boolean aberto;
    private Leitor leitor;
    private ArrayList<ItemEmprestimo> itens;

    /* CONSTRUCTOR */
    public Emprestimo(int codigo, Leitor leitor) {
        if (codigo > 0) {
            this.codigo = codigo;
        }
        this.dataEmprestimo = LocalDate.now();
        this.aberto = true;
        this.leitor = leitor;
        this.itens = new ArrayList<ItemEmprestimo>();
    }

    /* GETTERS */
    public int getCodigo() {
        return codigo;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public boolean adicionarLivro(Livro livro) {
        if (aberto) {
            if (!contemLivro(livro)) {
                ItemEmprestimo item = new ItemEmprestimo(livro);
                itens.add(item);
                return true;
            }
        }
        return false;
    }

    public boolean contemLivro(Livro livro) {
        for (ItemEmprestimo item : itens) {
            if (item.getLivro().equals(livro)) {
                return true;
            }
        }
        return false;
    }

    public void finalizar() {
        this.aberto = false;
        for (ItemEmprestimo item : itens) {
            item.registrarDevolucao();
            item.getLivro().devolver();
        }
    }

    public String toString() {
        return "\n=== Emprestimos ===\nCódigo: " + codigo + "\n" + leitor.toString() + "\nData: " + dataEmprestimo + "\n - Aberto: " + aberto + "\n - Itens: " + itens.size();
    }
}
