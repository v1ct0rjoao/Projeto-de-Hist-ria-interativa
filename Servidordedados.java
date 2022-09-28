import java.io.File;
import java.io.FileNotFoundException;
import java.io.PipedWriter;
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
        Scanner leitordados = new Scanner(DadosServidor, "UTF-8");
        //DESCOBRI OQUE TAVA ERRADO, ERA O PARENTESE  8;00 DIA 28
        System.out.println("ARQUIVO FOI CARRREGADO");
        //nao entendi como iniciliaza string

       
        
        String buscadopersonagem = "";
        String Personagemescrito = "";
        String ClassificacaodoPersonagem = "";
        int Energiaescrita = 0 ;
while(leitordados.hasNextLine())
{
        while(!buscadopersonagem.equals("PERSONAGENS DOS CAPITULOS"))
        //ideia de hash, buscar enquanto por diferente de nulo 
        {
            buscadopersonagem = leitordados.nextLine();
        }

       // 
        buscadopersonagem = leitordados.nextLine();
        ClassificacaodoPersonagem = leitordados.nextLine();
        buscadopersonagem = leitordados.nextLine();
        Personagemescrito = leitordados.nextLine();
        buscadopersonagem = leitordados.nextLine();
        Energiaescrita = Integer.parseInt(leitordados.nextLine());
        Personagem.put(Personagemescrito, new Personagem(Personagemescrito, Energiaescrita));
        
}
        leitordados.close();
       //
    }catch(FileNotFoundException e)
    {
        System.out.println("ERROOOOOOOOOOOOOOOOOOOOO");
        e.printStackTrace();
    }
    return personagens;
 }
}
