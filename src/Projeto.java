
import java.util.Map;
import java.util.Scanner;
public class Projeto {
public static void main(String[] args) {
        
        Leitor leitor= new Leitor();
        Scanner escaneador = new Scanner(System.in, "UTF-8");
        
        Map<String, personagem> personagens = leitor.lerpersonagens("rsc/Personagens.txt");
        Map<String,capitulo>capitulos=leitor.lerCapitulos("rsc/Capitulos.txt",personagens,escaneador);
        System.out.println("Carregamento finalizado\n\n...\n\n");
        capitulo raiz = capitulos.get("1");

        raiz.executar();
        
       escaneador.close();
    }
}