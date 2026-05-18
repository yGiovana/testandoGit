package q01;

import java.util.ArrayList;
import java.util.List;

    public class Livro {
        private String titulo;
        private List<String> autores;
        private int ano;
        private String genero;

        public Livro(String titulo, int ano, String genero) {
            this.titulo = titulo;
            this.ano = ano;
            this.genero = genero;
            this.autores = new ArrayList<>();
        }


        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {

            this.titulo = titulo; }

        public List<String> getAutores() {
            return autores;
        }

        public void setAutores(List<String> autores) {
            this.autores = autores;
        }

        public void adicionarAutor(String autor) {
            autores.add(autor); }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }


        public String toString() {
            return "Livro: " + titulo + " | Ano: " + ano + " | Gênero: " + genero;
        }
    }

