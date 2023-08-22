
import java.util.Map;
import java.util.Scanner;
public class Projeto {
public static void main(String[] args) {
        
        Leitordearquivo leitor= new Leitordearquivo();
        Scanner escaneador = new Scanner(System.in, "UTF-8");
        
        Map<String, personagem> personagens = leitor.carregarpersonagens("rsc/Personagens.txt");
        Map<String,capitulo>capitulos=leitor.carregarCapitulos("rsc/Capitulos.txt",personagens,escaneador);
        
        System.out.println("Carregamento finalizado\n\n...\n\n");
        
        capitulo raiz = capitulos.get("Capitulo1");

        raiz.executar();
        
       escaneador.close();
    }
}