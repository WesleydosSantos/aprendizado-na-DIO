package br.com.wesley.estrutura.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> pilhaDeCarros = new Stack<>();
        pilhaDeCarros.add(new Carro("Fiat"));
        pilhaDeCarros.add(new Carro("Volkswagen"));
        pilhaDeCarros.add(new Carro("Audi"));

        System.out.println(pilhaDeCarros);

        // removendo, regra LIFO
        System.out.println(pilhaDeCarros.pop());
        System.out.println(pilhaDeCarros);

        //apenas pegando o último valor sem remover
        System.out.println(pilhaDeCarros.peek());

    }
}
