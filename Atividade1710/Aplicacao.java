import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {
    private static Scanner scanner = new Scanner(System.in);
    private Biblioteca biblioteca = new Biblioteca();

    /* MAIN */
    public static void main(String[] args) {
        Aplicacao app = new Aplicacao();
        app.executar();
    }

    /* FUNCTIONS */
    public void executar() {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            processarOpcao(opcao);
        } while (opcao != 0);
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1: {
                System.out.print("Digite o código do leitor: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o nome do leitor: ");
                String nome = scanner.nextLine();

                System.out.print("Digite o e-mail do leitor: ");
                String email = scanner.nextLine();

                Leitor leitor = new Leitor(codigo, nome, email);

                if (biblioteca.cadastrarLeitor(leitor)) {
                    System.out.println("Leitor cadastrado com sucesso!");
                } else {
                    System.out.println("Não foi possível cadastrar o leitor.");
                }
                break;
            }

            case 2: {
                System.out.print("Digite o código do leitor: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                Leitor leitor = biblioteca.consultarLeitor(codigo);
                if (leitor != null){
                    System.out.println(leitor);
                } else {
                    System.out.println("Leitor não encontrado.");
                }
                break;
            }

            case 3:
                biblioteca.listarLeitores();
                break;

            case 4: {
                System.out.print("Digite o código do leitor: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                Leitor leitor = biblioteca.consultarLeitor(codigo);

                if (leitor != null) {
                    System.out.print("Digite o novo nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o novo e-mail: ");
                    String email = scanner.nextLine();

                    leitor.atualizarDados(nome, email);
                    System.out.println("Dados do leitor atualizados!");
                } else {
                    System.out.println("Leitor não encontrado.");
                }
                break;
            }

            case 5: {
                System.out.print("Digite o código do leitor: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                Leitor leitor = biblioteca.consultarLeitor(codigo);

                if (leitor != null) {
                    if (biblioteca.removerLeitor(leitor)) {
                        System.out.println("Leitor removido com sucesso!");
                    } else {
                        System.out.println("Não foi possível remover o leitor.");
                    }
                } else {
                    System.out.println("Leitor não encontrado.");
                }
                break;
            }

            case 6: {
                System.out.print("Digite o código do livro: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o título do livro: ");
                String titulo = scanner.nextLine();

                System.out.print("Digite o autor do livro: ");
                String autor = scanner.nextLine();

                Livro livro = new Livro(codigo, titulo, autor);

                if (biblioteca.cadastrarLivro(livro)) {
                    System.out.println("Livro cadastrado com sucesso!");
                } else {
                    System.out.println("Não foi possível cadastrar o livro.");
                }
                break;
            }

            case 7: {
                System.out.print("Digite o código do livro: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                Livro livro = biblioteca.consultarLivro(codigo);
                if (livro != null){
                    System.out.println(livro);
                } else {
                    System.out.println("Livro não encontrado.");
                }
                break;
            }

            case 8:
                biblioteca.listarLivros();
                break;

            case 9: {
                System.out.print("Digite o código do livro: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                Livro livro = biblioteca.consultarLivro(codigo);

                if (livro != null) {
                    System.out.print("Digite o novo título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Digite o novo autor: ");
                    String autor = scanner.nextLine();

                    livro.atualizarDados(titulo, autor);
                    System.out.println("Dados do livro atualizados!");
                } else {
                    System.out.println("Livro não encontrado.");
                }
                break;
            }

            case 10: {
                System.out.print("Digite o código do livro: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                Livro livro = biblioteca.consultarLivro(codigo);

                if (livro != null) {
                    if (biblioteca.removerLivro(livro)) {
                        System.out.println("Livro removido com sucesso!");
                    } else {
                        System.out.println("Não foi possível remover o livro.");
                    }
                } else {
                    System.out.println("Livro não encontrado.");
                }
                break;
            }

            case 11: {
                System.out.print("Digite o código do leitor: ");
                int codigoLeitor = scanner.nextInt();
                scanner.nextLine();

                Leitor leitor = biblioteca.consultarLeitor(codigoLeitor);

                if (leitor == null) {
                    System.out.println("Leitor não encontrado.");
                    break;
                }

                ArrayList<Livro> livros = new ArrayList<Livro>();
                String continuar;

                do {
                    System.out.print("Digite o código do livro: ");
                    int codigoLivro = scanner.nextInt();
                    scanner.nextLine();

                    Livro livro = biblioteca.consultarLivro(codigoLivro);

                    if (livro != null) {
                        if (!livros.contains(livro)) {
                            livros.add(livro);
                            System.out.println("Livro adicionado ao empréstimo.");
                        } else {
                            System.out.println("Esse livro já foi informado.");
                        }
                    } else {
                        System.out.println("Livro não encontrado.");
                    }

                    System.out.print("Deseja adicionar outro livro? (s/n): ");
                    continuar = scanner.nextLine();

                } while (continuar.equalsIgnoreCase("s"));

                if (livros.isEmpty()) {
                    System.out.println("Nenhum livro foi selecionado.");
                    break;
                }

                System.out.print("Digite o código do empréstimo: ");
                int codigoEmprestimo = scanner.nextInt();
                scanner.nextLine();

                if (biblioteca.registrarEmprestimo(codigoEmprestimo, leitor, livros)) {
                    System.out.println("Empréstimo registrado com sucesso!");
                } else {
                    System.out.println("Não foi possível registrar o empréstimo.");
                }
                break;
            }

            case 12:
                biblioteca.listarEmprestimos();
                break;

            case 13: {
                System.out.print("Digite o código do empréstimo: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                if (biblioteca.registrarDevolucao(codigo)) {
                    System.out.println("Devolução registrada com sucesso!");
                } else {
                    System.out.println("Empréstimo não encontrado ou já finalizado.");
                }
                break;
            }

            case 0:
                System.out.println("Encerrando a aplicação...");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    /* MENU */
    private void exibirMenu() {
        System.out.println("\n=== Menu da Biblioteca ===");
        System.out.println("1 - Cadastrar leitor");
        System.out.println("2 - Consultar leitor");
        System.out.println("3 - Listar leitores");
        System.out.println("4 - Atualizar leitor");
        System.out.println("5 - Remover leitor");
        System.out.println("6 - Cadastrar livro");
        System.out.println("7 - Consultar livro");
        System.out.println("8 - Listar livros");
        System.out.println("9 - Atualizar livro");
        System.out.println("10 - Remover livro");
        System.out.println("11 - Registrar empréstimo");
        System.out.println("12 - Listar empréstimos");
        System.out.println("13 - Registrar devolução");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}