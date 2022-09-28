import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;
//HD PARA A MEMORIA RAM

public class Servidordedados {

HashMap<String, Personagem> SelectPersonagem(String teste)
{
    //dia 24 buscar hashmap
    HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
    File DadosServidor = new File(teste);
    //eu nao sei o que ta eerrado aqui cara, serio 09:45 DIA 25
    try
    {
        Scanner leitordados = new Scanner(DadosServidor, "UTF -8");
        //DESCOBRI OQUE TAVA ERRADO, ERA O PARENTESE  8;00 DIA 28
        System.out.println("ARQUIVO FOI CARRREGADO");
        //nao entendi como iniciliaza string
        String buscadopersonagem = "";

        while(!buscadopersonagem.equals(null))
        //ideia de hash, buscar enquanto por diferente de nulo 
        {
            buscadopersonagem = leitordados.nextLine();
        }
        buscadopersonagem = leitordados.nextLine();
        ClassificacaodoPersonagem = leitordados.nextLine();
        Perosnagemescrito = leitordados.nextLine();
        Mo0 = leitordados.nextLine();
        leitordados.close();
    }catch(FileNotFoundException e)
    {
        System.out.println("ERROOOOOOOOOOOOOOOOOOOOO");
        e.printStackTrace();
    }
    return personagens;
 }
}
