import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem-vindo(a) ao Rex criminis");
            System.out.println("Você é um jovem prestes a entrar no mundo do crime");
            System.out.println("Faça suas escolhas com sabedoria e se torne rei ou rainha do crime!");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Seu nome é Rondo, você mora em Chigado na década de 40, sua família é de origem humilde, então decide entrar para o mundo do crime");
            System.out.println("Esse mundo não é fácil, é muito cruel, então saiba fazer suas escolhas com cuidado ou vai se arrepender!");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Você vai para o seu primeiro roubo de carga à noite e decide chamar seu melhor amigo, Peter, para ir com você");
            System.out.println("Vão assaltar um carregamento de bebidas no porto à meia-noite");
            System.out.println("Quando chegam no local, Peter quer desistir. O que você faz?");
            System.out.println("a) O convence a continuar, pois essa é a melhor chance para vocês");
            System.out.println("b) Deixa ele voltar para casa e faz o assalto sozinho");
            System.out.println("c) Você chama ele de covarde e começam uma discussão");
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "a":
                    System.out.println("Você o convence a roubar a carga. Quando chegam no local, vocês encontram 2 guardas. O que você faz?");
                    System.out.println("a) Vocês tentam ser mais cautelosos e distraí-los para conseguir roubar a carga");
                    System.out.println("b) Vocês já chegam atirando porque não querem perder tempo");
                    choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("a")) {
                        System.out.println("Seu amigo disse que irá servir de distração para que você consiga roubar a carga");
                        System.out.println("Parabéns pela conquista! Vocês conseguiram roubar todo o carregamento de bebidas");
                        System.out.println("Você tem um grande futuro no mundo do crime");
                    } else {
                        System.out.println("Não é assim que o mundo do crime funciona, vocês entraram em uma troca de tiros e morreram!");
                        System.out.println("Fim de jogo!");
                    }
                    break;

                case "b":
                    System.out.println("Você vai tentar assaltar sozinho as cargas. O que você vai fazer?");
                    System.out.println("a) Estudar todo o ambiente para tentar descobrir um bom plano");
                    System.out.println("b) Dar conta dos dois guardas sozinho");
                    choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("a")) {
                        System.out.println("Você tenta dar tiros para longe para tentar distrair os guardas");
                        System.out.println("No início dá certo, mas você não consegue sair a tempo do local");
                        System.out.println("Então os guardas te prendem e te levam para o chefe deles, um grande mafioso");
                    } else {
                        System.out.println("Não é assim que o mundo do crime funciona, você entrou em uma troca de tiros e morreu!");
                        System.out.println("Fim de jogo!");
                    }
                    break;

                case "c":
                    System.out.println("Vocês chamaram a atenção dos guardas com a briga. O que você vai fazer?");
                    System.out.println("a) Vocês vão correr e tentar novamente outro roubo em outro dia");
                    System.out.println("b) Vocês não são covardes e vão tentar brigar");
                    choice = scanner.nextLine();

                    if (choice.equalsIgnoreCase("a")) {
                        System.out.println("Vocês pegam suas coisas e conseguem fugir a tempo sem serem pegos");
                        System.out.println("Tente novamente outro dia, pense com sabedoria e irá conseguir");
                    } else {
                        System.out.println("Vocês tentam pegar suas armas para se defender, mas estão despreparados");
                        System.out.println("Não é assim que o mundo do crime funciona, vocês entraram em uma troca de tiros e morreram!");
                        System.out.println("Fim de jogo!");
                    }
                    break;
            }
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Acabou o primeiro capítulo de muitos que ainda vêm por aí!!");
    }
}
