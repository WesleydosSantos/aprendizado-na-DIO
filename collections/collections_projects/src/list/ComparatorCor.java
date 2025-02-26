package list;

import java.util.Comparator;

public class ComparatorCor implements Comparator<Gato> {

    @Override   // se o1 for > o2, saída é 1, menor -1, igual é 0
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
    
}
