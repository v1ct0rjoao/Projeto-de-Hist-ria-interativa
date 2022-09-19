public class Personagem {
    private String name;
    private int medo;

    public Personagem(String nomedopersonagem, int medodopersonagem) {

        this.name = nomedopersonagem;
        this.medo = 50;

        // this.quem eu quero atribuir = é quem receber
    }

    void modificadordecoragem(int coragem) {

        if (coragem < 50) {
            System.out.println("O medo tomou conta " + this.name + " e então perde " + coragem + " de coragem");
        }

        this.medo = medo + coragem;

        if (this.medo > 50) {
            this.medo = 50;
        } else if (this.medo < 0) {
            this.medo = 0;

            System.out.println(this.name + " entrou em pânico e o terror tomou de conta do corpo dele");
        }

    }
}
