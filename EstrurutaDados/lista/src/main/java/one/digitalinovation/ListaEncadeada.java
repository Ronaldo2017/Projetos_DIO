package one.digitalinovation;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAux = referenciaEntrada;
        for (int i = 0; i < this.size() -1; i++){
            noAux = noAux.getProximoNo();
        }

        noAux.setProximoNo(novoNo);
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    private No<T> getNo(int index){

        validaIndice(index);

        No<T> noAux = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++){
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }

        return noRetorno;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if (referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }

        return tamanhoLista;
    }
    //retorna o No que removeu
    public T remove(int index){
        No<T> noPivo = this.getNo(index);
        if (index == 0){
            referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    private void validaIndice(int index){
        int ultimoIndice = size() -1;
        if(index >= size()){
            throw new IndexOutOfBoundsException("Não exite conteúdo no índece " + index + " desta lista." +
                    "Esta lista só vai até o indíce: " + ultimoIndice + ".");
        }
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAux = referenciaEntrada;
        for (int i = 0; i < this.size(); i++){
            strRetorno +=  "No{" +
                    "conteudo=" + noAux.getConteudo() +
                    "} ---->";
            noAux = noAux.getProximoNo();
        }

        strRetorno += "null";
        return strRetorno;
    }
}
