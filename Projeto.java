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

        capitulo capitulo1 = new capitulo(cap1, jogador, 0);
        capitulo capitulo2 = new capitulo(cap2, jogador, 5);
        capitulo capitulo3 = new capitulo(cap3, jogador, 10);
        capitulo capitulo4 = new capitulo(cap4, jogador, 0);
        capitulo capitulo5 = new capitulo(cap5, jogador, 0);
        capitulo capitulo6 = new capitulo(cap6, jogador, 0);
        capitulo capitulo7 = new capitulo(cap7, jogador, 0);
        capitulo capitulo8 = new capitulo(cap8, jogador, 5);
        capitulo capitulo9 = new capitulo(cap9, jogador, 15);
        capitulo capitulo10 = new capitulo(cap10, jogador, 0);
        capitulo capitulo11 = new capitulo(cap11, jogador, 0);
        capitulo capitulo12 = new capitulo(cap12, jogador, 0);

        escolha escolha1 = new escolha("Náutico", capitulo2);
        escolha escolha2 = new escolha("Sport", capitulo8);
        capitulo1.adicionarEscolhas(new escolha[]{escolha1, escolha2});

        escolha escolha3 = new escolha("Treinar", capitulo3);
        escolha escolha4 = new escolha("Descansar", capitulo6);
        capitulo2.adicionarEscolhas(new escolha[]{escolha3, escolha4});

        escolha escolha5 = new escolha("Esquerdo", capitulo4);
        escolha escolha6 = new escolha("Direito", capitulo5);
        capitulo3.adicionarEscolhas(new escolha[]{escolha5, escolha6});

        escolha escolha7 = new escolha("Treinar", capitulo9);
        escolha escolha8 = new escolha("Descansar", capitulo12);
        capitulo8.adicionarEscolhas(new escolha[]{escolha7, escolha8});

        escolha escolha9 = new escolha("Esquerdo", capitulo10);
        escolha escolha10 = new escolha("Direito", capitulo11);
        capitulo9.adicionarEscolhas(new escolha[]{escolha9, escolha10});

        capitulo raiz = capitulo1;
        raiz.executar();

        resposta.close();
    }
}
