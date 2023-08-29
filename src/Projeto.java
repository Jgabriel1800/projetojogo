import java.util.Map;
import java.util.Scanner;

public class Projeto {
public static void main(String[] args) {
        
        Leitor leitor= new Leitor();
        Scanner escaneador = new Scanner(System.in, "UTF-8");
        
        Map<String, personagem> personagens = leitor.lerpersonagens("rsc/personagem.txt");
        Map<String,capitulo>capitulos=leitor.lercapitulos("rsc/capitulo.txt",personagens,escaneador);
        System.out.println("Vamos começar sua carreira");
        
        capitulo raiz = capitulos.get("1");

        raiz.executar();
       escaneador.close();
    }
}