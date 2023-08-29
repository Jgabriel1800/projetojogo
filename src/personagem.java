public class personagem {
private String nome;
private int habilidade;
public personagem(String nome, int habilidade) {
    this.nome = nome;
    this.habilidade = habilidade;   
}
public personagem(String nome) {
    this.nome = nome;
    this.habilidade = 0;   
}
public void ajustarhabilidade(int atualizacao) {
    if(atualizacao !=0){
        this.habilidade += atualizacao;
        System.out.println("Habilidade atualizada para "+this.habilidade);
    }
    }
    public void habilidade(int habilidade) {
        this.habilidade = habilidade;
        if(this.habilidade<0){
            this.habilidade=0;
        }
    }
    public int gethabilidade() {
        return habilidade;
    }
    public String getNome() {
        return nome;
    }
}







        
    