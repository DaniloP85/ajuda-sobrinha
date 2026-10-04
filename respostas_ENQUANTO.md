# Enquanto

## Questão 1 - Aprovação de concreto

Durante o controle de qualidade de uma obra, foram coletadas medidas de resistência à compressão de 5 corpos de prova. Para cada resultado, informe **"Aprovado"** (>= 25 MPa) ou **"Reprovado"**. Ao final, mostre também a quantidade de corpos de prova aprovados.

```
algoritmo "Questao1Aprovacaodeconcreto"
var
  valorCorpoProva: real
  contador, aprovados: inteiro

inicio

  contador <- 1
  aprovados <- 0
  enquanto contador <= 5 faca
    escreva("Digite a resistência do corpo ", contador, " de prova (MPa): ")
    leia(valorCorpoProva)
    se (valorCorpoProva >= 25) entao
      escreval(" Aprovado")
      aprovados <- aprovados + 1
    senao
      escreval(" Reprovado")
    fimse
    contador <- contador + 1
  fimenquanto

  escreval("Quantidade de corpos de prova aprovados: ", aprovados)

fimalgoritmo
```

## Questão 2 - Controle de produtividade

Uma equipe produziu determinada quantidade de m² de alvenaria durante 7 dias.
Para cada dia, informe **"Produtividade satisfatória"** (>= 20 m²) ou **"Produtividade baixa"**.
Ao final, mostre o total de m² produzidos durante os 7 dias.

```
algoritmo "Questao2Controledeprodutividade"

var
  producao, total: real
  contador: inteiro

inicio

  contador <- 1
  total <- 0
  enquanto contador <= 7 faca
    escreva("Digite a produção do dia ", contador, " (m²): ")
    leia(producao)
    se (producao >= 20) entao
      escreval(" Produtividade satisfatória")
    senao
      escreval(" Produtividade baixa")
    fimse
    total <- total + producao
    contador <- contador + 1
  fimenquanto

  escreval("Total produzido nos 7 dias: ", total, " m²")

fimalgoritmo
```

## Questão 3 - Medição de pilares

Para cada um dos 10 pilares, leia largura e altura (cm) e calcule a área = largura * altura.
Informe **"Dentro do padrão"** (área >= 900 cm²) ou **"Verificar projeto"**.
Ao final, informe quantos pilares estão dentro do padrão.

```
algoritmo "Questao3Medicaodepilares"

var
  largura, altura, area: real
  contador, dentroPadrao: inteiro

inicio

  contador <- 1
  dentroPadrao <- 0
  enquanto contador <= 10 faca
    escreval("Pilar ", contador)
    escreva("  Digite a largura (cm): ")
    leia(largura)
    escreva("  Digite a altura (cm): ")
    leia(altura)
    area <- largura * altura
    escreval("  Área da seção: ", area, " cm²")
    se (area >= 900) entao
      escreval("  Dentro do padrão")
      dentroPadrao <- dentroPadrao + 1
    senao
      escreval("  Verificar projeto")
    fimse
    contador <- contador + 1
  fimenquanto

  escreval("Pilares dentro do padrão: ", dentroPadrao)

fimalgoritmo
```

## Questão 4 - Controle de temperatura durante a concretagem

Leia 8 temperaturas. Se estiver entre 10 °C e 30 °C, **"Temperatura adequada"**;
caso contrário, **"Temperatura inadequada"**.
Ao final, informe quantas medições apresentaram temperatura inadequada.

```
algoritmo "Questao4Controledetemperatura"
var
  temperatura: real
  contador, inadequadas: inteiro

inicio

  contador <- 1
  inadequadas <- 0
  enquanto contador <= 8 faca
    escreva("Digite a temperatura da medição ", contador, " (°C): ")
    leia(temperatura)
    se (temperatura >= 10) e (temperatura <= 30) entao
      escreval(" Temperatura adequada")
    senao
      escreval(" Temperatura inadequada")
      inadequadas <- inadequadas + 1
    fimse
    contador <- contador + 1
  fimenquanto

  escreval("Medições com temperatura inadequada: ", inadequadas)

fimalgoritmo
```

