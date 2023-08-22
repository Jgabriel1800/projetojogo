import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class capitulo {
    private String texto;
    private ArrayList<escolha> escolhas;
    private personagem jogador;
    private int habilidade;
    private Scanner escaneador;

    protected capitulo() {
        this.texto = "";
        this.escolhas = new ArrayList<escolha>();
    }

    public capitulo(String texto, personagem jogador, int habilidade, Scanner escaneador)  {
        this.texto=texto;
        this.jogador=jogador;
        this.habilidade=habilidade;
        this.escaneador=escaneador;
        this.escolhas=new ArrayList<escolha>();
    
    }

    public capitulo(Map<String, personagem> personagens, Scanner escaneadordoconsole,Scanner escaneadordearquivo) 
    {
        this.LerCapitulo(personagens,escaneadordearquivo);
        this.escaneador=escaneadordoconsole;
        this.escolhas=new ArrayList<escolha>();
    }
    
    protected void LerCapitulo(Map<String,personagem> personagens, Scanner escaneadordearquivo){ 
        
        escaneadordearquivo.nextLine();
        String idjogador = escaneadordearquivo.nextLine();
        this.jogador = personagens.get(idjogador);

        escaneadordearquivo.nextLine();
        String linha = escaneadordearquivo.nextLine();
        this.texto = "";
        while (!linha.equals("VARIACOESHabilidade")) {
            
            if (linha.equals(idjogador)) {
                texto = texto + jogador.getNome();
            } else {
                texto = texto + linha;
            }
            linha = escaneadordearquivo.nextLine();
        }
        this.habilidade = Integer.parseInt(escaneadordearquivo.nextLine());
    }
    public void adicionarescolha(escolha escolha) {
        escolhas.add(escolha);
    }
    public void executar() {
        mostrar();

        if (escolhas.size() > 0) {
            int idcapituloescolhido = escolher();
            System.out.println();
            System.out.println(". . .");
            System.out.println();
            escolhas.get(idcapituloescolhido).getProximo().executar();
        } else {
            System.out.println("FIM");
        }
    }
    
    protected void mostrar() {
        System.out.println(texto);
        jogador.ajustarhabilidade(habilidade);

        for (int i = 0; i < escolhas.size(); i++) {
            System.out.println("- " + escolhas.get(i).getTextoMostrado());
        }
        System.out.println(">>");
    }
    
    public int escolher() {
        int opcaoescolhida = 0;
        String escolha;
        boolean escolhavalida = false;

        while (!escolhavalida) {

        escolha = escaneador.nextLine();
        for (int i = 0; i < escolhas.size(); i++) {
            if (escolha.equalsIgnoreCase(escolhas.get(i).getTextoDigitado())) {
                escolhavalida = true;
                opcaoescolhida = i;
            }
        }
        if (!escolhavalida) {
            System.out.println("Escolha inválida");
        }
    }
    return opcaoescolhida;
  }
}





