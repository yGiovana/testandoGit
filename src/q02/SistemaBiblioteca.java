package q02;

import q01.Biblioteca;
import q01.Exemplar;
import q01.Livro;

import java.util.Scanner;


    class SistemaBiblioteca {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);



            System.out.println(" Cadastro de Biblioteca ");
            System.out.print("Digite o endereço da biblioteca: ");
            String endereco = scanner.nextLine();

            System.out.print("Digite o telefone da biblioteca: ");
            String telefone = scanner.nextLine();

            Biblioteca biblioteca = new Biblioteca(endereco, telefone);


            System.out.println(" Cadastro de Livro ");
            System.out.print("Digite o título do livro: ");
            String titulo = scanner.nextLine();

            System.out.print("Digite o ano do livro: ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o gênero do livro: ");
            String genero = scanner.nextLine();

            Livro livro = new Livro(titulo, ano, genero);

            System.out.print("Digite o nome do autor: ");
            String autor = scanner.nextLine();
            livro.adicionarAutor(autor);


            System.out.println(" Cadastro de Exemplar ");
            System.out.print("Digite o código do exemplar: ");
            String codigo = scanner.nextLine();

            Exemplar exemplar = new Exemplar(codigo, livro, biblioteca);


            System.out.println("Cadastro realizado com sucesso");
            System.out.println(biblioteca);
            System.out.println(livro);
            System.out.println("Autores: " + livro.getAutores());
            System.out.println(exemplar);


        }
    }

