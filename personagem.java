public class personagem {
    private String nome;
    private int habilidade;
    private int experiencia;

    public personagem(String nome) {
        this.nome = nome;
        this.habilidade = 0;
        this.experiencia = 0; // Atribui valor zero à experiência
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void aumentarHabilidade(int pontos) {
        habilidade += pontos;
        
        if (habilidade > 100) {
            habilidade = 100;
        }
    
    }
     public void mostrarHabilidade() {
        System.out.println("Sua habilidade é de: " + habilidade);
    }
    public void mostrarHabilidademomento() {
    if (habilidade > 0) {
        System.out.println("Sua habilidade é de: " + habilidade);
    }
}

    public void diminuirHabilidade(int pontos) {
        habilidade -= pontos;
        if (habilidade < 0) {
            habilidade = 0;
        }
    }

    public void aumentarExperiencia(int pontos) {
        experiencia += pontos; 
    }

    public void diminuirExperiencia(int pontos) {
        experiencia -= pontos; 
        if (experiencia < 0) {
            experiencia = 0;
        }
    }
}