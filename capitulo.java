
import java.util.Scanner;

public class capitulo {
    private String texto;
    private String escolha1;
    private String escolha2;
    private personagem jogador;
    private int habilidade;
    private Scanner scanner = new Scanner(System.in);

    public capitulo(String texto, String escolha1, String escolha2, personagem jogador, int habilidade) {
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.jogador = jogador;
        this.habilidade = habilidade;
    }

    public void mostrarCapitulo() {
        System.out.println(this.texto);
        System.out.println(this.escolha1);
        System.out.println(this.escolha2);
        System.out.println("Habilidade atual: " + jogador.getHabilidade());
    }

    public int escolha() {
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("a")) {
                jogador.aumentarHabilidade(habilidade);
                return 1;
            }
            if (input.equalsIgnoreCase("b")) {
                jogador.diminuirHabilidade(habilidade);
                return 2;
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }
}
