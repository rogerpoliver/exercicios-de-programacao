# Exercicios de programação para iniciantes.

Uma lista de exercicios de programação para iniciantes ou para quem quer dominar estruturas de dados em uma nova linguagem de programação.

### Nível 01

- [x] 1. Faça um Programa que mostre a mensagem "Alo mundo" na tela.
     <br>
- [x] 2. Faça um Programa que peça um número e então mostre a mensagem: _O número informado foi <número>_.
     <br>
- [ ] 3. Faça um Programa que peça dois números e imprima a soma.
     <br>
- [ ] 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
     <br>
- [ ] 5. Faça um Programa que converta metros para centímetros.
     <br>
- [ ] 6. Faça um Programa que peça o raio de um círculo, calcule e mostre
     sua área.
     <br>
- [ ] 7. Faça um Programa que calcule a área de um quadrado, em seguida
     mostre o dobro desta área para o usuário.
     <br>
- [ ] 8. Faça um Programa que pergunte quanto você ganha por hora e o
     número de horas trabalhadas no mês. Calcule e mostre o total do seu
     salário no referido mês.
     <br>
- [ ] 9. Faça um Programa que peça a temperatura em graus Farenheit,
     transforme e mostre a temperatura em graus Celsius.
     `C = (5 \* (F-32) / 9).`
     <br>
- [ ] 10. Faça um Programa que peça a temperatura em graus Celsius,
      transforme e mostre em graus Farenheit.
      <br>
- [ ] 11. Faça um Programa que peça 2 números inteiros e um número real.
      Calcule e mostre: - o produto do dobro do primeiro com metade do segundo . - a soma do triplo do primeiro com o terceiro. - o terceiro elevado ao cubo.
      <br>
- [ ] 12. Tendo como dados de entrada a altura de uma pessoa, construa um
      algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
      (72.7\*altura) - 58
      <br>
- [ ] 13. Faça um Programa que pergunte quanto você ganha por hora e o
      número de horas trabalhadas no mês. Calcule e mostre o total do seu
      salário no referido mês, sabendo-se que são descontados 11% para o
      Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
      programa que nos dê:
      a. salário bruto.
      b. quanto pagou ao INSS.
      c. quanto pagou ao sindicato.
      d. o salário líquido.
      e. calcule os descontos e o salário líquido, conforme a tabela
      abaixo:

  | Descrição | Porcentagem |
  | --------- | ----------- |
  | IR        | 11%         |
  | INSS      | 8%          |
  | Sindicato | 5%          |

  ```
  Descontos = IR + INSS + Sindicato
  ```

  ```
  Salário líquido = Salário bruto - Descontos
  ```

  <br>

- [ ] 14. Faça um programa que peça o tamanho de um arquivo para download
      (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
      informe o tempo aproximado de download do arquivo usando este link
      (em minutos).

### Nível 02

- [ ] 1. Faça um Programa que peça dois números e imprima o maior deles.
     <br>
- [ ] 2. Faça um Programa que peça um valor e mostre na tela se o valor é
     positivo ou negativo.
     <br>
- [ ] 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
     Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
     <br>
- [ ] 4. Faça um Programa que verifique se uma letra digitada é vogal ou
     consoante.
     <br>
- [ ] 5. Faça um programa para a leitura de duas notas parciais de um aluno.
     O programa deve calcular a média alcançada por aluno e apresentar:
     - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
     - A mensagem "Reprovado", se a média for menor do que sete;
     - A mensagem "Aprovado com Distinção", se a média for igual a dez.
       <br>
- [ ] 6. Faça um Programa que leia três números e mostre o maior deles.
     <br>
- [ ] 7. Faça um Programa que leia três números e mostre o maior e o menor
     deles.
     <br>
- [ ] 8. Faça um programa que pergunte o preço de três produtos e informe
     qual produto você deve comprar, sabendo que a decisão é sempre
     pelo mais barato.
     <br>
- [ ] 9. Faça um Programa que leia três números e mostre-os em ordem
     decrescente.
     <br>
- [ ] 10. Faça um Programa que pergunte em que turno você estuda. Peça
      para digitar M - Matutino, V - Vespertino ou N - Noturno. Imprima a
      mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
      Inválido!", conforme o caso.
      <br>
- [ ] 11. As Organizações Tabajara resolveram dar um aumento de salário aos
      seus colaboradores e lhe contraram para desenvolver o programa que
      calculará os reajustes.
      Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual.

  | Salário                        | Aumento |
  | ------------------------------ | ------- |
  | Até R\$ 280,00 (incluindo)     | 20%     |
  | Entre R\$ 280,00 e R\$ 700,00  | 15%     |
  | Entre R\$ 700,00 e R\$ 1500,00 | 10%     |
  | De R\$ 1500,00 em diante       | 5%      |

  Após o aumento ser realizado, informe na tela:

  - salário antes do reajuste.
  - percentual de aumento aplicado.
  - valor do aumento.
  - novo salário, após o aumento.
    <br>

* [ ] 12. Faça um programa para o cálculo de uma folha de pagamento,
      sabendo que os descontos são do Imposto de Renda, que depende do
      salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
      FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
      a empresa que deposita). O Salário Líquido corresponde ao Salário
      Bruto menos os descontos. O programa deverá pedir ao usuário o
      valor da sua hora e a quantidade de horas trabalhadas no mês.

  - Desconto do IR:

  | Salário                            | Desconto |
  | ---------------------------------- | -------- |
  | Bruto até 900 (inclusive)          | Isento   |
  | Bruto até 1500 (inclusive)         | 5%       |
  | Salário Bruto até 2500 (inclusive) | 10%      |
  | Salário Bruto acima de 2500        | 20%      |

  Imprima na tela as informações, dispostas conforme o exemplo abaixo.
  No exemplo o valor da hora é 5 e a quantidade de hora é 220.

  |                           |             |
  | ------------------------- | ----------- |
  | Salário Bruto: (5 \* 220) | R\$ 1100,00 |
  | (-) IR (5%)               | R\$ 55,00   |
  | (-) INSS ( 10%)           | R\$ 110,00  |
  | FGTS (11%)                | R\$ 121,00  |
  | Total de descontos        | R\$ 165,00  |
  | Salário Liquido           | R\$ 935,00  |

    <br>

