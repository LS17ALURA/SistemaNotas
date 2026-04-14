package br.inatel.poo.turmas;

public class Turma {
    private int quantidadeAlunos = 0;
    private Aluno[] alunos = new Aluno[20];

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            this.alunos[quantidadeAlunos] = aluno;
            this.quantidadeAlunos++;
        }
    }

    public void listarAlunos() {
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i] != null) {
                alunos[i].mostrarInfo();
            }
        }
    }

    public Aluno buscarMelhorAluno() {
        if (quantidadeAlunos == 0) return null;

        Aluno melhor = alunos[0];
        for (int i = 1; i < quantidadeAlunos; i++) {
            if (alunos[i].calcularMedia() > melhor.calcularMedia()) {
                melhor = alunos[i];
            }
        }
        return melhor;
    }
}