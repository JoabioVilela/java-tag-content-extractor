# Java Tag Content Extractor (tag-content-extractor)

Você tem enfrentado desafios técnicos que testam suas habilidades de programação Java? Aqui está um que enfrentei recentemente!

Na busca por novas oportunidades como desenvolvedor Java, recentemente me submeti a um desafio técnico de uma vaga de Dev Java numa empresa multinacional.

O teste foi online e monitorado, e era proibido consultar IA's, mas consultar o Google era permitido. Compartilhei minha tela via MS Teams para que o recrutador assistisse ao teste em tempo real. A cada nova linha de código eu tinha que falar o que estava fazendo, pois o vídeo estava sendo gravado para posterior avaliação técnica.

A duração máxima do teste era de uma hora e o recrutador escolheu aplicar um teste desafio da plataforma Hacker Rank www.hackerrank.com. Link para o desafio: https://www.hackerrank.com/challenges/tag-content-extractor/problem

Em resumo, o programa Tag Content Extractor em Java deve receber como entrada um texto baseado em tags. Ex.:

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

Entre os requisitos da vaga consta criação de APIs com o framework Spring Boot. Mas para resolver este desafio foi necessário usar apenas operações de entrada e saída, variáveis, estruturas de repetição, estruturas de decisão e Regex.

Hoje decidi publicar a minha solução (arquivo TagContentExtractor.java).

Aqui está uma captura de tela de uma execução da minha solução com a entrada em cor verde e a saída em cor preta:

![image](https://github.com/user-attachments/assets/5b983310-5b4c-4557-b37d-2846b2141508)
