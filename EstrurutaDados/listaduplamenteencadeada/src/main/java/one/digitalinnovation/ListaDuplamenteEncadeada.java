package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista = 0;

    public ListaDuplamenteEncadeada(){
        primeiroNo = null;
        ultimoNo = null;
        this.tamanhoLista = 0;
    }

    //get = pega o elemento do tipo generico da lista no indice N
    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    //add = adicionando elemento
    public void  add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if (primeiroNo == null){
            primeiroNo = novoNo;
        }
        if (ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++;
    }

    //add - passa o elemento e o indice
    public void add(int index, T elemento){
        NoDuplo<T> noAux = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAux);

        if (novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAux.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0){
            primeiroNo = novoNo;
        }else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    //remove
    public void remove(int index){
        if (index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if (primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else {
            NoDuplo<T> noAux = getNo(index);
            noAux.getNoPrevio().setNoProximo(noAux.getNoProximo());
            if (noAux != ultimoNo){
                noAux.getNoProximo().setNoPrevio(noAux.getNoPrevio());
            }else {
                ultimoNo = noAux;
            }
        }
        this.tamanhoLista--;
    }

    //getNo
    private NoDuplo<T> getNo(int index){
        //asume o primeiro no da lista
        NoDuplo<T> noAux = primeiroNo;

        for (int i = 0; (i < index) && (noAux != null); i++){
            noAux = noAux.getNoProximo();
        }
        return noAux;
    }

    //size = tamnaho da lista
    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAux = primeiroNo;
        for (int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo="+ noAux.getConteudo() + "}]----->";
            noAux = noAux.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
