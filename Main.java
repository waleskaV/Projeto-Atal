import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaSequencial listaLivros = new ListaSequencial(10);  // Capacidade para 10 livros
        Scanner scanner = new Scanner(System.in);

        // Loop para o menu de operações
        while (true) {
            System.out.print("-------------------------------------------------");
            System.out.println();
            System.out.println("\n** MENU BIBLIOTECA DIGITAL **");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Buscar livro por título");
            System.out.println("4 - Ordenar livros por ano de publicação");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
           
            
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.print("-------------------------------------------------");
                    System.out.println();
                    System.out.println();
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação do livro: ");
                    int ano = scanner.nextInt();

                    Livro novoLivro = new Livro(titulo, autor, ano);
                    if (listaLivros.adicionar(novoLivro)) {
                        System.out.println("Livro adicionado com sucesso.");
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.print("-------------------------------------------------");
                    System.out.println();
                    System.out.println("\nLista de livros:");
                    System.out.println();
                    listaLivros.listar();
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.print("-------------------------------------------------");
                    System.out.println();
                    System.out.println();
                    System.out.print("Digite o título do livro que deseja buscar: ");
                    String tituloBusca = scanner.nextLine();
                    Livro livroEncontrado = listaLivros.buscar(tituloBusca);
                    System.out.println();
                    System.out.println(livroEncontrado != null ? livroEncontrado : "Livro não encontrado.");
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    System.out.print("-------------------------------------------------");
                    System.out.println();
                    System.out.println();
                    listaLivros.ordenarPorAno();
                    System.out.println("Livros ordenados por ano de publicação.");
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    System.out.print("-------------------------------------------------");
                    System.out.println();
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
