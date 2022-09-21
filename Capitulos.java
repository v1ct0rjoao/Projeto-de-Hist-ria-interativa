import java.util.Scanner;

public class Capitulos {
    String nome;
    String texto;
    Personagem personagem;
    int modificadordecoragem;
    String escolha1; // lembra de ajeitar pra string, boolean ta dando treta no metodo escolher
    String escolha2;
    Scanner leitor; // ai me quebrou

    Capitulos(String nome, String texto, Personagem personagem, int modificadordecoragem, String escolha1,
            String escolha2, Scanner leitor) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.modificadordecoragem = modificadordecoragem;
        this.leitor = leitor;
    }

    // ESSE DEU DE PRIMERIA
    void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println();
        this.personagem.modificadordecoragem(this.modificadordecoragem);
        System.out.println();
        System.out.println(this.escolha1);
        System.out.println(this.escolha2);
        System.out.println();
    }

    int escolher() {

        int erro = -1;

        if (escolha1 != null && escolha2 != null) {
            // MMMMDSSSSS VELHO COMO A JEITA ESTA MERDA

            String resposta = leitor.nextLine();

            if (resposta.equals(escolha1)) {
                erro = 1;
            } else if (resposta.equals(escolha2)) {
                erro = 2;
            }

        }

        return erro;

    }
}