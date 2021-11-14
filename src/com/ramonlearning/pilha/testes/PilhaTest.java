package com.ramonlearning.pilha.testes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.ramonlearning.pilha.Pilha;
public class PilhaTest {
    @Test
    public void TestCriarPilhaVazia(){
        Pilha<Integer> pilha = new Pilha<Integer>();
        assertEquals("[]", pilha.toString());
    }
    @Test
    public void TestEmpilharUmItem(){
        Pilha<Integer> pilha = new Pilha<Integer>();
        for (int i=0; i<10;i++){
            pilha.empilha(i);
        }
        assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", pilha.toString());
    }
    @Test
    public void TestEmpilharUmItemAlemDoAlocadoInicial(){
        Pilha<Integer> pilha = new Pilha<Integer>(9);
        for (int i=0; i<10;i++){
            pilha.empilha(i);
        }
        pilha.empilha(1000);
        assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1000]", pilha.toString());
    }
    @Test
    public void TestPilhaEstaVazia(){
        Pilha<Integer> pilha = new Pilha<Integer>(9);
        assertEquals(true, pilha.estaVazia());
        pilha.empilha(1);
        assertEquals(false, pilha.estaVazia());
    }
    @Test
    public void TestVerificaTopoPilhaVazia(){
        Pilha<Integer> pilha = new Pilha<Integer>(9);
        assertEquals(null, pilha.topo());
    }
    @Test
    public void TestVerificaTopoPilhaPreenchida(){
        Pilha<Integer> pilha = new Pilha<Integer>(9);
        pilha.empilha(1);
        pilha.empilha(2);
        assertEquals(2, pilha.topo());
    }
    @Test
    public void TesteDesempilhaLista(){
        Pilha<Integer> pilha = new Pilha<Integer>(9);
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.desempilha();
        assertEquals("[1]", pilha.toString());
    }
    @Test
    public void TesteDesempilhaListaVazia(){
        Pilha<Integer> pilha = new Pilha<Integer>(9);
        assertEquals(null, pilha.desempilha());
    }

}
