package br.inatel.poo.turmas;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] nts; // Nome do atributo conforme o diagrama

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nts = notas;
    }

    // Getter para permitir que a classe Turma acesse o nome do aluno
    public String getNome() {
        return nome;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : nts) {
            soma += nota;
        }
        return soma / nts.length;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Média: " + String.format("%.2f", calcularMedia()));
        System.out.println("-------------------------");
    }
}