

    package q01;

    public class Exemplar {
        private String codigo;
        private Livro livro;
        private Biblioteca biblioteca;
        private String status;

        public Exemplar(String codigo, Livro livro, Biblioteca biblioteca) {
            this.codigo = codigo;
            this.livro = livro;
            this.biblioteca = biblioteca;
            this.status = "disponivel";
        }


        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public Livro getLivro() {
            return livro;
        }

        public void setLivro(Livro livro) {
            this.livro = livro;
        }

        public Biblioteca getBiblioteca() {
            return biblioteca;
        }

        public void setBiblioteca(Biblioteca biblioteca) {
            this.biblioteca = biblioteca;
        }

        public String getStatus() {
            return status; }

        public void setStatus(String status) {
            this.status = status;
        }

        public String toString() {
            return "Exemplar: " + codigo + " | Status: " + status + " | " + livro.getTitulo();
        }
    }



