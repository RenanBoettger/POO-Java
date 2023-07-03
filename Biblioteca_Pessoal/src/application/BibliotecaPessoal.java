package application;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class BibliotecaPessoal {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Digite o caminho ou o nome do arquivo de dados da biblioteca: ");
        String caminhoArquivo = scanner.nextLine();
    	
        Biblioteca biblioteca = carregarBiblioteca(caminhoArquivo);
        
        int opcao;
        do {
            System.out.println("\n--- Biblioteca Pessoal ---");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Consultar livros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarLivro(biblioteca, scanner);
                    break;
                case 2:
                    consultarLivros(biblioteca);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        salvarBiblioteca(biblioteca, caminhoArquivo);
    }

    private static void adicionarLivro(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o ano de publicação: ");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Livro livro = new Livro(titulo, autor, anoPublicacao);
        biblioteca.adicionarLivro(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void consultarLivros(Biblioteca biblioteca) {
        List<Livro> livros = biblioteca.getLivros();
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca!");
        } else {
            System.out.println("--- Livros na biblioteca ---");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    private static void salvarBiblioteca(Biblioteca biblioteca, String caminhoArquivo) {
        try {
            FileOutputStream fileOut = new FileOutputStream(caminhoArquivo);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(biblioteca);
            objOut.close();
            fileOut.close();
            System.out.println("Biblioteca salva com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar a biblioteca: " + e.getMessage());
        }
    }

    private static Biblioteca carregarBiblioteca(String caminhoArquivo) {
        Biblioteca biblioteca = new Biblioteca();

        try {
            FileInputStream fileIn = new FileInputStream(caminhoArquivo);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            biblioteca = (Biblioteca) objIn.readObject();
            objIn.close();
            fileIn.close();
            System.out.println("Biblioteca carregada com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar a biblioteca: " + e.getMessage());
        }

        return biblioteca;
    }
}

