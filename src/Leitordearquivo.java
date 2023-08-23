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
            
            System.out.println("Carregando Ações...");
            int i = 0;
            while (escaneador.hasNextLine()) {
                i++;
                String id = escaneador.nextLine();
                String nome = escaneador.nextLine();
                int habilidade = Integer.parseInt(escaneador.nextLine());
                escaneador.nextLine();
                System.out.println("Personagem " + i);
                personagens.put(id, new personagem(nome, habilidade));
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
            String linha = escaneadordearquivo.nextLine();
            while (escaneadordearquivo.hasNextLine()) {

                if (linha.equals("CAPITULO") ||
                    linha.equals("CAPITULO_COM_IMAGEM")){
                    
                    escaneadordearquivo.nextLine();
                    String id = escaneadordearquivo.nextLine();

                    if (linha.equals("CAPITULO"))
                    {
                        capitulos.put(id, new capitulo(personagens, escaneadordoconsole, escaneadordearquivo));
                    }
                    else if (linha.equals("ESCOLHA"))
                    
                    {
                        Lerescolha(capitulos, escaneadordearquivo);
                    }

                    System.out.println("Capitulo " + id);
                    escaneadordearquivo.nextLine();

                    } else if (linha.equals("ESCOLHA")) {
                        Lerescolha(capitulos, escaneadordearquivo);
                
                    }
                    linha=escaneadordearquivo.nextLine();
                }
                escaneadordearquivo.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                return capitulos;

            }
            
            private void Lerescolha(HashMap<String, capitulo> capitulos, Scanner escaneadordearquivo) {

                escaneadordearquivo.nextLine();
                String idCapituloDe = escaneadordearquivo.nextLine();
                escaneadordearquivo.nextLine();
                String idCapituloPara = escaneadordearquivo.nextLine();
                escaneadordearquivo.nextLine();
                String textoDigitado = escaneadordearquivo.nextLine();
                escaneadordearquivo.nextLine();
                String textoMostrado = escaneadordearquivo.nextLine();

                capitulos.get(idCapituloDe)
                .adicionarescolha(new escolha(textoDigitado, textoMostrado, capitulos.get(idCapituloPara)));
            }
}

                