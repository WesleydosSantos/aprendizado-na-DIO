package br.com.wesley.estrutura.no;

    /*
     * tem a finalidade de mostrar como um 
     * nó se comporta nó prática 
     * @author Wesley 
     */

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteudo no 1");

        No no2 = new No("Conteudo no 2");
        no1.setProximoNO(no2);

        No no3 = new No("Conteudo no 3");
        no2.setProximoNO(no3);

        No no4 = new No("Conteudo no 4");
        no3.setProximoNO(no4);

        //no1>>no2>>no3>>no4>>null

        System.out.println(no1);
        System.out.println(no2.getProximoNO());

        System.out.println("------------------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNO());
        System.out.println(no1.getProximoNO().getProximoNO());
        System.out.println(no1.getProximoNO().getProximoNO().getProximoNO());
        System.out.println(no1.getProximoNO().getProximoNO().getProximoNO().getProximoNO());
        

    }
    
}
