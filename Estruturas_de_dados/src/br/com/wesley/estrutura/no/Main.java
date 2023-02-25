package br.com.wesley.estrutura.no;

    /*
     * tem a finalidade de mostrar como um 
     * nó se comporta nó prática 
     * @author Wesley 
     */


     //refatoranto a classe main para o tipo generic
public class Main {
    public static void main(String[] args) {
        No<String> no1 = new No<String> ("Conteudo no 1");

        No<String>  no2 = new No<String> ("Conteudo no 2");
        no1.setProximoNO(no2);

        No<String>  no3 = new No<String> ("Conteudo no 3");
        no2.setProximoNO(no3);

        No<String>  no4 = new No<String> ("Conteudo no 4");
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