## Questão 5 - Análise de consumo de água

Durante 5 dias, leia o consumo diário (litros) e classifique:
Até 5.000: **"Consumo normal"**; de 5.001 até 8.000: **"Consumo elevado"**;
acima de 8.000: **"Consumo muito elevado"**.
Ao final, mostre o consumo total de água.

```
algoritmo "Questao5Analisedeconsumodeagua"

var
  consumo, total: real
  contador: inteiro

inicio

  contador <- 1
  total <- 0
  enquanto contador <= 5 faca
    escreva("Digite o consumo do dia ", contador, " (litros): ")
    leia(consumo)
    se (consumo <= 5000) entao
      escreval(" Consumo normal")
    senao
      se (consumo <= 8000) entao
        escreval(" Consumo elevado")
      senao
        escreval(" Consumo muito elevado")
      fimse
    fimse
    total <- total + consumo
    contador <- contador + 1
  fimenquanto

  escreval("Consumo total de água: ", total, " litros")

fimalgoritmo
```

## Questão 6 - Controle de caminhões de concreto

Para cada um dos 10 caminhões, leia a quantidade transportada e a utilizada (m³).
Calcule a sobra. **"Aproveitamento adequado"** se utilizou pelo menos 95% do transportado;
caso contrário, **"Verificar desperdício"**.
Ao final, mostre o total transportado e o total utilizado.

```
algoritmo "Questao6Controledecaminhoesdeconcreto"

var
  transportado, utilizado, sobra, totalTransportado, totalUtilizado: real
  contador: inteiro

inicio

  contador <- 1
  totalTransportado <- 0
  totalUtilizado <- 0
  enquanto contador <= 10 faca
    escreval("Caminhão ", contador)
    escreva("  Concreto transportado (m³): ")
    leia(transportado)
    escreva("  Concreto utilizado (m³): ")
    leia(utilizado)
    sobra <- transportado - utilizado
    escreval("  Sobra: ", sobra, " m³")
    se (utilizado >= 0.95 * transportado) entao
      escreval("  Aproveitamento adequado")
    senao
      escreval("  Verificar desperdício")
    fimse
    totalTransportado <- totalTransportado + transportado
    totalUtilizado <- totalUtilizado + utilizado
    contador <- contador + 1
  fimenquanto

  escreval("Total transportado: ", totalTransportado, " m³")
  escreval("Total utilizado: ", totalUtilizado, " m³")

fimalgoritmo
```

## Questão 7 - Inspeção de materiais

Para cada um dos 12 lotes, leia a quantidade recebida e a prevista no pedido.
Informe **"Quantidade correta"**, **"Quantidade inferior ao pedido"** ou **"Quantidade superior ao pedido"**.
Ao final, informe quantos lotes apresentaram quantidade diferente da prevista.

```
algoritmo "Questao7Inspecaodemateriais"
var
  recebida, prevista: real
  contador, diferentes: inteiro

inicio

  contador <- 1
  diferentes <- 0
  enquanto contador <= 12 faca
    escreval("Lote ", contador)
    escreva("  Quantidade recebida: ")
    leia(recebida)
    escreva("  Quantidade prevista no pedido: ")
    leia(prevista)
    se (recebida = prevista) entao
      escreval("  Quantidade correta")
    senao
      se (recebida < prevista) entao
        escreval("  Quantidade inferior ao pedido")
      senao
        escreval("  Quantidade superior ao pedido")
      fimse
      diferentes <- diferentes + 1
    fimse
    contador <- contador + 1
  fimenquanto

  escreval("Lotes com quantidade diferente da prevista: ", diferentes)

fimalgoritmo
```