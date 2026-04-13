package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        Turma minhaTurma = new Turma();

        // Instanciando alunos com notas
        minhaTurma.adicionarAluno(new Aluno("Marcos", "101", new double[]{8.0, 7.5, 9.0}));
        minhaTurma.adicionarAluno(new Aluno("Julia", "102", new double[]{9.5, 10.0, 9.8}));
        minhaTurma.adicionarAluno(new Aluno("Pedro", "103", new double[]{6.0, 5.5, 7.0}));

        // Listagem
        minhaTurma.listarAlunos();

        // Melhor aluno
        Aluno top = minhaTurma.buscarMelhorAluno();
        if (top != null) {
            System.out.println("O melhor aluno da turma é: " + top.getNome());
        }
    }
}