import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
public class capitulo {
    private String texto;
    protected ArrayList<escolha> escolhas;
    private int habilidade;
    private personagem jogador;
    private Scanner escaneador;
    protected capitulo(){
        this.escolhas = new ArrayList<escolha>();
        this.texto = "";
    }
    public capitulo(String texto,personagem jogador, int habilidade, Scanner escaneadorarquivo){
        this.jogador=jogador;
        this.texto=texto;
        this.escaneador=escaneadorarquivo;
        this.habilidade=habilidade;
        this.escolhas = new ArrayList<escolha>();
    }
    public capitulo(Map<String, personagem> personagens, Scanner escaneadorjogo, Scanner escaneadorarquivo){
        this.ler(personagens,  escaneadorarquivo);
        this.escaneador=escaneadorjogo;
        this.escolhas = new ArrayList<escolha>();
        }
        protected void ler(Map<String, personagem> personagens, Scanner escaneadorarquivo){
          escaneadorarquivo.nextLine();
          String idjogador=escaneadorarquivo.nextLine();
            this.jogador=personagens.get(idjogador);
            escaneadorarquivo.nextLine();
            String linha=escaneadorarquivo.nextLine();
            this.texto="";
            while(!linha.equals("Variarhabilidade")){
                if(linha.equals(idjogador)){

                    texto=texto + jogador.getNome();
                }else{
                    texto=texto+linha;
                }
                linha=escaneadorarquivo.nextLine();
            } 
            this.habilidade=Integer.parseInt(escaneadorarquivo.nextLine());
            }

            public void adicionarEscolha(escolha escolha){
                this.escolhas.add(escolha);
            }
            public void executar(){
                mostrar();
                if(escolhas.size()>0){
                    int idescolhido=escolher();
                    System.out.println();
                    System.out.println("Aquecendo os jogadores");
                    System.out.println();
                    escolhas.get(idescolhido).getProximo().executar();
             
                }else{
                    System.out.println("Fim de jogo");
                }
            }
            public void mostrar(){
                System.out.println(this.texto);
                jogador.ajustarhabilidade(habilidade);
                for(int i=0;i<escolhas.size();i++){
                    System.out.println((i+1)+"-"+escolhas.get(i).getTextoApresentado());
                }
                }
                public int escolher(){int escolhida=0;
                    String escolha;
                    boolean valido=false;
                    while(!valido){
                        System.out.println("Escolha uma opção");
                        escolha=escaneador.nextLine();
                        
                        for(int i=0;i<escolhas.size();i++){
                            if(escolha.equalsIgnoreCase(escolhas.get(i).getTextoEscrito())){
                                 valido=true;
                                escolhida=i;
                              
                            }
                        }
                        if(!valido){
                            System.out.println("Essa escolha não é possivel");
                        }
                    }
                    return escolhida;
                }
            }
        

    