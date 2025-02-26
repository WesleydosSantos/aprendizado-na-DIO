package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<>();
        meusGatos.add(new Gato("Chuca", "Vermelho", 40));
        meusGatos.add(new Gato("Bytre", "Preto", 40));
        meusGatos.add(new Gato("Crew", "Azul", 40));
       

        // em ordem de inserção
        System.out.println("Em ordem de inserção");
        System.out.println(meusGatos);
        
        // ordem aleatória com collections.shuffle
        System.out.println("Em ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        
        //em ordem natural, precisa da interface comparable
        System.out.println("Em ordem alfabética");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        
        //comparar través das idades
        System.out.println("comparando por idade");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);
        
        //comparar través das cores
        System.out.println("comparando por cor");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        //comparando os três, mas com condição de que se os osjetos forem iguais teremos uma outra comparação pra desenpatar
        
        
    }


}

