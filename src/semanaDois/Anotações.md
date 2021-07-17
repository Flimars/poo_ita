## As classes de um sistema devem ter responsabilidades bem definidas e colaborar para implementar as fun_
cionalidades do sistema.

Exemplo 1: Imagine um pizzaria on-line em que o preço da pizza depende do seus ingredientes e a entrega de_
pende do dia da semana e da distância.

    * class Pizza(Calcula o preço baseado nos ingredientes da pizza);
    * class Entrega(Calcula o preço baseado no dia da semana e na distância);
    * class Carrinho(Calcula o valor total da compra com as pizzas, refrigerante e a entrega);

Criar um sistema orientado á objetos tem a ver com descobrir suas peças e como elas se encaixam.

** Nota: NEM PENSE EM QUERER COLOCAR TUDO EM UMA CLASSE SÓ!

## Lesson 1: Pensando em Métodos Orientado a Objetos.
Faz sentido termos métodos similares em classes diferentes? Sim, faz sentido, quando o contexto é diferente.
Uma classe Aluno pode ter um método para calcular a nota. Uma classe Turma pode ter um método de mesmo nome,
mas para um contexto distinto. Nesse caso, o método de Turma chamaria o método de cada aluno.

## Relembrando Modelagm CRC:
    * Passo 1 - Identifica Objetos e classes.
        - Procurar por substantivos(nomes na especificação de requsitos do sistema).
        - Nomes representam potenciais objetos e classes.
    * Passo 2 - Refina a lista de classes.
        - 
    * Passo 3 - Identifica responsabilidades óbvias.
    * Passo 4 - Identifica verbos como responsabilidades.
    * Passo 5 - Atribuição das novas responsabilidades.
    * Passo 6 - Apresenta lógica para cada responsabilidade.


## MATERIAL COMPLEMENTAR:  Hands-on: Modelagem CRC - Identificando classes:

    * Passo Zero: Especificação do Sistema de Automatizado da Biblioteca - SAB:

A Biblioteca tem nome, mantém um catálogo de livros, onde cada livro tem título, autor e número único de catá_
logo. Há usuários da Biblioteca registrados, cada um com um nome único de usuário. Um usuário da Biblioteca 
pode emprestar um livro e devolver o livro emprestado para o sistema. No entanto, cada transação de empréstimo
ou devolução de livro deve ser registra por uma bibliotecária. A bibliotecária tem que registrar um novo usuá_
rio da Biblioteca no SAB; quando solicitada, ela pode exibir, em ordem crescente  do número único de catálogo,
os livros disponíveis para empréstimo, em como exibir os livros já emprestados e portanto indisponíveis para 
empréstimo. 

    * Passo 1: Lista de substantivos que poderam ser potenciais classes como:

(Biblioteca, nome, catálogo de livros, livro, título, autor, número únicod de catálogo, usuários da Biblioteca, nome único de usuário, sistema, transação, empréstimo, devolução, bibliotecária, SAB, ordem).

    * Passo 2: Refina lista de classes:

1) Nomes fora do escopo do sistema e/ou são verbos "enrustidos"
        --> (bibliotecária, ordem) estão eliminados/fora do escopo
        --> (transação, empréstimo, devolução)
2) Retirar nomes que representem atributos
        --> Biblioteca = (nome(Biblioteca), catálogo de livros(Biblioteca))
        --> Livro = (título(Livro), autor(Livro), número único de catálogo(Livro))
        --> Usuários da Biblioteca = (nome único de usuário(Usuário da Biblioteca))
3) Identificar nomes diferentes que representam a mesma classe
        --> Classe Biblioteca (eliminamos sistema e SAB ambos representam a Classe Biblioteca)
        --> Classe Usuario (eliminamos o "s" de Usuários e tmb "da Biblioteca" por fazer referência á classe Biblioteca) 
4) Identificar relações entre os nomes
5) Descrever o que cada classe faz- ter uma finalidade dentro so sistema

    * Passo 3: Responsabilidades Óbvias:

1) Identificar responsabilidades óbvias para cada classe

===========================================================================================================
## Week Three: Test Automated tests with JUnit - Criar código para a realização de testes automatizados com JUnit

import static org.junit.Assert.*;
    assertTrue()
    assertFalse()
    assertEquals()
    assertNotEquals()
    assertSame()
    assertNotSame()
    assertNull()
    assertNotNull()
    fail()
    
==========================================================================================================
## Week Four:
==========================================================================================================
## Week Five:
==========================================================================================================
## Week Six:
==========================================================================================================

