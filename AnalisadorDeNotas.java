import java.util.Scanner;

public class AnalisadorDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos da turma: ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
        } else {
            double soma = 0;
            int contA = 0, contB = 0, contC = 0, contD = 0;

            for (int contador = 1; contador <= quantidade; contador++) {
                System.out.print("Digite a nota do aluno " + contador + ": ");
                double nota = scanner.nextDouble();
                soma += nota;

                if (nota >= 8) {
                    System.out.println(" Conceito A");
                    contA++;
                } else if (nota >= 6) {
                    System.out.println(" Conceito B");
                    contB++;
                } else if (nota >= 4) {
                    System.out.println(" Conceito C");
                    contC++;
                } else {
                    System.out.println(" Conceito D");
                    contD++;
                }
            }

            double media = soma / quantidade;
            double percA = ((double) contA / quantidade) * 100;
            double percB = ((double) contB / quantidade) * 100;
            double percC = ((double) contC / quantidade) * 100;
            double percD = ((double) contD / quantidade) * 100;

            System.out.printf("Média geral da turma: %.2f%n", media);
            System.out.printf("Conceito A: %.2f %%\n", percA);
            System.out.printf("Conceito B: %.2f %%\n", percB);
            System.out.printf("Conceito C: %.2f %%\n", percC);
            System.out.printf("Conceito D: %.2f %%\n", percD);
        }

        scanner.close();
    }
}