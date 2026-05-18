package q01;

import java.util.ArrayList;
import java.util.List;

    public class Usuario {
        private String nome;
        private String cpf;
        private String tipo;
        private List<String> historicoEmprestimos;

        public Usuario(String nome, String cpf, String tipo) {
            this.nome = nome;
            this.cpf = cpf;
            this.tipo = tipo;
            this.historicoEmprestimos = new ArrayList<>();
        }

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getCpf() {
            return cpf;

        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public List<String> getHistoricoEmprestimos() {
            return historicoEmprestimos;
        }

        public void adicionarEmprestimo(String emprestimo) {
            historicoEmprestimos.add(emprestimo);
        }


        public String toString() {
            return "Usuário: " + nome + " | CPF: " + cpf + " | Tipo: " + tipo;
        }
    }