# Estrutura de descisão

## Exercício 01

Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10.

```
Algoritmo "Lista02_Ex01"
Var
   numero:inteiro
Inicio
   escreva("Digite um número: ")
   leia(numero)
 
   se( numero > 10 )
      escreval("O número é maior que 10")
   fimse
Fimalgoritmo
```

## Exercício 02

Escrever um algoritmo que leia dois valores inteiro distintos e informe qual é o maior.

```
Algoritmo "Lista02_Ex02"
Var
   numero1, numero2:inteiro
Inicio
   escreva("Digite o primeiro número: ")
   leia(numero1)
   escreva("Digite o segundo número: ")
   leia(numero2)
 
   se( numero1 > numero2 ) entao
      escreval(numero1, " é o maior número")
   senao
      escreval(numero2, " é o maior número")
   fimse
Fimalgoritmo
```

## Exercício 03

Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200.

```
Algoritmo "Lista02_Ex03"
Var
   numero:inteiro
Inicio
   escreva("Digite um número: ")
   leia(numero)
   se( (numero >= 100) E (numero <= 200) ) entao
      escreval(numero, " está no intervalo entre 100 e 200")
   fimse
Fimalgoritmo
```

## Exercício 04

Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 6), Reprovado (media < 4) e IFA (media >= 4 E media < 6).

```
Algoritmo "Lista02_Ex04"
Var
 nome:caractere
 nota1, nota2, nota3, media:real
Inicio
   escreva("Digite o nome do aluno: ")
   leia(nome)
   escreva("Digite a primeira nota: ")
   leia(nota1)
   escreva("Digite a segunda nota: ")
   leia(nota2)
   escreva("Digite a terceira nota: ")
   leia(nota3)
   media <- (nota1+nota2+nota3)/3
 
   escreva(nome, "sua média é: ",media:3:2, " e sua menção é: ")
   se(media >= 6) entao
      escreval("Aprovado")
   senao
      se (media < 4)entao
         escreval("Reprovado")
      senao
         escreval("IFA")
      fimse
   fimse
Fimalgoritmo
```

## Exercício 05

Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive).

```
Algoritmo "Lista02_Ex05"
Var
 n1, n2, n3, n4, n5:inteiro //5 de 80, só para testes
 contador:inteiro
Inicio
 contador <-0
 escreva("Digite o 1o número: ")
 leia(n1)
 se( (n1>=10) E (n1 <= 150) ) entao
    contador <- contador+1
 fimse
 escreva("Digite o 2o número: ")
 leia(n2)
 se( (n2>=10) E (n2 <= 150) ) entao
    contador <- contador+1
 fimse
 escreva("Digite o 3o número: ")
 leia(n3)
 se( (n3>=10) E (n3 <= 150) ) entao
    contador <- contador+1
 fimse
 escreva("Digite o 4o número: ")
 leia(n4)
 se( (n4>=10) E (n4 <= 150) ) entao
    contador <- contador+1
 fimse
 escreva("Digite o 5o número: ")
 leia(n5)
 se( (n5>=10) E (n5 <= 150) ) entao
    contador <- contador+1
 fimse
// a sequência acima se repete por mais 75 vezes
 
 escreval( "Existem ",contador," números entre 10 (inclusive) e 150 (inclusive)")
Fimalgoritmo
```

## Exercício 06

Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade.

```
Algoritmo "Lista02_Ex06"
Var
 i1, i2, i3, i4, i5:inteiro //5 de 75, só para testes
Inicio
 escreva("Digite o 1a idade: ")
 leia(i1)
 se( i1 >= 18 ) entao
    escreval("maior de idade")
 senao
    escreval("menor de idade")
 fimse
 escreva("Digite o 2a idade: ")
 leia(i2)
 se( i2 >= 18 ) entao
    escreval("maior de idade")
 senao
    escreval("menor de idade")
 fimse
 escreva("Digite o 3a idade: ")
 leia(i3)
 se( i3 >= 18 ) entao
    escreval("maior de idade")
 senao
    escreval("menor de idade")
 fimse
 escreva("Digite o 4a idade: ")
 leia(i4)
 se( i4 >= 18 ) entao
    escreval("maior de idade")
 senao
    escreval("menor de idade")
 fimse
escreva("Digite o 5a idade: ")
 leia(i5)
 se( i5 >= 18 ) entao
    escreval("maior de idade")
 senao
    escreval("menor de idade")
 fimse

// a sequência acima se repete por mais 70 vezes
 
Fimalgoritmo
```

## Exercício 07 

Escrever um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de homens e de mulheres.

