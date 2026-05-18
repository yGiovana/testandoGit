package q01;

import java.time.LocalDate;

    public class Emprestimo {
        private Exemplar exemplar;
        private Usuario usuario;
        private LocalDate dataEmprestimo;
        private LocalDate dataPrevistaDevolucao;
        private LocalDate dataEfetivaDevolucao;

        public Emprestimo(Exemplar exemplar, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataPrevistaDevolucao) {
            this.exemplar = exemplar;
            this.usuario = usuario;
            this.dataEmprestimo = dataEmprestimo;
            this.dataPrevistaDevolucao = dataPrevistaDevolucao;
            this.exemplar.setStatus("emprestado");
        }


        public Exemplar getExemplar() {
            return exemplar;
        }

        public void setExemplar(Exemplar exemplar) {
            this.exemplar = exemplar;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public LocalDate getDataEmprestimo() {
            return dataEmprestimo;
        }

        public void setDataEmprestimo(LocalDate dataEmprestimo) { this.dataEmprestimo = dataEmprestimo; }

        public LocalDate getDataPrevistaDevolucao() {
            return dataPrevistaDevolucao;
        }

        public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
            this.dataPrevistaDevolucao = dataPrevistaDevolucao; }

        public LocalDate getDataEfetivaDevolucao() {
            return dataEfetivaDevolucao;
        }

        public void setDataEfetivaDevolucao(LocalDate dataEfetivaDevolucao) {
            this.dataEfetivaDevolucao = dataEfetivaDevolucao;
            this.exemplar.setStatus("disponivel");
        }


        public String toString() {
            return "Empréstimo: " + exemplar.getLivro().getTitulo() + " para " + usuario.getNome();

            // Realizando alteracao para um treinamento de git
        }
    }

