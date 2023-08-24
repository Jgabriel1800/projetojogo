import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class capituloimagem extends capitulo{
private String imagem;

    
    public capituloimagem(HashMap<String, personagem> personagens, Scanner escaneadorjogo, Scanner escaneadorarquivo)
    {
        this.ler(personagens,  escaneadorarquivo);
        this.escolhas= new ArrayList<escolha>();
    }
    public void mostrar(){
        System.out.println();
        System.out.println(imagem);
        System.out.println();
        super.mostrar();
        
    }

    protected void ler(HashMap<String, personagem> personagens,Scanner escaneadorarquivo)
    {
        
        String linha= escaneadorarquivo.nextLine();
        linha=escaneadorarquivo.nextLine();
        this.imagem="";
        linha=escaneadorarquivo.nextLine();
        
        
        while(!linha.equals("FIMDAIMAGEM.")){
            this.imagem=this.imagem+linha;
            linha=escaneadorarquivo.nextLine();
        }
        super.ler(personagens,escaneadorarquivo);
    }
}


    

