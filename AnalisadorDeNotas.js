const readline = require('readline-sync');

const quantidade = parseInt(readline.question("Digite a quantidade de alunos da turma: "));

if (quantidade <= 0) {
    console.log("Quantidade inválida.");
} else {
    let soma = 0;
    let contA = 0, contB = 0, contC = 0, contD = 0;

    for (let contador = 1; contador <= quantidade; contador++) {
        const nota = parseFloat(readline.question(`Digite a nota do aluno ${contador}: `));
        soma += nota;

        if (nota >= 8) {
            console.log(" Conceito A");
            contA++;
        } else if (nota >= 6) {
            console.log(" Conceito B");
            contB++;
        } else if (nota >= 4) {
            console.log(" Conceito C");
            contC++;
        } else {
            console.log(" Conceito D");
            contD++;
        }
    }

    const media = soma / quantidade;
    const percA = (contA / quantidade) * 100;
    const percB = (contB / quantidade) * 100;
    const percC = (contC / quantidade) * 100;
    const percD = (contD / quantidade) * 100;

    console.log(`Média geral da turma: ${media.toFixed(2)}`);
    console.log(`Conceito A: ${percA.toFixed(2)} %`);
    console.log(`Conceito B: ${percB.toFixed(2)} %`);
    console.log(`Conceito C: ${percC.toFixed(2)} %`);
    console.log(`Conceito D: ${percD.toFixed(2)} %`);
}