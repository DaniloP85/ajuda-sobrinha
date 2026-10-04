# Exercício: Analisador de notas

Analisador de notas com conceito final
Um professor quer um programa onde ele insira as notas de uma turma (quantidade de alunos é informada no início).
Ao final, o programa deve:

1. Mostrar média geral da turma
2. Mostrar o percentual de alunos em cada conceito, considerando:
    
    - A - 8 <= nota <= 10
    - B - 6 <= nota < 8
    - C - 4 <= nota < 6
    - D - 0 <= nota < 4

---

> com para
```
algoritmo "AnalisadorDeNotas"

var
  nota, soma, media, percA, percB, percC, percD: real
  quantidade, contador, contA, contB, contC, contD: inteiro

inicio

  soma <- 0
  contA <- 0
  contB <- 0
  contC <- 0
  contD <- 0

  escreva("Digite a quantidade de alunos da turma: ")
  leia(quantidade)

  se (quantidade <= 0) entao
    escreval("Quantidade inválida.")
  senao
    para contador de 1 ate quantidade passo 1 faca
      escreva("Digite a nota do aluno ", contador, ": ")
      leia(nota)
      soma <- soma + nota
      se (nota >= 8 e nota <= 10) entao
        escreval(" Conceito A")
        contA <- contA + 1
      senao
        se (nota >= 6 e nota < 8 ) entao
          escreval(" Conceito B")
          contB <- contB + 1
        senao
          se (nota >= 4 e nota < 6) entao
            escreval(" Conceito C")
            contC <- contC + 1
          senao
            escreval(" Conceito D")
            contD <- contD + 1
          fimse
        fimse
      fimse
    fimpara

    media <- soma / quantidade
    percA <- contA / quantidade * 100
    percB <- contB / quantidade * 100
    percC <- contC / quantidade * 100
    percD <- contD / quantidade * 100

    escreval("Média geral da turma: ", media:5:2)
    escreval("Conceito A: ", percA:6:2, " %")
    escreval("Conceito B: ", percB:6:2, " %")
    escreval("Conceito C: ", percC:6:2, " %")
    escreval("Conceito D: ", percD:6:2, " %")
  fimse

fimalgoritmo
```

---

> com quanto:

```
algoritmo "AnalisadorDeNotasEnquanto"
var
  nota, soma, media, percA, percB, percC, percD: real
  quantidade, contador, contA, contB, contC, contD: inteiro

inicio

  soma <- 0
  contA <- 0
  contB <- 0
  contC <- 0
  contD <- 0

  escreva("Digite a quantidade de alunos da turma: ")
  leia(quantidade)

  se (quantidade <= 0) entao
    escreval("Quantidade inválida.")
  senao
    contador <- 1
    enquanto contador <= quantidade faca
      escreva("Digite a nota do aluno ", contador, ": ")
      leia(nota)
      soma <- soma + nota
      se (nota >= 8) entao
        escreval(" Conceito A")
        contA <- contA + 1
      senao
        se (nota >= 6) entao
          escreval(" Conceito B")
          contB <- contB + 1
        senao
          se (nota >= 4) entao
            escreval(" Conceito C")
            contC <- contC + 1
          senao
            escreval(" Conceito D")
            contD <- contD + 1
          fimse
        fimse
      fimse
      contador <- contador + 1
    fimenquanto

    media <- soma / quantidade
    percA <- contA / quantidade * 100
    percB <- contB / quantidade * 100
    percC <- contC / quantidade * 100
    percD <- contD / quantidade * 100

    escreval("Média geral da turma: ", media:5:2)
    escreval("Conceito A: ", percA:6:2, " %")
    escreval("Conceito B: ", percB:6:2, " %")
    escreval("Conceito C: ", percC:6:2, " %")
    escreval("Conceito D: ", percD:6:2, " %")
  fimse

fimalgoritmo
```
---

# Exercício: Positivos e negativos

Desenvolva um programa que leia uma sequência de números até o usuário digitar 0 e mostre quantos números positivos e quantos negativos foram digitados.

```
algoritmo "PositivosENegativos"

var
  numero: real
  positivos, negativos: inteiro

inicio

  positivos <- 0
  negativos <- 0

  escreva("Digite um número (0 para encerrar): ")
  leia(numero)

  enquanto numero <> 0 faca
    se (numero > 0) entao
      positivos <- positivos + 1
    senao
      negativos <- negativos + 1
    fimse
    escreva("Digite um número (0 para encerrar): ")
    leia(numero)
  fimenquanto

  escreval("Quantidade de números positivos: ", positivos)
  escreval("Quantidade de números negativos: ", negativos)

fimalgoritmo
```