import java.util.Scanner;

public class Capitulos {
    private String nome;
    private String texto;
    private Personagem personagem;
    public int modificadordecoragem;
    private String[] escolha; // lembra de ajeitar pra string, boolean ta dando treta no metodo escolher
    public Scanner leitor; // ai me quebrou
    

    public Capitulos(String nome, String texto, Personagem personagem, int modificadordecoragem, String[] escolha, Scanner leitor) 
    {
        this.nome = nome;
        this.texto = texto;
        this.escolha = escolha;
        this.personagem = personagem;
        this.modificadordecoragem = modificadordecoragem;
        this.leitor = leitor;
    }

    // ESSE DEU DE PRIMERIA
    public void mostrar() 
    {
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println();

        if (this.modificadordecoragem != 0)
        {
        this.personagem.modificadordecoragem(this.modificadordecoragem);
        }

    
        if(this.escolha != null)
        {

            for (String escolha : escolha) 
            {
                System.out.println();
                System.out.println(escolha);
           
            }   
        }
    }

    public int escolher() 
{
        int erro = -1;
        if (escolha != null) 
    {
 // MMMMDSSSSS VELHO COMO A JEITA ESTA MERDA
        String resposta = leitor.nextLine();
        while(erro == -1)
        {   
            for (String escolha : escolha) 
            {
                int incrementador = 0;
                if (resposta.equals(escolha)) 
                {
                    erro = incrementador;
                }
                incrementador++;
            }
        }
    }
        return erro;
 }
}