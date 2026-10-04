# PARA
## Questão 1 - Aprovação de concreto

Durante o controle de qualidade de uma obra, foram coletadas medidas de resistência à compressão de 5 corpos de prova.

Faça um algoritmo em VisuAlg que utilize uma estrutura para para ler a resistência de cada corpo de prova, em MPa.

Para cada resultado, informe:
- **"Aprovado"**, se a resistência for maior ou igual a 25 MPa;
- **"Reprovado"**, caso contrário.
Ao final, mostre também a quantidade de corpos de prova aprovados.

```
algoritmo "Questao1Aprovacaodeconcreto"

var
  valorCorpoProva: real
  contador, aprovados: inteiro

inicio

  aprovados <- 0
  para contador de 1 ate 5 passo 1 faca
    escreva("Digite a resistência do corpo ", contador, " de prova (MPa): ")
    leia(valorCorpoProva)
    se (valorCorpoProva >= 25) entao
      escreval(" Aprovado")
      aprovados <- aprovados + 1
    senao
      escreval(" Reprovado")
    fimse
  fimpara

  escreval("Quantidade de corpos de prova aprovados: ", aprovados)

fimalgoritmo
```

## Questão 2 - Controle de produtividade

Uma equipe de trabalhadores produziu determinada quantidade de metros quadrados de alvenaria durante 7 dias.

Faça um algoritmo que utilize uma estrutura para para ler a produção de cada dia.

Para cada dia, informe:

- **"Produtividade satisfatória"**, se a produção for maior ou igual a 20 m²;
- **"Produtividade baixa"**, caso contrário.
Ao final, mostre o total de metros quadrados produzidos durante os 7 dias.

```
algoritmo "Questao2Controledeprodutividade"

var
  producao, total: real
  contador: inteiro

inicio

  total <- 0
  para contador de 1 ate 7 passo 1 faca
    escreva("Digite a produção do dia ", contador, " (m²): ")
    leia(producao)
    se (producao >= 20) entao
      escreval(" Produtividade satisfatória")
    senao
      escreval(" Produtividade baixa")
    fimse
    total <- total + producao
  fimpara

  escreval("Total produzido nos 7 dias: ", total, " m²")

fimalgoritmo
```

## Questão 3 - Medição de pilares

Um engenheiro está verificando as dimensões de 10 pilares de uma construção.

Para cada pilar, leia sua largura e altura, em centímetros.

Calcule a área da seção transversal utilizando a fórmula:

> Área = largura × altura

Para cada pilar, informe:

- **"Dentro do padrão"**, se a área for maior ou igual a 900 cm²;
- **"Verificar projeto"**, caso contrário.
Ao final, informe quantos pilares estão dentro do padrão.

```
algoritmo "Questao3Medicaodepilares"

var
  largura, altura, area: real
  contador, dentroPadrao: inteiro

inicio

  dentroPadrao <- 0
  para contador de 1 ate 10 passo 1 faca
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
  fimpara

  escreval("Pilares dentro do padrão: ", dentroPadrao)

fimalgoritmo
```

## Questão 4 - Controle de temperatura durante a concretagem

Durante uma concretagem, a equipe registra a temperatura do concreto em 8 momentos diferentes.

Faça um algoritmo que utilize uma estrutura para para ler as 8 temperaturas.

Para cada medição:

- Se a temperatura estiver entre 10 °C e 30 °C, informe **"Temperatura adequada"**;

Caso contrário, informe **"Temperatura inadequada"**.

Ao final, informe quantas medições apresentaram temperatura inadequada.

```
algoritmo "Questao4Controledetemperatura"

var
  temperatura: real
  contador, inadequadas: inteiro

inicio

  inadequadas <- 0
  para contador de 1 ate 8 passo 1 faca
    escreva("Digite a temperatura da medição ", contador, " (°C): ")
    leia(temperatura)
    se (temperatura >= 10) e (temperatura <= 30) entao
      escreval(" Temperatura adequada")
    senao
      escreval(" Temperatura inadequada")
      inadequadas <- inadequadas + 1
    fimse
  fimpara

  escreval("Medições com temperatura inadequada: ", inadequadas)

fimalgoritmo
```

## Questão 5 - Análise de consumo de água

Durante 5 dias, uma obra registrou o consumo diário de água.

Faça um algoritmo que utilize uma estrutura para para ler o consumo de cada dia, em litros.

Para cada dia, classifique o consumo de acordo com os seguintes critérios:

- Até 5.000 litros: **"Consumo normal"**;
- De 5.001 até 8.000 litros: **"Consumo elevado"**; 
- Acima de 8.000 litros: **"Consumo muito elevado"**.

Ao final, mostre o consumo total de água durante os cinco dias.

```
algoritmo "Questao5Analisedeconsumodeagua"

var
  consumo, total: real
  contador: inteiro

inicio

  total <- 0
  para contador de 1 ate 5 passo 1 faca
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
  fimpara

  escreval("Consumo total de água: ", total, " litros")

fimalgoritmo
```

## Questão 6 - Controle de caminhões de concreto

Uma obra recebeu 10 caminhões de concreto.

Para cada caminhão, leia:

- a quantidade de concreto transportada, em m³;
- a quantidade de concreto efetivamente utilizada na obra, em m³.

Calcule a quantidade de concreto que sobrou em cada caminhão.

Para cada caminhão, informe:

- **"Aproveitamento adequado"**, se pelo menos 95% do concreto transportado foi utilizado;
- **"Verificar desperdício"**, caso o aproveitamento seja inferior a 95%.

Ao final, mostre a quantidade total de concreto transportado e a quantidade total utilizada.

```
algoritmo "Questao6Controledecaminhoesdeconcreto"

var
  transportado, utilizado, sobra, totalTransportado, totalUtilizado: real
  contador: inteiro

inicio

  totalTransportado <- 0
  totalUtilizado <- 0
  para contador de 1 ate 10 passo 1 faca
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
  fimpara

  escreval("Total transportado: ", totalTransportado, " m³")
  escreval("Total utilizado: ", totalUtilizado, " m³")

fimalgoritmo
```

---

#### Questão 7 - Inspeção de materiais

Durante uma inspeção, um engenheiro precisa verificar 12 lotes de materiais recebidos em uma obra.

Para cada lote, leia:

- a quantidade recebida;
- a quantidade prevista no pedido.

Compare os valores e informe:

- **"Quantidade correta"**, se a quantidade recebida for igual à prevista;
- **"Quantidade inferior ao pedido"**, se a quantidade recebida for menor que a prevista;
- **"Quantidade superior ao pedido"**, se a quantidade recebida for maior que a prevista.

Ao final, informe quantos lotes apresentaram quantidade diferente da prevista.

```
algoritmo "Questao7Inspecaodemateriais"

var
  recebida, prevista: real
  contador, diferentes: inteiro

inicio

  diferentes <- 0
  para contador de 1 ate 12 passo 1 faca
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
  fimpara

  escreval("Lotes com quantidade diferente da prevista: ", diferentes)

fimalgoritmo
```