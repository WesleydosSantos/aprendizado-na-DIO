package br.com.wesley.estrutura.fila;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object) { // enfileirar a partic do final
        No<T> novoNo = new No<>(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T firt() {

        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }

            return (T)primeiroNo.getObject();
        }
        return null;

    }

    public T dequeue() { // desenfileirar, a partir do início

        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAxiliar = refNoEntradaFila;

            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAxiliar.setRefNo(null);
                    break;
                }
            }
            return (T)primeiroNo.getObject();
        }
        return null;

    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
        public String toString() {
            String stringRetorno = "";
            No<T> noAuxiliar = refNoEntradaFila;

            if (refNoEntradaFila != null) {
                while (true) {
                    stringRetorno += "[No {objeto="+ noAuxiliar.getObject() + "}]--->";

                    if (noAuxiliar.getRefNo() != null) {
                        noAuxiliar = noAuxiliar.getRefNo();
                    } else {
                      stringRetorno +=  " null";
                      break;
                    }
                } 
        } else {
            stringRetorno +=  " null";
        }
       
        return stringRetorno;   
        }
    










    }