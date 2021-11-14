package com.ramonlearning.pilha.lab;

import com.ramonlearning.pilha.Pilha;

import java.sql.SQLOutput;

public class Exercicios {
    /*
    * Exercício 01 Escreva um programa que leia 10 números. Para cada número lido, verifique e codifique de acordo com as regras a seguir:
    *       - Se o número for par, empilhe na pilha;
    *       - Se o número for ímpar, desempilhe um número da pilha. Caso a pilha esteja vazia, mostre uma mensagem
    *       - Se ao final do programa a pilha não estiver vazia, desempilhe todos os elementos, imprimindo-os na tela
    */
    public void Exercicio01( ){
        Integer[] numeros = new Integer[10 ];
        for (int i =0 ; i<10; i++){
            numeros[i] = (int) Math.random() ;
        }
        Pilha<Integer> pilha = new Pilha<Integer>();
        for (int x=0; x< 10; x++){
            if(numeros[x] % 2 == 0){
                pilha.empilha(numeros[x]);
                System.out.println("empilhando... ");
            }else{
                Integer desimpilhado = pilha.desempilha();
                if (desimpilhado == null ) {
                    System.out.println("Pilha vazia");
                }else{
                    System.out.println("impar, desimpilhando um elemento" + pilha.desempilha());
                }
                System.out.println();
            }
        }
    }






    /*
    *  Exercício 02 Escreva um programa que leia 10 números. Para cada número lido, verifique e codifique de acordo com as regras a seguir: - Se o número for par, empilhe na pilha chamada par; - Se o número for ímpar, empilhe na pilha chamada impar; - Se o número for zero (0), desempilhe um elemento de cada pilha. Caso alguma pilha esteja vazia, mostre uma mensagem de erro na tela. Ao final do programa desempilhe todos os elementos das duas pilhas, imprimindo-os na tela
    * Exercício 03 Utilize a classe Pilha (criada durante as aulas) e desenvolva os seguintes items: 1. Crie uma pilha com capacidade para 20 livros;
2. 2 2. Insira 6 livros na pilha; Cada livro contém nome, isbn, ano de lançamento e autor. 3. Crie um exemplo para utilizar cada método da classe Pilha.
            *  Exercício 04 Repita o mesmo processo do exercício anterior, porém utilizando a classe Stack da API Java.
* Exercício 05 – Desafio do Palíndromo Escreva um programa que testa se uma sequência de caracteres fornecida pelo usuário é um palíndromo, ou seja, é uma palavra cuja primeira metade é simétrica à segunda metade. Veja alguns exemplos: - AABCCBAA - sim - ADDFDDA - sim - ABFFBB - não
* Exercício 06 – Desafio dos símbolos balanceados Escreva um programa para verificar se uma expressão matemática tem os parênteses agrupados de forma correta, isto é: (1) se o número de parênteses à esquerda e à direita são iguais e; (2) se todo parêntese aberto é seguido posteriormente por um fechamento de parêntese. Veja alguns exemplos: - As expressões ((A+B) ou A+B( violam a condição 1 - As expressões )A+B( – C ou (A+B)) – (C + D violam a condição 2 - A expressão ((A+B)+D) está ok
*
        * Exercício 07 – Desafio conversão decimal-binário Usando a classe Pilha ou Stack, desenvolva um algoritmo que faça a conversão de números decimais para binário.
            3. 3 Exercício 08 – Desafio Torre de Hanoi Usando a classe Pilha ou Stack, desenvolva um algoritmo que resolva o quebra cabeça Torre de Hanoi.
    Recommended
1ª lista de_algoritmos
1ª lista de_algoritmos

    * */


}
