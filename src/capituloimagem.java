import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class capituloimagem extends capitulo{
    private String imagem;



    public capituloimagem(HashMap<String, personagem> personagens, Scanner escaneadorjogo, Scanner escaneadorarquivo)
    {
       super();
       this.ler(personagens, escaneadorarquivo);
       this.escaneador=escaneadorjogo;
       this.escolhas=new ArrayList<escolha>();
    }

    public capituloimagem(capitulo capitulo, String imagem)
    {
        this.imagem=imagem;
        this.texto=capitulo.texto;
        this.habilidade=capitulo.habilidade;
        this.jogador=capitulo.jogador;
        this.escolhas=capitulo.escolhas;
        this.escaneador=capitulo.escaneador;
    }



    protected void ler(HashMap<String, personagem> personagens,Scanner escaneadorarquivo)
    {
        super.ler(personagens, escaneadorarquivo);
        escaneadorarquivo.nextLine();
        String linha=escaneadorarquivo.nextLine();
        this.imagem="";
        if(linha.equals("IMAGEM")){
            while(!linha.equals("FIM")){
                this.imagem= imagem+ "\n" + linha;
                linha=escaneadorarquivo.nextLine();
            }
        }
    }
    protected void mostrar(){
        System.out.println();
        System.out.println("...............");
        System.out.println(this.imagem);
        super.mostrar();
    }
}
