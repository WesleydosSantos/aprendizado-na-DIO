package list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListAplications {
    public static void main(String[] args) throws Exception {

        List<Double> nota = new ArrayList<>();

        nota.add(new Double(7.0));
        nota.add(new Double(6.0));
        nota.add(new Double(5.5));
        nota.add(new Double(5.4));
        nota.add(new Double(6.5));
        nota.add(new Double(7.5));
        nota.add(new Double(9.5));

        // indexOf pega o índice de posição do objeto desejado
        System.out.println(nota.indexOf(new Double(9.5)));

        nota.add(4, new Double(8.0)); // adicionando no índice 4, o Double 8.0
        System.out.println(nota);

        // substituindo um dado na lista, onde o valor é 5.4, por 0.1
        nota.set(nota.indexOf(new Double(5.4)), new Double(0.1));
        System.out.println(nota);

        // contains é usado para verifica se o elemento dado existe na lista
        System.out.println(nota.contains(3.2));

        System.out.println("\nImprimindo notas com o for \n");

        for (Double notas : nota) {
            System.out.println(notas);

        }

        // pegando um valor pelo seu índice com o get
        System.out.println("Sexta nota adicionada é " + nota.get(6));

        // pegando o menor e maior valor com o collections
        System.out.println("menor nota: " + Collections.min(nota));
        System.out.println("maior nota: " + Collections.max(nota));

        // realizando a soma de todos os dados da lista com o iterator
        Iterator<Double> iterator = nota.iterator();
        Double soma = 0.0;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma = soma + next;
        }

        System.out.println("A soma de todos os elementos é " + soma + " e a média é " + (soma / nota.size()));

        System.out.println(nota);

        System.out.println(nota.remove(0));

        // removendo valores menores que 7 na lista
        Iterator<Double> iterator2 = nota.iterator();

        while (iterator2.hasNext()) {
            Double proximo = iterator2.next();

            if (proximo < 7) {
                iterator2.remove();
            }

        }
        System.out.println(nota);

        //o método clear limpa toda a lista
        nota.clear();
        System.out.println(nota);

        //veficamos se a lista está vazia com isEmpty() 
        System.out.println("Está vazia ?"+nota.isEmpty());


    }
}
