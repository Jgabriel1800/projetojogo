import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao Futegame! Seja um jogador de verdade junto com seu amigo " +
                " e crie sua carreira rumo ao estrelato." +
                " Agora me diga como irá se chamar a próxima estrela?");
        personagem jogador = new personagem(resposta.nextLine());
        System.out.println("Qual será o nome do seu melhor amigo:");
        personagem amigo = new personagem(resposta.nextLine());

        String cap1 = "Tudo certo, " + jogador.getNome() + "! Agora uma decisão importante." +
                " Você recebeu propostas de dois diferentes times. Escolha um:";
        String cap2 = "Você escolheu o Náutico! Seu amigo " + amigo.getNome() + " irá para o Sport."+
        "Agora, você deseja treinar ou descansar no Náutico?";
        String cap3 = "Você escolheu treinar no Náutico. Bom treino!" +
                " Você vai ser titular na partida final e no último minuto tem a chance de chutar no gol." +
                " Em qual lado você chuta?";
        String cap4 = "Gooool! Você chutou no lado esquerdo e marcou para o Náutico!" +
                " O Náutico foi campeão do Pernambucano";
        String cap5 = "Chute para fora! Você chutou no lado errado e não marcou, seu time não foi campeão";
        String cap6 = "Você escolheu descansar no Náutico. Aproveite o descanso!" +
                " Você ficou no banco e viu seu time ser campeão sem você";
        String cap7 = "Escolha inválida. Por favor, execute o programa novamente e escolha uma opção válida.";
        String cap8 = "Você escolheu o Sport! Agora, você deseja treinar ou descansar no Sport?";
        String cap9 = "Você escolheu treinar no Sport!"+ amigo.getNome()+ "Bom treino!" +
                " Você vai ser titular na partida final e no último minuto tem a chance de chutar no gol." +
                " Em qual lado você chuta?";
        String cap10 = "Gooool! Você chutou no lado esquerdo e marcou para o Sport!";
        String cap11 = "Chute para fora! Você chutou no lado errado e não marcou, seu time não foi campeão";
        String cap12 = "Você escolheu descansar no Sport Recife. Aproveite o descanso!" +
                " Você ficou no banco e viu seu time ser derrotado sem você";

        String[] escolhasCap1 = {"Náutico", "Sport"};
        String[] escolhasCap2 = {"Treinar", "Descansar"};
        String[] escolhasCap3 = {"Esquerdo", "Direito"};
        String[] escolhasCap8 = {"Treinar", "Descansar"};
        String[] escolhasCap9 = {"Esquerdo", "Direito"};

        capitulo capitulo1 = new capitulo(cap1, escolhasCap1, jogador, 0);
        capitulo capitulo2 = new capitulo(cap2, escolhasCap2, jogador, 5);
        capitulo capitulo3 = new capitulo(cap3, escolhasCap3, jogador, 10);
        capitulo capitulo4 = new capitulo(cap4, new String[]{}, jogador, 0);
        capitulo capitulo5 = new capitulo(cap5, new String[]{}, jogador, 0);
        capitulo capitulo6 = new capitulo(cap6, new String[]{}, jogador, 0);
        capitulo capitulo7 = new capitulo(cap7, new String[]{}, jogador, 0);
        capitulo capitulo8 = new capitulo(cap8, escolhasCap8, jogador, 5);
        capitulo capitulo9 = new capitulo(cap9, escolhasCap9, jogador, 10);
        capitulo capitulo10 = new capitulo(cap10, new String[]{}, jogador, 0);
        capitulo capitulo11 = new capitulo(cap11, new String[]{}, jogador, 0);
        capitulo capitulo12 = new capitulo(cap12, new String[]{}, jogador, 0);

        capitulo1.mostrarCapitulo();
        int valor = capitulo1.escolha();
        if (valor == 0) {
            capitulo2.mostrarCapitulo();
            int valor2 = capitulo2.escolha();
            if (valor2 == 0) {
                capitulo3.mostrarCapitulo();
                int valor3 = capitulo3.escolha();
                if (valor3 == 0) {
                    capitulo4.mostrarCapitulo();
                    jogador.aumentarHabilidade(10);
                } else {
                    capitulo5.mostrarCapitulo();
                }
            } else {
                capitulo6.mostrarCapitulo();
            }
        } else if (valor == 1) {
            capitulo8.mostrarCapitulo();
            int valor8 = capitulo8.escolha();
            if (valor8 == 0) {
                capitulo9.mostrarCapitulo();
                int valor9 = capitulo9.escolha();
                if (valor9 == 0) {
                    capitulo10.mostrarCapitulo();
                    jogador.aumentarHabilidade(10); 
                } else {
                    capitulo11.mostrarCapitulo();
                }
            } else {
                capitulo12.mostrarCapitulo();
            }
        } else {
            capitulo7.mostrarCapitulo();
        }
        resposta.close();
    }
}
