public class personagem {
    private String nome;
    private int habilidade;
    public personagem( String nome,int habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;    
    }
    public personagem(String nome) {
        this.nome = nome;
        this.habilidade = 0;
    }
    public void ajustarhabilidade(int variacao) {
        if (variacao != 0) {
          habilidade(this.habilidade + variacao);
          System.out.println("a habilidade atual de " + this.nome + " é: " + this.habilidade);
        }
    }
    public void habilidade(int habilidade) {
        this.habilidade = habilidade;
        if (this.habilidade < 0) {
           this.habilidade= 0;
        }
    }
    public int gethabilidade() {
        return this.habilidade;
    }
    public String getNome() {
        return this.nome;
    }
}








        
    