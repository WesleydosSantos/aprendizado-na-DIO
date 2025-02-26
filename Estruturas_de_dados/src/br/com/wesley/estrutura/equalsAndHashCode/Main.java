package br.com.wesley.estrutura.equalsAndHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();


        listaCarros.add(new Carro("Volkswagen"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Renault"));

        System.out.println(listaCarros.contains(new Carro("Fiat")));

        //usando o hashCode
        System.out.println(new Carro("Renault").hashCode());

        //usando o equals, compara obj, retorna true se ambos forem idênticos

        Carro carro1 = new Carro("Peugeot");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));

    }
}
