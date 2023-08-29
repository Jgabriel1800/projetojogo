import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class capituloimagem extends capitulo {
    private String imagem;

    public capituloimagem(String texto, personagem jogador, int habilidade, Scanner escaneadorarquivo) {
        super(texto, jogador, habilidade, escaneadorarquivo);
        this.imagem = lerImagem(escaneadorarquivo);
    }

    public capituloimagem(HashMap<String, personagem> personagens, Scanner escaneadorjogo, Scanner escaneadorarquivo) {
        super.ler(personagens, escaneadorarquivo);
        this.imagem = lerImagem(escaneadorarquivo);
        this.escolhas = new ArrayList<escolha>();
    }

    public void mostrar() {
        System.out.println();
        System.out.println(imagem);
        System.out.println();
        super.mostrar();
    }

    protected void ler(HashMap<String, personagem> personagens, Scanner escaneadorarquivo) {
        super.ler(personagens, escaneadorarquivo);
        this.imagem = lerImagem(escaneadorarquivo);
    }

    private String lerImagem(Scanner escaneadorarquivo) {
        StringBuilder imagemBuilder = new StringBuilder();
        String linha = escaneadorarquivo.nextLine();
        
        while (!linha.equals("FIMDAIMAGEM.")) {
            imagemBuilder.append(linha).append("\n");
            linha = escaneadorarquivo.nextLine();
        }
        
        return imagemBuilder.toString();
    }
}
