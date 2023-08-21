public class personagem {

    private int habilidade;

    

    public personagem( int habilidade) {
        
        this.habilidade = habilidade;
        
    }

    public int getHabilidade() {
       return habilidade;
    }

    public void aumentarHabilidade(int pontos) {
       habilidade += pontos;

        if (habilidade > 100) {
            habilidade = 100;
        }
   }

    public void diminuirHabilidade(int pontos) {
        habilidade -= pontos;

        if (habilidade < 0) {
           habilidade = 0;
        }
    }
}

    
        
    

