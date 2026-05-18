package q01;

public class Bibliotecario {


        private String nome;
        private String matricula;
        private Biblioteca unidadeTrabalho;

        public Bibliotecario(String nome, String matricula, Biblioteca unidadeTrabalho) {
            this.nome = nome;
            this.matricula = matricula;
            this.unidadeTrabalho = unidadeTrabalho;
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public Biblioteca getUnidadeTrabalho() {
            return unidadeTrabalho;
        }

        public void setUnidadeTrabalho(Biblioteca unidadeTrabalho) {
            this.unidadeTrabalho = unidadeTrabalho;
        }


        public String toString() {
            return "Bibliotecário: " + nome + " | Matrícula: " + matricula;
        }
    }

