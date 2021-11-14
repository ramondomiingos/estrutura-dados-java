package com.ramonlearning.lista.testes;

import com.ramonlearning.lista.VetorObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//Essa classe teste é a cópia de VetorTest, alterando apenas o Vetor ( string) para Object, tornando mais genérico.
@DisplayName("Testes usando a classe genérica Vetor Object.")
class VetorObjectTest {
    @Test
    public void  TestTamanhoUsadoDoVetorVazio(){
        int tamanho = 5;
        VetorObject meuVetor =  new VetorObject(tamanho);
        assertEquals(0, meuVetor.tamanho());
    }
    @Test
    public void  TestTamanhoUsadoDoVetorComUMelemento(){
        int tamanho = 5;
        VetorObject meuVetor =  new VetorObject(tamanho);
        String adicionar = "Primeiro Elemento";
        meuVetor.adiciona(adicionar);
        assertEquals(1, meuVetor.tamanho());
    }
    @Test
    public void TestAdicionarPrimeiroElemento(){
        int tamanho = 5;
       VetorObject meuVetor =  new VetorObject(tamanho);
        String adicionar = "Primeiro Elemento";
        assertEquals(true, meuVetor.adiciona(adicionar));

    }
    @Test
    @DisplayName("Test Adicionar Elementos Além do Alocado Inicialmente")
    public void TestAdicionarElementosAlemDoAlocadoInicialmente(){
        int tamanho = 1;
       VetorObject meuVetor =  new VetorObject(tamanho);
        String adicionar = "Primeiro Elemento";
        meuVetor.adiciona(adicionar);
        adicionar = "Segundo Elementos";
        assertEquals(true, meuVetor.adiciona(adicionar));
    }

    @Test
    public void TestConsultaElementoValidoPorPosicao(){
        int tamanho = 1;
       VetorObject meuVetor =  new VetorObject(tamanho);
        String adicionar = "Primeiro Elemento";
        meuVetor.adiciona(adicionar);
        assertEquals(adicionar, meuVetor.busca(0));
    }

    @Test
    public void TestConsultaElementoInvalidoPorPosicao(){

        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                int tamanho = 1;
               VetorObject meuVetor =  new VetorObject(tamanho);
                String adicionar = "Primeiro Elemento";
                meuVetor.busca(10);
            }
        }
        );
    }

    @Test
    public void TestBuscaElementoExistente(){
        int tamanho = 1;
       VetorObject meuVetor =  new VetorObject(tamanho);
        String adicionar = "Primeiro Elemento";
        meuVetor.adiciona(adicionar);
        assertEquals(0, meuVetor.buscaValor(adicionar));
    }

    @Test
    public void TestBuscaElementoInexistente(){
        int tamanho = 1;
       VetorObject meuVetor =  new VetorObject(tamanho);
        String adicionar = "Primeiro Elemento";
        meuVetor.adiciona(adicionar);
        assertEquals(-1, meuVetor.buscaValor("Não Existe"));
    }

    @Test
    public void TestAdicionaElementoEmPosicaoEspecifica(){
        int tamanho = 6;
       VetorObject meuVetor =  new VetorObject(tamanho);
        meuVetor.adiciona("B");
        meuVetor.adiciona("C");
        meuVetor.adiciona("E");
        meuVetor.adiciona("F");
        meuVetor.adiciona(0,"A");
        assertEquals("[A, B, C, E, F]", meuVetor.toString());
        assertEquals("B", meuVetor.busca(1));
        assertEquals(true, meuVetor.adiciona(5, "G"));
        assertEquals(true, meuVetor.adiciona(3, "D"));

    }
    @Test
    public void TestAumentarCapacidadeDoVetor(){
       VetorObject meuVetor = new VetorObject(2);
        meuVetor.adiciona("1");
        meuVetor.adiciona("2");
        assertEquals(true, meuVetor.adiciona("3"));
    }

    @Test
    public void TestRemoverUmElementoPelaPosicao(){
        int tamanho = 6;
       VetorObject meuVetor =  new VetorObject(tamanho);
        meuVetor.adiciona("B");
        meuVetor.adiciona("C");
        meuVetor.adiciona("E");
        meuVetor.adiciona("F");
        meuVetor.adiciona(0,"A");
        meuVetor.remover(3);
        assertEquals("[A, B, C, F]", meuVetor.toString());

    }

}