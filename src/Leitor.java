import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Leitor {
    public HashMap<String, personagem> lerpersonagens(String caminho) {
      HashMap<String, personagem> personagens = new HashMap<String, personagem>();
      File arquivo = new File(caminho);
      try {
        Scanner escaneador = new Scanner(arquivo,"UTF-8");
        int i = 0;
        while (escaneador.hasNextLine()) {
          i++;
          String id = escaneador.nextLine();
          String nome = escaneador.nextLine();
          int habilidade = Integer.parseInt(escaneador.nextLine());
            escaneador.nextLine();
            System.out.println("Personagem:" + i);
            personagens.put(id, new personagem(nome,habilidade));
        }
        escaneador.close();
    }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return personagens;
    }
    public HashMap<String, capitulo> lerCapitulos(String caminho, Map<String, personagem> personagens,Scanner escaneadordoconsole) {
    HashMap<String, capitulo> capitulos = new HashMap<String, capitulo>();
    File arquivo = new File(caminho);
    try {
        Scanner escaneadordearquivo = new Scanner(arquivo,"UTF-8");
        System.out.println("Carregando capitulos...");
        String idCapituloAtual = null;
        capitulo capituloAtual = null;
        while (escaneadordearquivo.hasNextLine()) {
            String linha = escaneadordearquivo.nextLine();
            if (linha.equals("CAPITULO") ) {
                escaneadordearquivo.nextLine();
                idCapituloAtual = escaneadordearquivo.nextLine();
                capituloAtual = new capitulo(personagens, escaneadordoconsole, escaneadordearquivo);
                capitulos.put(idCapituloAtual, capituloAtual);
                System.out.println(" " + idCapituloAtual);
            
            } else if (linha.equals("ESCOLHA")) {
                escaneadordearquivo.nextLine();
                String idCapituloOrigem = escaneadordearquivo.nextLine();
                escaneadordearquivo.nextLine();
                String idCapituloPara = escaneadordearquivo.nextLine();
                escaneadordearquivo.nextLine();
                String TextoDigitado = escaneadordearquivo.nextLine();
                escaneadordearquivo.nextLine();
                String TextoMostrado = escaneadordearquivo.nextLine();
                
                if (capitulos.containsKey(idCapituloOrigem) && capitulos.containsKey(idCapituloPara)) {
                    capitulo capituloDestino = capitulos.get(idCapituloPara);
                    capituloAtual.adicionarEscolha(new escolha(TextoDigitado, TextoMostrado, capituloDestino));
                }
            }
        }
        escaneadordearquivo.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    return capitulos;
}

}