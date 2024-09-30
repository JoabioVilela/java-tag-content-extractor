# Tag Content Extractor (tag-content-extractor)

Recentemente me submeti a um teste desafio de uma vaga de Dev Java numa empresa multinacional.

O teste foi online e monitorado, e era proibido consultar IA's, mas consultar o Google era permitido. Compartilhei minha tela via MS Teams para que o recrutador assistisse ao teste em tempo real.

A duração máxima do teste era de uma hora e o recrutador escolheu aplicar um teste desafio da plataforma Hacker Rank www.hackerrank.com. Link para o desafio: https://www.hackerrank.com/challenges/tag-content-extractor/problem

Em resumo, o programa Java deve receber como entrada um texto baseado em tags. Ex.:

"4<br>
\<h1>Nayeem loves counseling\</h1><br>
\<h1>\<h1>Sanjay has no watch\</h1>\</h1><par>So wait for a while\</par><br>
\<Amee>safat codes like a ninja\</amee><br>
<SA premium>Imtiaz has a secret crush</SA premium>"<br>

E deve ter como saída apenas os conteúdos das tags válidas. Assim:

"Nayeem loves counseling<br>
Sanjay has no watch<br>
So wait for a while<br>
None<br>
Imtiaz has a secret crush"<br>

Na primeira linha da entrada consta um caracter tipo int que representa a quantidade de linhas do texto abaixo. Nas linhas seguintes consta o texto baseado em tags. O algoritmo deve processar a entrada e apresentar apenas os conteúdos das tags válidas. Quando uma tag não é válida o algoritmo deve imprimir "None". Além disso, há outras regras (restrições) que podem ser lidas na descrição integral do teste disponível neste link: https://www.hackerrank.com/challenges/tag-content-extractor/problem

Para resolver este desafio usei entrada e saída, variáveis, estruturas de repetição, estruturas de decisão e Regex.

Hoje decidi publicar a minha solução (arquivo TagContentExtractor.java).

Aqui está uma captura de tela de uma execução da minha solução com a entrada em cor verde e a saída em cor preta:

![image](https://github.com/user-attachments/assets/5b983310-5b4c-4557-b37d-2846b2141508)
