package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();

        System.out.println("### SISTEMA ACADÊMICO INATEL ###");

        // Criando os 3 objetos Aluno
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nCadastro do Aluno " + i + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();

            double[] notas = new double[3];
            for (int j = 0; j < notas.length; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }
            scanner.nextLine();

            // Adicionando à turma
            Aluno aluno = new Aluno(nome, matricula, notas);
            turma.adicionarAluno(aluno);
        }

        // Listagem
        System.out.println("\n--- RELATÓRIO GERAL ---");
        turma.listarAlunos();

        // Melhor aluno
        Aluno melhor = turma.buscarMelhorAluno();
        if (melhor != null) {
            System.out.println("--- DESTAQUE DA TURMA ---");
            System.out.println("Melhor Aluno: " + melhor.getNome());
            System.out.printf("Média Final: %.2f%n", melhor.calcularMedia());
        }

        scanner.close();
    }
}