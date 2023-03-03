package br.com.wesley.estrutura.fila;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue(" primeiro ");
        minhaFila.enqueue(" segundo ");
        minhaFila.enqueue(" terceiro ");
        minhaFila.enqueue(" quarto ");
        minhaFila.enqueue("quinto");


        System.out.println(minhaFila);
        System.out.println();
        System.out.println(minhaFila.dequeue());
        System.out.println();
        System.out.println(minhaFila);
        System.out.println();
        System.out.println(minhaFila); 
        System.out.println();
        System.out.println("O primeiro da fila é " + minhaFila.firt());
    }
}
