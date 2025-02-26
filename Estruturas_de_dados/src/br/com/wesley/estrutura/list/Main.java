package br.com.wesley.estrutura.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Volkswagen"));
        listaCarros.add(new Carro("Peugeot"));

        System.out.println("Tem o ford na lista? " + listaCarros.contains(new Carro("Ford")) + " "); // procura se
                                                                                                     // existe o objeto
                                                                                                     // carro Ford

        System.out.println("no objeto de índice 3 é " + listaCarros.get(3));

        System.out.println("Qual é o índice de Fiat? " + listaCarros.indexOf(new Carro("Fiat")));
        System.out.println("Qual é o índice de Fiat3? " + listaCarros.indexOf(new Carro("Fiat3")));

        System.out.println("removendo "+listaCarros.remove(0));
        System.out.println(listaCarros);

    }
}
