import java.util.Scanner;

public class Capitulos {
    String nome;
    String texto;
    Personagem personagem;
    int modificadordecoragem;
   String escolha1;
   String escolha2;



    Capitulos(String nome, String texto, Personagem personagem, int modificadordecoragem, String escolha1, String escolha2) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.modificadordecoragem = modificadordecoragem;
    }


    void mostrar(){
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println();     
        this.personagem.modificadordecoragem(this.modificadordecoragem); 
        System.out.println();
        System.out.println(this.escolha1);
        System.out.println(this.escolha2);
        System.out.println();
    }
}