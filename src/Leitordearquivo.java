import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Leitordearquivo {
    public HashMap<String, personagem> carregarpersonagens(String caminho) {
      HashMap<String, personagem> personagens = new HashMap<String, personagem>();

      File arquivo = new File(caminho);
      try {
        Scanner escaneador = new Scanner(arquivo,"UTF-8");
            
        System.out.println("Carregando personagens...");
        int i = 0;
        while (escaneador.hasNextLine()) {
          i++;
          String id = escaneador.nextLine();
          String nome = escaneador.nextLine();
          int habilidade = Integer.parseInt(escaneador.nextLine());
                
            escaneador.nextLine();
            System.out.println("Personagem " + i);
                
            personagens.put(id, new personagem(nome,habilidade));
            
        }
        escaneador.close();
        
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        return personagens;
                
    }

    public HashMap<String, capitulo> carregarCapitulos(String caminho, Map<String, personagem> personagens,
        Scanner escaneadordoconsole) {
    
    HashMap<String, capitulo> capitulos = new HashMap<String, capitulo>();
            
    File arquivo = new File(caminho);
    try {
        Scanner escaneadordearquivo = new Scanner(arquivo,"UTF-8");

        System.out.println("Carregando capitulos...");
        String idCapituloAtual = null;
        capitulo capituloAtual = null;

        while (escaneadordearquivo.hasNextLine()) {
            String linha = escaneadordearquivo.nextLine().trim();

            if (linha.equals("CAPITULO") || linha.equals("CAPITULO_COM_IMAGEM")) {
                escaneadordearquivo.nextLine();  // Descarta a linha "ID"
                idCapituloAtual = escaneadordearquivo.nextLine().trim();  // Lê o ID do capítulo
                capituloAtual = new capitulo(personagens, escaneadordoconsole, escaneadordearquivo);
                capitulos.put(idCapituloAtual, capituloAtual);
                System.out.println("Capitulo " + idCapituloAtual);
            } else if (linha.equals("ESCOLHA")) {
                escaneadordearquivo.nextLine(); // Descarta a linha "DE"
                String idCapituloDe = escaneadordearquivo.nextLine().trim(); // Lê o ID do capítulo de origem
                escaneadordearquivo.nextLine(); // Descarta a linha "PARA"
                String idCapituloPara = escaneadordearquivo.nextLine().trim(); // Lê o ID do capítulo de destino
                escaneadordearquivo.nextLine(); // Descarta a linha "TEXTO DIGITADO"
                String TextoDigitado = escaneadordearquivo.nextLine().trim(); // Lê o texto digitado
                escaneadordearquivo.nextLine(); // Descarta a linha "TEXTO MOSTRADO"
                String TextoMostrado = escaneadordearquivo.nextLine().trim(); // Lê o texto mostrado

                if (capitulos.containsKey(idCapituloDe) && capitulos.containsKey(idCapituloPara)) {
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