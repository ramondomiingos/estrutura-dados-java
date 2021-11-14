package com.ramonlearning.pilha;
import com.ramonlearning.base.EstruturaEstatica;
public class Pilha<T> extends EstruturaEstatica{
    public Pilha(){
        super();
    }
    public Pilha(int capacidade){
        super(capacidade);
    }
    public void empilha(T elemento ){
       // this.aumentaCapacidade();
        // this.elementos[tamanho] = elemento;
        super.adiciona(elemento);
    }
    public T topo(){
        if(this.estaVazia()){
            return null;
        }
        return (T) this.elementos[this.tamanho - 1];
    }
    public T desempilha(){
        if (this.estaVazia()){
            return null;
        }
        return (T) this.elementos[--this.tamanho];
    }
}
