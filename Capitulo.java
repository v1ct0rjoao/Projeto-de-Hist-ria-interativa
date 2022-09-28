import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Capitulo {
    public String nome;
    public String texto;
    private Personagem personagem;
    public int modificadordecoragem;
    public ArrayList<Escolha> escolhas; // lembra de ajeitar pra string, boolean ta dando treta no metodo escolher
    public Scanner leitor; // ai me quebrou

    // podia ter um arraylist de netrada caso eu fosse fazer com mais opções
    public Capitulo(String nome, String texto, Personagem personagem,
            int modificadordecoragem, Scanner leitor) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.modificadordecoragem = modificadordecoragem;
        this.leitor = leitor;
        this.escolhas = new ArrayList<Escolha>();
    }

    // ESSE DEU DE PRIMERIA
    public void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println();

        // como estava aparecendo sempre a barra de modifição, fiz esse if pra nao
        // poluit o texto
        if (this.modificadordecoragem != 0) {
            this.personagem.modificadordecoragem(this.modificadordecoragem);
        }

        if(escolhas.size() > 0)
        {

            for (Escolha escolha : escolhas) 
            {
                System.out.println(escolha.texto);
            }
            int Esc = escolher();
            this.escolhas.get(Esc).proximo.mostrar();
        } 
    
    }
    public int escolher() {

        int erro = -1;
        if (escolhas != null) {
            // MMMMDSSSSS VELHO COMO A JEITA ESTA MERDA
            while (erro == -1) {

                System.out.println("\n\nResposta: ");
                String resposta = leitor.nextLine();

                for (int i = 0; i < escolhas.size(); i++) {
                    if (resposta.equals(escolhas.get(i).texto)) {
                        erro = i;
                    }

                }
            }
        }
        return erro;
    }
}
