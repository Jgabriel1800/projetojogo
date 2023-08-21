import java.util.Scanner;

public class capitulo {
    private String texto;
    private escolha[] escolhas;
    private personagem jogador;
    private int habilidade;
    private Scanner scanner = new Scanner(System.in);

    public capitulo(String texto, personagem jogador, int habilidade) {
        this.texto = texto;
        this.jogador = jogador;
        this.habilidade = habilidade;
    }

    public String getTexto() {
        return texto;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void mostrarCapitulo() {
        System.out.println(this.texto);
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println((char) ('a' + i) + ") " + escolhas[i].getTexto());
        }
        System.out.println("Habilidade atual: " + jogador.getHabilidade());
    }

    public void executar() {
        mostrarCapitulo();
        escolher();
    }

    private void escolher() {
        while (true) {
            String input = scanner.nextLine();
            int opcao = input.toLowerCase().charAt(0) - 'a';
            if (opcao >= 0 && opcao < escolhas.length) {
                escolha escolha = escolhas[opcao];
                capitulo proximoCapitulo = escolha.getProximo();
                
                
                jogador.aumentarHabilidade(proximoCapitulo.getHabilidade());
                
                proximoCapitulo.executar();
                return;
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }

    public void adicionarEscolhas(escolha[] escolhas) {
        this.escolhas = escolhas;
    }
}
