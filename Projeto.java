import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        try (Scanner resposta = new Scanner(System.in)) {
            System.out.println("Bem-vindo(a) ao Futegame! Seja um jogador de verdade junto com seu amigo " +
                    " e crie sua carreira rumo ao estrelato." +
                    " Agora me diga como irá se chamar a próxima estrela:");
            personagem jogador = new personagem(resposta.nextLine());
            System.out.println("Qual será o nome do seu melhor amigo:");
            personagem amigo = new personagem(resposta.nextLine());

            String cap1 = "Tudo certo, " + jogador.getNome() + "! Agora uma decisão importante." +
                    " Você recebeu propostas de dois diferentes times. Escolha um:";
            String cap2 = "Você escolheu o Náutico! Seu amigo " + amigo.getNome() + " irá para o Sport. Agora, você deseja treinar ou descansar no Náutico?";
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
            String cap9 = "Você escolheu treinar no Sport. Bom treino!" +
                    " Você vai ser titular na partida final e no último minuto tem a chance de chutar no gol." +
                    " Em qual lado você chuta?";
            String cap10 = "Gooool! Você chutou no lado esquerdo e marcou para o Sport!";
            String cap11 = "Chute para fora! Você chutou no lado errado e não marcou, seu time não foi campeão";
            String cap12 = "Você escolheu descansar no Sport Recife. Aproveite o descanso!" +
                    " Você ficou no banco e viu seu time ser derrotado sem você";


            String escolha1cap1 = "a) Nautico";
            String escolha2cap1 = "b) Sport";
            String escolha1cap2 = "a) Treinar";
            String escolha2cap2 = "b) Descansar";
            String escolha1cap3 = "a) Esquerdo";
            String escolha2cap3 = "b) Direito";
            String escolha1cap8 = "a) Treinar";
            String escolha2cap8 = "b) Descansar";
            String escolha1cap9 = "a) Esquerdo";
            String escolha2cap9 = "b) Direito";

            capitulo capitulo1 = new capitulo(cap1, escolha1cap1, escolha2cap1, jogador, 0);
            capitulo capitulo2 = new capitulo(cap2, escolha1cap2, escolha2cap2, jogador, 5);
            capitulo capitulo3 = new capitulo(cap3, escolha1cap3, escolha2cap3, jogador, 10);
            capitulo capitulo4 = new capitulo(cap4, "", "", jogador, 0);
            capitulo capitulo5 = new capitulo(cap5, "", "", jogador, 0);
            capitulo capitulo6 = new capitulo(cap6, "", "", jogador, 0);
            capitulo capitulo7 = new capitulo(cap7, "", "", jogador, 0);
            capitulo capitulo8 = new capitulo(cap8, escolha1cap8, escolha2cap8, jogador, 5);
            capitulo capitulo9 = new capitulo(cap9, escolha1cap9, escolha2cap9, jogador, 10);
            capitulo capitulo10 = new capitulo(cap10, "", "", jogador, 0);
            capitulo capitulo11 = new capitulo(cap11, "", "", jogador, 0);
            capitulo capitulo12 = new capitulo(cap12, "", "", jogador, 0);

            capitulo1.mostrarCapitulo();
            int valor = capitulo1.escolha();
            if (valor == 1) {
                capitulo2.mostrarCapitulo();
                int valor2 = capitulo2.escolha();
                if (valor2 == 1) {
                    capitulo3.mostrarCapitulo();
                    int valor3 = capitulo3.escolha();
                    if (valor3 == 1) {
                        capitulo4.mostrarCapitulo();
                        jogador.aumentarHabilidade(10); // Adiciona 10 na habilidade ao fazer um gol
                    } else {
                        capitulo5.mostrarCapitulo();
                    }
                } else {
                    capitulo6.mostrarCapitulo();
                }
            } else if (valor == 2) {
                capitulo8.mostrarCapitulo();
                int valor8 = capitulo8.escolha();
                if (valor8 == 1) {
                    capitulo9.mostrarCapitulo();
                    int valor9 = capitulo9.escolha();
                    if (valor9 == 1) {
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

             
        }
    }
}
