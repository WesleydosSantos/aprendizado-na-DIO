package br.com.wesley.estrutura.hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main  {
    public static void main(String[] args) {
        Set<Carro> hashSetCarro = new HashSet<>();
        hashSetCarro.add(new Carro("Chevrolet"));
        hashSetCarro.add(new Carro("Zip"));
        hashSetCarro.add(new Carro("Alfa Romeo"));
        hashSetCarro.add(new Carro("Volkswagen"));
        hashSetCarro.add(new Carro("Fiat"));
        
        System.out.println(hashSetCarro);       //expôe em ordem aleatória
        
        //montando a estrutura com árvores
        Set<Carro> treeSetCarro = new TreeSet<>();
        treeSetCarro.add(new Carro("Chevrolet"));
        treeSetCarro.add(new Carro("Zip"));
        treeSetCarro.add(new Carro("Alfa Romeo"));
        treeSetCarro.add(new Carro("Volkswagen"));
        treeSetCarro.add(new Carro("Fiat"));
        System.out.println(treeSetCarro);       //expôe em ordem
        
        

        
    }
}
