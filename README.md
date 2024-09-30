# Tag Content Extractor (tag-content-extractor)

Recentemente me submeti a um teste desafio de uma vaga de Dev Java numa empresa multinacional.

O teste foi monitorado e era proibido consultar IA's, mas consultar o Google era permitido. O recrutador assistiu ao teste via MS Teams, compartilhei minha tela.

A duração máxima do teste era de uma hora e o recrutador escolheu aplicar um teste desafio da plataforma Hacker Rank www.hackerrank.com. Link para o desafio: https://www.hackerrank.com/challenges/tag-content-extractor/problem

Em resumo, o programa Java deve receber como entrada um texto baseado em tags. Ex.:

4
\<h1>Nayeem loves counseling</h1>
\<h1>\<h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>

E deve ter como saída apenas os conteúdos das tags válidas. Assim:

"Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush"

Para entender as regras do teste, leia a descrição na íntegra. Link para descrição: https://www.hackerrank.com/challenges/tag-content-extractor/problem

Hoje decidi publicar esta solução.
