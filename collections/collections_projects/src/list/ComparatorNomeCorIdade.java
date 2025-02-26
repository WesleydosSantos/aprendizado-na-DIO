package list;

import java.util.Comparator;

public class ComparatorNomeCorIdade implements Comparator<Gato> {
/*
 * se os nomes forem diferentes ordena por nome, mas se forem iguais ordena por cor
 * se as cores forem diferentes ordena por cor, mas se forem iguais ordena por idade
 */
    @Override
    public int compare(Gato o1, Gato o2) {

       int nome = o1.getNome().compareTo(o2.getNome());
        if (nome != 0) {
            return nome;
        }

        int cor = o1.getCor().compareTo(o2.getCor());
        if (cor != 0) {
            return cor;
        }

        return Integer.compare(o1.getIdade(), o2.getIdade());

       
    }

    
}