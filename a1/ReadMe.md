#Atividade 1 - Análise de Algoritimos da UAM - Nota Recebida: 10
## Enunciado:
Caro(a) aluno(a),



O comportamento assintótico de funções apresentado nesta unidade é uma poderosa técnica empregada na comparação da eficiência entre algoritmos. Análises desse tipo são fundamentais para que a inserção de um novo procedimento computacional em um sistema já existente não comprometa o seu desempenho geral.

Considere que um sistema responsável por executar várias operações matemáticas precisa ser atualizado. Até o momento, uma das principais operações executadas é a soma de matrizes, cujo algoritmo é descrito a seguir.


```
Algoritmo SomaMatriz

Entrada: duas matrizes A e B quadradas de tamanho n

Saída: matriz C correspondente à soma das matrizes A e B

1. para i = 1 até n faça

2. para j = 1 até n faça

3. C[ i, j ] = A[ i, j ] + B[ i, j ]

4. fim para

5. fim para

6. retorna C
```


Um novo procedimento de multiplicação de matrizes precisa ser introduzido no sistema. O algoritmo que executa essa operação é descrito a seguir.

```

Algoritmo MultiplicaMatriz

Entrada: duas matrizes A e B quadradas de tamanho n

Saída: Matriz C correspondente ao produto das matrizes A e B

1. para i = 1 até n faça

2. para j = 1 até n faça

3. para k = 1 até n faça

3. C[ i, j ] = C[ i, j ]  + A[ i, k ] x B[ k, j ]

4. fim para

4. fim para

5. fim para

6. retorna C

```

Proposta

Considerando o cenário apresentado:

Explique se a eficiência do sistema permanecerá a mesma ou se sofrerá alguma alteração com a introdução do novo procedimento de multiplicação de matrizes.

Fundamente sua explicação apresentando um comparativo das complexidades dos dois algoritmos.

Submeta o arquivo de sua resposta para avaliação docente.
##Minha Resposta:
