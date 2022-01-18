package one.digitalinovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        //instancia o NO, a referencia sempre é nula
        this.refNoEntradaPilha = null;
    }

    //acrescenta um elemento na pilha
    public void push(No novoNo){
        No refAux = refNoEntradaPilha;//referencia de topo
        refNoEntradaPilha = novoNo;//referencia de memoria
        refNoEntradaPilha.setRefNo(refAux);
    }

    //exclui o ultimo elemento da pilha
    public No pop(){
        if (!this.isEmpty()){
            No noPoped = refNoEntradaPilha;//no que retorna
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        if(refNoEntradaPilha == null){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
       String stringRetorno = "-------------\n";
       stringRetorno += "       Pilha\n";
        stringRetorno += "-------------\n";

        No noAux = refNoEntradaPilha;

        while(true){
            if(noAux != null){
                stringRetorno += "[No{dado = " + noAux.getDado() + "}]\n";
                noAux = noAux.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "============\n";
        return stringRetorno;
    }
}
