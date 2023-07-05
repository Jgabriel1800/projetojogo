import java.util.Scanner;

public class capitulo {
    String texto;
    String escolha1;
    String escolha2;
    personagem jogador;
    int habilidade;
    Scanner scanner = new Scanner(System.in);

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
        System.out.println(this.habilidade);
    }

    int escolha() {
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("a")) {
                return 1;
            }
            if (input.equalsIgnoreCase("b")) {
                return 2;
            } else {
                System.out.println("Você optou por uma opção que não existe");
            }
        }
    }
}
