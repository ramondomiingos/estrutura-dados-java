package com.ramonlearning.lista;
// Essa classe é uma cópia Exata de Vetor, apenas aterando STRING para OBJECT.
// Atinge muitos casos, porém existe jeitos melhores de implementar usando Generics, verifique Lista.
// 🚨 É possivel botar tipos diferentes no mesmo array. 🚨

public class VetorObject {
    private Object[] elementos;
    private int tamanho;

    public VetorObject(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }
    public int tamanho(){
        return this.tamanho;
    }

    public int buscaValor(Object valor){
        for (int i=0; i < this.tamanho; i++){
            if(this.elementos[i].equals(valor)){
                return i;
            }
        }
        return -1;
    }
    public Object busca(int posicao) throws IllegalArgumentException {
        if ( !(posicao >= 0 && posicao <= this.tamanho)){
             throw  new IllegalArgumentException("Posição Inválida");
        }
        return this.elementos[posicao];
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        for ( int i = 0; i< this.tamanho - 1 ; i++){
            s.append(this.elementos[i]) ;
            s.append(", ");
        }
        if (this.tamanho  >0 ){
            s.append(this.elementos[this.tamanho -1]);
        }
        s.append("]");
        return s.toString();
    }
    public boolean adiciona(Object elemento) {
        // 👎 Implementação não eficiente, precisa percorrer todos os elements , para adicioanar mais um
        // com o passar do tempo, ficará lento.
//        for (int i =0;  i < this.elementos.length; i++ ){
//            if(this.elementos[i] == null){
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
        this.aumentaCapacidade();
        if (this.tamanho <  this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }else{
           // throw  new Exception("Vetor ja esta cheio, não posso adicionar.")
            return false;
        }

    }
    public boolean adiciona(int posicao, Object elemento){
        if ( !(posicao >= 0 && posicao <= this.tamanho)){
            throw  new IllegalArgumentException("Posição Inválida");
        }
        this.aumentaCapacidade();

        for (int i = this.tamanho -1;i >= posicao;i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i=0 ; i <  this.elementos.length ; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remover(int posicao){
        if ( !(posicao >= 0 && posicao <= this.tamanho)){
            throw  new IllegalArgumentException("Posição Inválida");
        }
        for(int i = posicao ; i < this.tamanho-1 ; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }
}
