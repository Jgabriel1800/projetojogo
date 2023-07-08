import java.util.Scanner;
public class capitulo {
    private String texto;
    private String[] escolhas;
    private personagem jogador;
    private int habilidade;
    private Scanner scanner = new Scanner(System.in);

    public capitulo(String texto, String[] escolhas, personagem jogador, int habilidade) {
        this.texto = texto;
        this.escolhas = escolhas;
        this.jogador = jogador;
        this.habilidade = habilidade;
    }

    public void mostrarCapitulo() {
        System.out.println(this.texto);
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println((char)('a' + i) + ") " + escolhas[i]);
        }
        System.out.println("Habilidade atual: " + jogador.getHabilidade());
    }

    public int escolha() {
        while (true) {
            String input = scanner.nextLine();
            int opcao = input.toLowerCase().charAt(0) - 'a';
            if (opcao >= 0 && opcao < escolhas.length) {
                if (habilidade == 5) {
                    jogador.aumentarHabilidade(5);
                }
                if (habilidade == 10) {
                    jogador.aumentarHabilidade(10);
                }
                return opcao;
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }
}