```
Algoritmo "Lista02_Ex07"
Var
 n1, n2, n3, n4, n5:caractere //5 de 56, só para testes
 s1, s2, s3, s4, s5:caractere //5 de 56, só para testes
 totalHomens, totalMulheres:inteiro
Inicio
 escreva("Digite o 1o nome: ")
 leia(n1)
 escreva("Digite o sexo do(a) ", n1, " (m ou f): ")
 leia(s1)
 se(s1="m") entao
    escreval("Homem")
    totalHomens <- totalHomens + 1
 senao
    escreval("Mulher")
    totalMulheres <- totalMulheres+1
 fimse
 escreva("Digite o 2o nome: ")
 leia(n2)
 escreva("Digite o sexo do(a) ", n2, " (m ou f): ")
 leia(s2)
 se(s2="m") entao
    escreval("Homem")
    totalHomens <- totalHomens + 1
 senao
    escreval("Mulher")
    totalMulheres <- totalMulheres+1
 fimse
 escreva("Digite o 3o nome: ")
 leia(n3)
 escreva("Digite o sexo do(a) ", n3, " (m ou f): ")
 leia(s3)
 se(s3="m") entao
    escreval("Homem")
    totalHomens <- totalHomens + 1
 senao
    escreval("Mulher")
    totalMulheres <- totalMulheres+1
 fimse
 escreva("Digite o 4o nome: ")
 leia(n4)
 escreva("Digite o sexo do(a) ", n4, " (m ou f): ")
 leia(s4)
 se(s4="m") entao
    escreval("Homem")
    totalHomens <- totalHomens + 1
 senao
    escreval("Mulher")
    totalMulheres <- totalMulheres+1
 fimse
 escreva("Digite o 5o nome: ")
 leia(n5)
 escreva("Digite o sexo do(a) ", n5, " (m ou f): ")
 leia(s5)
 se(s5="m") entao
    escreval("Homem")
    totalHomens <- totalHomens + 1
 senao
    escreval("Mulher")
    totalMulheres <- totalMulheres+1
 fimse

 
// a sequência acima se repete por mais 51 vezes
escreval("Foram contabilizados ",totalHomens," homens e ", totalMulheres," mulheres !")
 
Fimalgoritmo
```

## Exercício 08

Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. Informe media de preço de custo e do preço de venda.

```
Algoritmo "Lista02_Ex08"
Var
 c1, c2, c3, c4, c5:real //5 de 40, só para testes
 v1, v2, v3, v4, v5:real //5 de 40, só para testes
 mediaCusto, mediaVenda:real
Inicio
 escreva("Digite o 1o preço de custo: ")
 leia(c1)
 escreva("Digite o 1o preço de venda: ")
 leia(v1)
 se(c1>v1) entao
    escreval("Prejuízo")
 senao
    se(v1>c1) entao
       escreval("Lucro")
    senao
       escreval("Empate")
    fimse
 fimse
 escreva("Digite o 2o preço de custo: ")
 leia(c2)
 escreva("Digite o 2o preço de venda: ")
 leia(v2)
 se(c2>v2) entao
    escreval("Prejuízo")
 senao
    se(v2>c2) entao
       escreval("Lucro")
    senao
       escreval("Empate")
    fimse
 fimse
 escreva("Digite o 3o preço de custo: ")
 leia(c3)
 escreva("Digite o 3o preço de venda: ")
 leia(v3)
 se(c3>v3) entao
    escreval("Prejuízo")
 senao
    se(v3>c3) entao
       escreval("Lucro")
    senao
       escreval("Empate")
    fimse
 fimse
 escreva("Digite o 4o preço de custo: ")
 leia(c4)
 escreva("Digite o 4o preço de venda: ")
 leia(v4)
 se(c4>v4) entao
    escreval("Prejuízo")
 senao
    se(v4>c4) entao
       escreval("Lucro")
    senao
       escreval("Empate")
    fimse
 fimse
 escreva("Digite o 5o preço de custo: ")
 leia(c5)
 escreva("Digite o 1o preço de venda: ")
 leia(v5)
 se(c5>v5) entao
    escreval("Prejuízo")
 senao
    se(v5>c5) entao
       escreval("Lucro")
    senao
       escreval("Empate")
    fimse
 fimse

// a sequência acima se repete por mais 35 vezes
 escreval("Média do preço de custo: ",(c1+c2+c3+c4+c5)/5)
 escreval("Média do preço de venda: ",(v1+v2+v3+v4+v5)/5)

Fimalgoritmo
```

## Exercício 09

Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80, menor que 25 ou igual a 40.

```
Algoritmo "Lista02_Ex09"
Var
 num:inteiro
Inicio
escreva("Digite o número: ")
 leia(num)
 se(num>80)entao
    escreval("Numero maior que 80")
 senao
    se (num<25)entao
       escreval("Numero menor que 25")
    senao
       se(num=40) entao
          escreval("Numero igual a 40")
       fimse
    fimse
 fimse
 
Fimalgoritmo
```

## Exercício 10

Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais.

Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes.

```
Algoritmo "Lista02_Ex10"
Var
 num1,num2:inteiro
Inicio
 escreva("Digite o 1o número: ")
 leia(num1)
 escreva("Digite o 2o número: ")
 leia(num2)
 se(num1 = num2) entao
    escreval("Os números são iguais")
 senao
    se(num1>num2)entao
       escreval(num1, " é o maior número")
    senao
       escreval(num2, " é o maior número")
    fimse
    escreval("Os números são diferentes")
 fimse
 
Fimalgoritmo
```
