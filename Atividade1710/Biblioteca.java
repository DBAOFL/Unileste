import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Leitor> leitores = new ArrayList<Leitor>();
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    /* LEITORES */

    public boolean cadastrarLeitor(Leitor leitor) {
        if (leitor == null || leitor.getCodigo() <= 0) {
            return false;
        }

        if (consultarLeitor(leitor.getCodigo()) != null) {
            return false;
        }

        leitores.add(leitor);
        return true;
    }

    public Leitor consultarLeitor(int codigo) {
        for (Leitor leitor : leitores) {
            if (leitor.getCodigo() == codigo) {
                return leitor;
            }
        }
        return null;
    }

    public void listarLeitores() {
        if (leitores.isEmpty()) {
            System.out.println("Nenhum leitor cadastrado.");
            return;
        }

        for (Leitor leitor : leitores) {
            System.out.println(leitor);
        }
    }

    public boolean removerLeitor(Leitor leitor) {
        if (leitor == null) {
            return false;
        }

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.isAberto()
                    && emprestimo.getLeitor().equals(leitor)) {
                return false;
            }
        }

        return leitores.remove(leitor);
    }


    /* LIVROS */

    public boolean cadastrarLivro(Livro livro) {
        if (livro == null || livro.getCodigo() <= 0) {
            return false;
        }

        if (consultarLivro(livro.getCodigo()) != null) {
            return false;
        }

        livros.add(livro);
        return true;
    }

    public Livro consultarLivro(int codigo) {
        for (Livro livro : livros) {
            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }

        return null;
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public boolean removerLivro(Livro livro) {
        if (livro == null) {
            return false;
        }

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.isAberto() && emprestimo.contemLivro(livro)) {
                return false;
            }
        }

        return livros.remove(livro);
    }

    /* EMPRÉSTIMOS */

    public boolean registrarEmprestimo(int codigo, Leitor leitor, ArrayList<Livro> livros) {
        if (codigo <= 0 || leitor == null || livros == null || livros.isEmpty()) {
            return false;
        }

        if (consultarLeitor(leitor.getCodigo()) == null) {
            return false;
        }

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getCodigo() == codigo) {
                return false;
            }
        }

        for (Livro livro : livros) {
            if (livro == null || consultarLivro(livro.getCodigo()) == null) {
                return false;
            }

            if (livros.indexOf(livro) != livros.lastIndexOf(livro)) {
                return false;
            }

            for (Emprestimo emprestimo : emprestimos) {
                if (emprestimo.isAberto() && emprestimo.contemLivro(livro)) {
                    return false;
                }
            }
        }

        Emprestimo emprestimo = new Emprestimo(codigo, leitor);

        for (Livro livro : livros) {
            if (!emprestimo.adicionarLivro(livro)) {
                return false;
            }
            livro.emprestar();
        }

        this.emprestimos.add(emprestimo);
        return true;
    }

    public void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo cadastrado.");
            return;
        }

        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
        }
    }

    public boolean registrarDevolucao(int codigo) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getCodigo() == codigo && emprestimo.isAberto()) {
                emprestimo.finalizar();
                return true;
            }
        }

        return false;
    }
}