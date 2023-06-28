import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem-vindo(a) ao Rex criminous");
            System.out.println("Você é um jovem prestes a entrar no mundo do crime" +
            "Faça suas escolhas com sabedoria e se torne rei ou rainha do crime!");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Vou lhe contar um pouco da sua história, você mora em Chigado na década de 40," + 
            "sua família é de origem humilde, então decide entrar para o mundo do crime" +
            "Esse mundo não é fácil, é muito cruel, então saiba fazer suas escolhas com cuidado" + 
            "ou vai se arrepender!");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Você irá começar com zero de experiência" + 
            "dependendo das suas ações você pode ir aumentando esse valor" +
            "Quanto maior for a sua experiência você terá mais respeito e será mais conhecido");
            
            System.out.println("Digite o nome do seu personagem:");
            String nome = scanner.nextLine();

            int idade = 0;
            boolean idadeValida = false;
            while (!idadeValida) {
                System.out.println("Digite a idade do seu personagem:");
                String input = scanner.nextLine();
                try {
                    idade = Integer.parseInt(input);
                    idadeValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Idade inválida. Digite novamente.");
                }
            }
            
            Personagem personagem = new Personagem(nome, idade);

            System.out.println("Digite o nome do seu melhor amigo:");
            String nomeAmigo = scanner.nextLine();

            int idadeAmigo = 0;
            boolean idadeAmigoValida = false;
            while (!idadeAmigoValida) {
                System.out.println("Digite a idade do seu melhor amigo:");
                String input = scanner.nextLine();
                try {
                    idadeAmigo = Integer.parseInt(input);
                    idadeAmigoValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Idade inválida. Digite novamente.");
                }
            }
            
            System.out.println("Vocês irão começar com zero de habilidade e experiência\n" +
            "No final de cada capítulo irá mostra como está a situação da sua habilidade e experiência");
            Personagem amigo = new Personagem(nomeAmigo, idadeAmigo);

            System.out.println("Tudo certo, " + nome + ". Você vai para o seu primeiro roubo de carga à noite e" + 
            "decide chamar seu melhor amigo, "
             + nomeAmigo + ", para ir com você");
            System.out.println("Vão assaltar um carregamento de bebidas no porto à meia-noite" +
            "Quando chegam no local, " + nomeAmigo + " quer desistir. O que você faz?");
            System.out.println("a) O convence a continuar, pois essa é a melhor chance para vocês");
            System.out.println("b) Deixa ele voltar para casa e faz o assalto sozinho");
            System.out.println("c) Você chama ele de covarde e começam uma briga");
            
            boolean escolhaValida = false;
            while (!escolhaValida) {
                String choice = scanner.nextLine();
                switch (choice.toLowerCase()) {
                    case "a":
                        System.out.println("Você o convence a roubar a carga. Quando chegam no local, vocês encontram 2 guardas." +
                        " vocês encontram 2 guardas.O que você faz?");
                        System.out.println("a) Vocês tentam ser mais cautelosos e distraí-los para conseguir roubar a carga");
                        System.out.println("b) Vocês já chegam atirando porque não querem perder tempo");
                        escolhaValida = false;
                        while (!escolhaValida) {
                            choice = scanner.nextLine();
                            switch (choice.toLowerCase()) {
                                case "a":
                                    System.out.println(nomeAmigo + " disse que irá servir de distração para que você consiga roubar a carga" +
                                    "Parabéns pela conquista! Vocês conseguiram roubar todo o carregamento de bebidas");
                                    personagem.aumentarExperiencia(5);
                                    personagem.aumentarHabilidade(5);
                                    amigo.aumentarExperiencia(3);
                                    amigo.aumentarHabilidade(5);
                                    escolhaValida = true;
                                    break;
                    case "b":
                        System.out.println("Não é assim que o mundo do crime funciona, vocês entraram em uma troca de tiros e morreram!");
                        personagem.aumentarExperiencia(-5);
                        amigo.aumentarExperiencia(-5);
                        System.out.println("Fim de jogo!");
                        escolhaValida = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Digite novamente.");
                        break;
                }
            }
            break;
        case "b":
            System.out.println("Você vai tentar assaltar sozinho as cargas. O que você vai fazer?");
            System.out.println("a) Estudar todo o ambiente para tentar descobrir um bom plano");
            System.out.println("b) Dar conta dos dois guardas sozinho");
            escolhaValida = false;
            while (!escolhaValida) {
                choice = scanner.nextLine();
                switch (choice.toLowerCase()) {
                    case "a":
                        System.out.println("Você tenta dar tiros para longe para tentar distrair os guardas" +
                        "Infelizmente, os guardas percebem sua presença e você é capturado!");
                        personagem.aumentarExperiencia(-5);
                        System.out.println("Fim de jogo!");
                        escolhaValida = true;
                        break;
                    case "b":
                        System.out.println("Você parte para cima dos guardas e consegue derrotá-los" +
                        "Parabéns! Você roubou todo o carregamento de bebidas com sucesso");
                        personagem.aumentarExperiencia(5);
                        personagem.aumentarHabilidade(5);
                        escolhaValida = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Digite novamente.");
                        break;
                }
            }
            break;
        default:
            System.out.println("Opção inválida. Digite novamente.");
            break;
    }
}

