import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Leitordearquivo {
    public HashMap<String, personagem> carregarpersonagens(String caminho) {
        HashMap<String, personagem> personagens = new HashMap<String, personagem>();

        File arquivo = new File(caminho);

        try {
            Scanner escaneador = new Scanner(arquivo);

            while (escaneador.hasNextLine()) {

                escaneador.nextLine(); //nome:

                String nome= escaneador.nextLine();

                escaneador.nextLine(); //habilidade:

                int habilidade= Integer.parseInt(escaneador.nextLine());
                
                escaneador.nextLine();//\n


                personagens.put(nome, new personagem(habilidade));
            }
            
            escaneador.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return personagens;
                
    }
    //void salvarpersonagens();
}
