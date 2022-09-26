import java.util.Scanner;

public class Capitulos {
    public String nome;
    public String texto;
    private Personagem personagem;
    public int modificadordecoragem;
    public String[] escolha; // lembra de ajeitar pra string, boolean ta dando treta no metodo escolher
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
        while(erro == -1)
        {   
            
            System.out.println("\n\nResposta: ");
            String resposta = leitor.nextLine();
          
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
        
    
