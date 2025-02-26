package br.com.wesley.estrutura.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Fiat"));
        queueCarros.add(new Carro("Chevrolet"));

        System.out.println(queueCarros.add(new Carro("Audi"))); //mostra que foi adicionado retornando true
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault")));//retornar false se não conseguir adicionar 
        System.out.println(queueCarros);

        System.out.println("Primeiro da fila" + queueCarros.peek());//retorna o primeiro da fila
        System.out.println(queueCarros);
       
        System.out.println("EXCLUINDO primeiro da fila" + queueCarros.poll());//retorna o primeiro da fila excluido
        System.out.println(queueCarros);


        System.out.println(queueCarros.isEmpty());//true vazia, false com dados
        System.out.println("Contém "+ queueCarros.size()+" dados"); // tamanho da fila
       
    }
}