- [ ] 13. Faça um Programa que leia um número e exiba o dia correspondente
      da semana. (1 - Domingo, 2 - Segunda, etc.), se digitar outro valor deve
      aparecer valor inválido.
      <br>
- [ ] 14. Faça um programa que lê as duas notas parciais obtidas por um aluno
      numa disciplina ao longo de um semestre, e calcule a sua média. A
      atribuição de conceitos obedece à tabela abaixo:

  | Média            | Nota de Conceito |
  | ---------------- | ---------------- |
  | Entre 9.0 e 10.0 | A                |
  | Entre 7.5 e 9.0  | B                |
  | Entre 6.0 e 7.5  | C                |
  | Entre 6.0 e 4.0  | D                |
  | Entre 4.0 e zero | E                |

O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
<br>

- [ ] 15. Faça um Programa que peça os 3 lados de um triângulo. O programa
      deverá informar se os valores podem ser um triângulo. Indique, caso
      os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
      escaleno.
      Dicas:
  - Três lados formam um triângulo quando a soma de quaisquer
    dois lados for maior que o terceiro;
  - Triângulo Equilátero: três lados iguais;
  - Triângulo Isósceles: quaisquer dois lados iguais;
  - Triângulo Escaleno: três lados diferentes;
    <br>
- [ ] 16. Faça um programa que calcule as raízes de uma equação do segundo
      grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
      b e c e fazer as consistências, informando ao usuário nas seguintes
      situações:
      a. Se o usuário informar o valor de A igual a zero, a equação não é
      do segundo grau e o programa não deve fazer pedir os demais
      valores, sendo encerrado;
      b. Se o delta calculado for negativo, a equação não possui raizes
      reais. Informe ao usuário e encerre o programa;
      c. Se o delta calculado for igual a zero a equação possui apenas
      uma raiz real; informe-a ao usuário;
      d. Se o delta for positivo, a equação possui duas raiz reais;
      informe-as ao usuário;
      <br>
- [ ] 17. Faça um Programa que peça um número correspondente a um
      determinado ano e em seguida informe se este ano é ou não bissexto.
      <br>
- [ ] 18. Faça um Programa que peça um número inteiro e determine se ele é
      par ou impar. Dica: utilize o operador módulo (resto da divisão).
      <br>
- [ ] 19. Faça um Programa que leia 2 números e em seguida pergunte ao
      usuário qual operação ele deseja realizar. O resultado da operação
      deve ser acompanhado de uma frase que diga se o número é:
  - par ou ímpar;
  - positivo ou negativo;
    <br>
- [ ] 20. Faça um programa que faça 5 perguntas para uma pessoa sobre um
      crime. As perguntas são:
      - "Telefonou para a vítima?"
      - "Esteve no local do crime?"
      - "Mora perto da vítima?"
      - "Devia para a vítima?"
      - "Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
Caso contrário, ele será classificado como "Inocente".
<br>

- [ ] 21. Um posto está vendendo combustíveis com a seguinte tabela de
      descontos:

  | Litros      | Tipo     | Desconto por litro |
  | ----------- | -------- | ------------------ |
  | Até 20      | Álcool   | 3%                 |
  | Acima de 20 | Álcool   | 5%                 |
  | Até 20      | Gasolina | 4%                 |
  | Acima de 20 | Gasolina | 6%                 |

Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A - Álcool, G - Gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R\$ 2,50 o preço do litro do álcool é R\$ 1,90.
<br>

- [ ] 22. Uma fruteira está vendendo frutas com a seguinte tabela de preços:

  | Descrição | Preço Até 5 Kg | Preço acima de 5 Kg |
  | --------- | -------------- | ------------------- |
  | Morango   | 2,50 por Kg    | 2,20 por Kg         |
  | Maçã      | 1,80 por Kg    | 1,50 por Kg         |

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R\$ 25,00, receberá ainda um desconto de 10% sobre este total.
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
<br>

- [ ] 23.O Hipermercado Tabajara está com uma promoção de carnes que é
      imperdível. Confira:

  | Descrição  | Até 5 Kg        | Acima de 5 Kg   |
  | ---------- | --------------- | --------------- |
  | File Duplo | R\$ 4,90 por Kg | R\$ 5,80 por Kg |
  | Alcatra    | R\$ 5,90 por Kg | R\$ 6,80 por Kg |
  | Picanha    | R\$ 6,90 por Kg | R\$ 7,80 por Kg |

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.

### Nível 03

**_ Em Breve _**

<hr>

#### Fontes

- https://wiki.python.org.br//EstruturaSequencial
- https://wiki.python.org.br/EstruturaDeRepeticao
- https://wiki.python.org.br/EstruturaDeDecisao
- http://www.pb.utfpr.edu.br/omero/Java/Fontes/Lista%20Vetores/Lista%20Vetores.HTMl
