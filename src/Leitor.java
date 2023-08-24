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
            System.out.println("Convocando jogadores");
            int i = 0;
            
            while (escaneador.hasNextLine()) {
                i++;
                String id = escaneador.nextLine();
                String nome = escaneador.nextLine();
                int habilidade = Integer.parseInt(escaneador.nextLine());
                escaneador.nextLine();
                System.out.println("Jogador " + i+ "convocado");
                personagens.put(id, new personagem(nome, habilidade));
            }
            escaneador.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        return personagens;
    }

    public HashMap<String, capitulo> lercapitulos(String caminho, Map<String, personagem> personagens,
            Scanner escaneadordoconsole) {
            HashMap<String, capitulo> capitulos = new HashMap<String, capitulo>();
        File arquivo = new File(caminho);
        
        try {
            Scanner escaneadordearquivo = new Scanner(arquivo,"UTF-8");

            System.out.println("Preparando o campo");
            String linha = escaneadordearquivo.nextLine();
            
            while (escaneadordearquivo.hasNextLine()) {

                if (linha.equals("PARTE") ||
                    
                    linha.equals("PARTEIMAGEM")){
                    
                    escaneadordearquivo.nextLine();
                    String id = escaneadordearquivo.nextLine();

                    if (linha.equals("PARTE"))
                    {
                        capitulos.put(id, new capitulo(personagens, escaneadordoconsole, escaneadordearquivo));
                    }
                    else if (linha.equals("DECISAO"))
                    
                    {
                        Lerescolha(capitulos, escaneadordearquivo);
                    }

                    System.out.println("Capitulo " + id);
                    escaneadordearquivo.nextLine();

                    } else if (linha.equals("DECISAO")) {
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
                String idCapituloInicio = escaneadordearquivo.nextLine();
                escaneadordearquivo.nextLine();
                String idCapituloAte = escaneadordearquivo.nextLine();
                escaneadordearquivo.nextLine();
                String textoEscrito = escaneadordearquivo.nextLine();
                escaneadordearquivo.nextLine();
                String textoApresentado = escaneadordearquivo.nextLine();

                capitulos.get(idCapituloInicio)
                .adicionarEscolha(new escolha(textoEscrito, textoApresentado, capitulos.get(idCapituloAte)));
            }
}

                