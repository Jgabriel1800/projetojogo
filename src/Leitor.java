import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Leitor {
    public HashMap<String,personagem> lerpersonagens(String caminho){
        HashMap<String,personagem> personagens = new HashMap<String,personagem>();
        File arquivo = new File(caminho);
        try{
            Scanner escaneador = new Scanner(arquivo,"UTF-8");
            System.out.println("Convocando jogadores");

            int i=0;
            while(escaneador.hasNextLine()){
                i++;
                String id=escaneador.nextLine();
                String nome=escaneador.nextLine();
                int habilidade=Integer.parseInt(escaneador.nextLine());
                escaneador.nextLine();
                System.out.println("Jogador "+i+" "+nome+" convocado");
                personagens.put(id, new personagem(nome,habilidade));
            }
            escaneador.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return personagens;
    }
    public HashMap<String,capitulo> lercapitulos(String caminho, Map<String, personagem>personagens,Scanner escaneadorjogo){
        HashMap<String,capitulo> capitulos = new HashMap<String,capitulo>();

        File arquivo = new File(caminho);
        try{

            Scanner escaneadorarquivo = new Scanner(arquivo,"UTF-8");
            System.out.println("Preparando o campo");
            String linha = escaneadorarquivo.nextLine();

            while(escaneadorarquivo.hasNextLine())
            {
                if(linha.equals("PARTEIMAGEM")){
                    escaneadorarquivo.nextLine();
                    String id = escaneadorarquivo.nextLine();

                    if(linha.equals("PARTE")){
                        capitulos.put(id, new capitulo(personagens, escaneadorjogo, escaneadorarquivo));
                    }
                    else if(linha.equals("DECISAO")){
                        leitorescolhas(capitulos,escaneadorarquivo);
                    }
                    
                    System.out.println("PARTE"+id);
                    escaneadorarquivo.nextLine();
                }
                
                else if(linha.equals("DECISAO")){
                    leitorescolhas(capitulos,escaneadorarquivo);
                }

                if(linha.equals("PARTE")){
                    escaneadorarquivo.nextLine();
                    String id = escaneadorarquivo.nextLine();

                    if(linha.equals("PARTE")){
                        capitulos.put(id, new capitulo(personagens, escaneadorjogo, escaneadorarquivo));
                    }
                    else if(linha.equals("DECISAO")){
                        leitorescolhas(capitulos,escaneadorarquivo);
                    }
                    
                    System.out.println("PARTE"+id);
                    escaneadorarquivo.nextLine();
                }
                
                else if(linha.equals("DECISAO")){
                    leitorescolhas(capitulos,escaneadorarquivo);
                }

                linha = escaneadorarquivo.nextLine();
            
            }

            escaneadorarquivo.close();
        
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        return capitulos;
    }
    
    public void leitorescolhas(HashMap<String,capitulo> capitulos, Scanner escaneadorarquivo){
        escaneadorarquivo.nextLine();
        String idCapituloInicio = escaneadorarquivo.nextLine();
        
        escaneadorarquivo.nextLine();
        String idCapituloAte = escaneadorarquivo.nextLine();
        
        
        escaneadorarquivo.nextLine();
        String textoEscrito= escaneadorarquivo.nextLine();
        
        escaneadorarquivo.nextLine();
        String textoApresentado= escaneadorarquivo.nextLine();
        
        capitulos.get(idCapituloInicio).adicionarEscolha(new escolha(textoEscrito,textoApresentado,capitulos.get(idCapituloAte)));
    }

}