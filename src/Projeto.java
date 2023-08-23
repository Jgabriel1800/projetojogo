import java.util.Map;
import java.util.Scanner;

public class Projeto {
public static void main(String[] args) {
        
        Leitordearquivo leitor= new Leitordearquivo();
        Scanner escaneador = new Scanner(System.in, "UTF-8");
        
        Map<String, personagem> personagens = leitor.carregarpersonagens("rsc/personagem.txt");
        Map<String,capitulo>capitulos=leitor.carregarCapitulos("rsc/capitulo.txt",personagens,escaneador);
        System.out.println("Carregamento Concluido\n\n...\n\n");
        capitulo raiz = capitulos.get("1");

        raiz.executar();
        
       escaneador.close();
    }
}