quantidade = int(input("Digite a quantidade de alunos da turma: "))

if quantidade <= 0:
    print("Quantidade inválida.")
else:
    soma = 0.0
    cont_a = cont_b = cont_c = cont_d = 0

    for contador in range(1, quantidade + 1):
        nota = float(input(f"Digite a nota do aluno {contador}: "))
        soma += nota

        if nota >= 8:
            print(" Conceito A")
            cont_a += 1
        elif nota >= 6:
            print(" Conceito B")
            cont_b += 1
        elif nota >= 4:
            print(" Conceito C")
            cont_c += 1
        else:
            print(" Conceito D")
            cont_d += 1

    media = soma / quantidade
    perc_a = (cont_a / quantidade) * 100
    perc_b = (cont_b / quantidade) * 100
    perc_c = (cont_c / quantidade) * 100
    perc_d = (cont_d / quantidade) * 100

    print(f"Média geral da turma: {media:.2f}")
    print(f"Conceito A: {perc_a:.2f} %")
    print(f"Conceito B: {perc_b:.2f} %")
    print(f"Conceito C: {perc_c:.2f} %")
    print(f"Conceito D: {perc_d:.2f} %")