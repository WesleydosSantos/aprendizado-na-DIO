
package br.com.wesley.estrutura.no;


public class No {
  
    

    private String conteudo;
    private No proximoNO;


    public No(String conteudo) {
        this.proximoNO= null;
        this.conteudo = conteudo;
    }


    public String getConteudo() {
        return conteudo;
    }


    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }


    public No getProximoNO() {
        return proximoNO;
    }


    public void setProximoNO(N proximoNO) {
        this.proximoNO = proximoNO;
    }
    


    @Override
        public String toString() {
            return "No [conteudo=" + conteudo + "]";
        }


}
