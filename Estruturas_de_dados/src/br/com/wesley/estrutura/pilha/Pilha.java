package br.com.wesley.estrutura.pilha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty() { // verifica se a pilha está vazia

        if (refNoEntradaPilha == null) {
            return true;
        }
        return false;
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {

        String strinRetorno = "--------------\n";
        strinRetorno += "    Pilha\n";
        strinRetorno += "--------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {

            if (noAuxiliar != null) {
                strinRetorno += "[No {dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }

        }
        strinRetorno += "=============\n";
        return strinRetorno;
    }

}