System.out.println("Após realizar esse grande roubo, vocês escondem a mercadoria e vão decidir o que vão fazer depois");
System.out.println("a) Vão no bar na vizinhança de vocês comemorar");
System.out.println("b) Você recebe uma ligação de um número desconhecido lhe chamando para se encontrar no parque da cidade");

 String choice = scanner.nextLine();
switch (choice.toLowerCase()) {
    case "a":
        System.out.println("Chegando na festa com o " + nomeAmigo + 
        ",vocês percebem pessoas que nunca tinham visto na região fazendo confusão dentro do bar. O que vocês vão fazer?");
        System.out.println("a) Vão brigar e expulsar os caras para fora do bar");
        System.out.println("b) Não vão fazer nada, isso não é problema de vocês");

        choice = scanner.nextLine();
        switch (choice.toLowerCase()) {
            case "a":
                System.out.println("Vocês vão brigar e expulsar os caras do bar. Todos ficam impressionados" +
                 "com a coragem de vocês.");
                System.out.println("Após a briga, vocês são abordados por um homem misterioso que se apresenta" + 
                "como um chefe do crime local.");
                System.out.println("Ele elogia a coragem de vocês e diz ter uma proposta de trabalho." + 
                "Ele oferece uma oportunidade para vocês ingressarem na organização criminosa e ganharem muito dinheiro.");
                System.out.println("a) Aceitar a proposta e se juntar à organização criminosa");
                System.out.println("b) Recusar a proposta e continuar por conta própria");

                choice = scanner.nextLine();
                switch (choice.toLowerCase()) {
                    case "a":
                        System.out.println("Vocês decidem aceitar a proposta e se juntar à organização criminosa." + 
                        "O homem misterioso sorri e diz que vocês fizeram a escolha certa.");
                        System.out.println("Ele os leva para um lugar secreto onde vocês conhecem outros membros da organização" + 
                        "e começam a planejar seus próximos golpes.");
                        personagem.aumentarExperiencia(10);
                        amigo.aumentarExperiencia(8);
                        personagem.aumentarHabilidade(2);
                        amigo.aumentarHabilidade(2);
                        System.out.println("Parabéns! Vocês estão oficialmente no mundo do crime!");
                        break;
                    case "b":
                        System.out.println("Vocês recusam a proposta do homem misterioso e decidem continuar por conta própria.");
                        System.out.println("Vocês sabem que o caminho será mais difícil," + 
                        "mas estão determinados a fazerem seu próprio nome no mundo do crime.");
                        personagem.aumentarExperiencia(8);
                        amigo.aumentarExperiencia(8);
                        amigo.aumentarHabilidade(-2);
                        personagem.aumentarHabilidade(-3);
                        System.out.println("Boa sorte nessa jornada! Vocês vão precisar!");
                        break;
                    default:
                        System.out.println("Opção inválida. Digite novamente.");
                        break;
                }
                break;
            case "b":
                System.out.println("Vocês decidem não se envolver na confusão e apenas aproveitar a festa.");
                System.out.println("Vocês dançam, bebem e se divertem a noite toda.");
                System.out.println("No final da noite, vocês conhecem uma pessoa influente na região," + 
                "que se impressiona com a atitude de vocês.");
                System.out.println("Essa pessoa oferece uma oportunidade de negócio no mundo do crime.");
                System.out.println("a) Aceitar a oportunidade e começar uma parceria com essa pessoa");
                System.out.println("b) Recusar a oportunidade e continuar por conta própria");

                choice = scanner.nextLine();
                switch (choice.toLowerCase()) {
                    case "a":
                        System.out.println("Vocês aceitam a oportunidade e começam uma parceria com a pessoa influente.");
                        System.out.println("Juntos, vocês planejam e executam diversos golpes," + 
                        "acumulando riqueza e respeito no mundo do crime.");
                        personagem.aumentarExperiencia(10);
                        amigo.aumentarExperiencia(10);
                        amigo.aumentarHabilidade(5);
                        personagem.aumentarHabilidade(5);
                        System.out.println("Vocês se tornam uma das duplas mais temidas e respeitadas do submundo.");
                        break;
                    case "b":
                        System.out.println("Vocês recusam a oportunidade e decidem continuar por conta própria.");
                        System.out.println("Vocês sabem que o caminho será mais desafiador," + 
                        "mas estão determinados a conquistar o mundo do crime por conta própria.");
                        personagem.aumentarExperiencia(5);
                        amigo.aumentarExperiencia(3);
                        amigo.aumentarHabilidade(-1);
                        personagem.aumentarHabilidade(-1);
                        System.out.println("Boa sorte nessa jornada! Vocês vão precisar!");
                        break;
                    default:
                        System.out.println("Opção inválida. Digite novamente.");
                        break;
                }
                break;
            default:
                System.out.println("Opção inválida. Digite novamente.");
                break;
        }
        break;
    case "b":
        System.out.println("Você vai tentar assaltar sozinho as cargas. O que você vai fazer?");
        System.out.println("a) Estudar todo o ambiente para tentar descobrir um bom plano");
        System.out.println("b) Dar conta dos dois guardas sozinho");
        amigo.aumentarHabilidade(-3);
        amigo.aumentarExperiencia(-3);
        personagem.aumentarHabilidade(4);
        personagem.aumentarExperiencia(-4);
        choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("a")) {
            System.out.println("Você tenta dar tiros para longe para tentar distrair os guardas");
            System.out.println("No início dá certo, mas você não consegue sair a tempo do local");
            System.out.println("Então os guardas te prendem e te levam para o chefe deles, um grande mafioso");
            personagem.aumentarExperiencia(-5);
            personagem.aumentarHabilidade(4);
            System.out.println("O chefe está furioso com a audácia de tentar roubar. Ele decide te punir duramente.");
            System.out.println("a) Você implora por sua vida e promete servir ao chefe como um subordinado leal");
            System.out.println("b) Você mostra coragem diante do chefe e se recusa a se submeter a ele");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("a")) {
                System.out.println("Você implora por sua vida e o chefe decide te dar uma chance." + 
                "Ele te coloca em um trabalho de baixo nível, realizando tarefas sujas para provar sua lealdade.");
                personagem.aumentarExperiencia(2);
                personagem.aumentarHabilidade(-2);
                System.out.println("Você ganha alguma experiência," + 
                "mas está preso na organização criminosa como um mero subordinado.");
                System.out.println("Sua ambição de se tornar um líder do crime é adiada.");
            } else {
                System.out.println("Você mostra coragem diante do chefe, mas ele não tolera desafios à sua autoridade.");
                System.out.println("Ele ordena que você seja eliminado imediatamente.");
                personagem.aumentarExperiencia(-10);
                personagem.aumentarHabilidade(3);
                System.out.println("Infelizmente, sua ousadia resultou em sua morte prematura.");
                System.out.println("Fim de jogo!");
            }
        } else {
            System.out.println("Não é assim que o mundo do crime funciona, você entrou em uma troca de tiros e morreu!");
            personagem.aumentarExperiencia(-5);
            System.out.println("Fim de jogo!");
        }
        break;

    case "c":
        System.out.println("Vocês chamaram a atenção dos guardas com a briga. O que você vai fazer?");
        System.out.println("a) Vocês vão correr e tentar novamente outro roubo em outro dia");
        System.out.println("b) Vocês não são covardes e vão tentar brigar");
        choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("a")) {
            System.out.println("Vocês pegam suas coisas e conseguem fugir a tempo sem serem pegos" +
            "Tente novamente outro dia, pense com sabedoria e irá conseguir");
            personagem.aumentarExperiencia(3);
            amigo.aumentarExperiencia(2);
            amigo.aumentarHabilidade(1);
            personagem.aumentarHabilidade(1);
            System.out.println("Você aprendeu com esse contratempo e ganhou um pouco de experiência." +
            "Lembre-se de planejar melhor suas ações e escolher os momentos adequados para o crime." +
            "Continue sua jornada e boa sorte!");
        } else {
            System.out.println("Vocês tentam pegar suas armas para se defender, mas estão despreparados" +
            "Não é assim que o mundo do crime funciona," +  
            "vocês entraram em uma troca de tiros e morreram!");
            personagem.aumentarExperiencia(-5);
            personagem.aumentarHabilidade(1);
            amigo.aumentarHabilidade(1);
            amigo.aumentarExperiencia(-5);
            System.out.println("Fim de jogo!");
        }
        break;

    default:
        System.out.println("Opção inválida. Digite novamente.");
        break;
}
System.out.println("------------------------------------------------------------------------");
System.out.println("Finalizou o primeiro capítulo de muitos que ainda vêm por aí!!");
System.out.println("Personagem - Experiência: " + personagem.getExperiencia() + ", Habilidade: " + personagem.getHabilidade());
System.out.println("Amigo - Experiência: " + amigo.getExperiencia() + ", Habilidade: " + amigo.getHabilidade());

            
        }
    }
}

class Personagem {
    private String nome;
    private int idade;
    private int experiencia;
    private int habilidade;

    public Personagem(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.experiencia = 0;
        this.habilidade = 0;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void aumentarHabilidade(int valor) {
        habilidade += valor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void aumentarExperiencia(int valor) {
        experiencia += valor;
        if (experiencia < 0) {
            experiencia = 0;
        }
    }
}



