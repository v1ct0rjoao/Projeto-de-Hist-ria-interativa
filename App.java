import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {

    public static void main(String[] args) {

        Personagem julia = new Personagem("Julia", 50);
        Personagem rafa = new Personagem("Rafa", 50);
        Personagem marcos = new Personagem("Marcos", 50);
        Personagem Joao = new Personagem("João ", 50);
        Scanner leitor = new Scanner(System.in);
        String resposta, resposta1, resposta2, resposta3, resposta4, resposta5;
        String escolha1 = "a";
        String escolha2 = "b";
        String escolha3 = "c";

        String Capitulo1 = "Seus país tiveram que fazer uma viagem a trabalho e você teve que\n" +
                "ficar uns dias na casa dos seus avôs. Por coêncidencia, seus tios também\n" +
                "tiveram que viajar e deixaram seus primos na casa dos seus avôs. Infelizmente\n" +
                "a casa ficava no meio do nada, não tem internet, sem televisão e nem video game\n" +
                "você e seus primos tentão passar os dias, arrumando brincadeiras, porém não são acostumados\n" +
                "acabam ficando entediados. No entanto, seu primo Marcos decidi que deviam, explorar o sitio, quando\n"
                +
                "os avós forem dormir, o que não era tarde, são velhinhos do campo, acordam cedo e dormem cedo\n" +
                "quando os avôs foram dormir, eles sairam de fininho, com os passos silenciosos, você é o mais novo\n" +
                "e mais medroso, suas outras duas primas julia e rafa ficavam rindo de você, fazendo até barulho\n" +
                "para te assustar. Marcos, fala que deviam ir na casa onde o vovô guardava as ferramentas, pra saber\n"
                +
                "o que tinha la dentro da casinha, o problema é que alguns dias atrás, seu avô deu ordem que não\n" +
                "chegasse perto do local\n\n";

        String Escolha1cap1 = "voce fala para eles que nao deviam ir ate la";
        String Escolha2cap1 = "Mesmo eles rindo de você, você volta pra casa e não desobedeci seu avô";

        String Capitulo2 = "          Brincadeira de Criança                     \n\n" + // resposta a de cap 1

                "Você tenta argumentar que não deviam estar ali, marcos começa te chamar de frangote\n" +
                "e medroso, as suas primas começam a gargalhar, você fica com vergonha e ao invés de sair\n" +
                "você vai na frente de todos dizendo que não tem medo.Chegando, na entrada da casa, você ver,\n" +
                "que a posta de madeira velhinha, meio quebradiça, nela tem varios papéis, tipo avisos\n" +
                "com eles apagados, porém um pouco legivel...\n";

        String Escolha1cap2 = "voce tenta ler os papeis";
        String Escolha2cap2 = "Abre a porta da casinha";

        String Cap3 = "Você tenta ler os papéis apregados na porta, derepente você\n" + // resposta a do cap 2
                "senti um empurrão, marcos te empurrou pra dentro com toda a força\n" +
                "fazendo você cair no chão, como a casa é pequena, você bate nas ferramenta\n" +
                "e a maioria cai, fazendo um barulhão, todos ficam com medo dos avôs acordarem\n" +
                "suas primas te ajudam a levantar, chamando marcos de idiota...\n\n" +
                "você senti uma dor muito forte na cabeça e antes que levantasse por completo" +
                "marcos te empurra e você cai novamente você senti um excesso de furia.\n" +
                "por um segundo você começa a ouvir varias vozes\n" +
                "dizendo: 'MATAA ELEEE' 'ELE MERECE MORRER' 'ELE TE FEZ PASSAR VERGONHA'\n" +
                "você começa a sentir ira como se estivesse possuido por algo, mesmo sendo fraco\n" +
                "você consegue levantar uma enxada que tinha do seu lado e com muita força a bate\n" +
                "em marcos, cravando a enxada na cabeça, marcos cai de joelho no chão e o liquido\n" +
                "do cerebro escorre e você volta ao normal com os gritos das suas primas seus avôs\n" +
                "ouvem e vão correndo ver o que aconteceu, quando chegam eles veem você segurando o cabo da enxada\n" +
                "o seu avô olha se marcos ainda ta vivo e sua avó vai acudir suas primas, eles olham pra você\n" +
                "como se soubessem de algo...";

        String Cap4 = "          Coragem                     \n\n" +
                "Quando você abre a porta todos ficam felizes com sua coragem e entram vasculhando\n" + // reposta b do
                                                                                                        // CAP2
                "a casa, acham ferramentas de trabalho, ração de animais, sua prima rafa acha um jogo\n" +
                "de tabuleiro em cima da prateleira, ela pega e ver que o nome é Ouija, na descrição diz que\n" +
                "é um tabuleiro que fala com espiritos ela mostra pra todos, seus primos decidem jogar para\n" +
                "passar o tempo...\n\n";
        String Escolha1cap4 = "joga com eles";
        String Escolha2cap4 = "decidi que é loucura e vai dormir";

        String vocejoga = "vocês vão pra parte de trás da casa, onde tinha uma mesa para os quatros\n" +
                "rafa abre a caixa do tabuleiro e tira as peças de dentro, na caixa tinha\n" +
                "tabuleiro com letras gravadas e as opções sim ou não na parte de cima\n" +
                "Além disso, havia um manual de instrução, vocês decidem...\n\n";

        String EscolhaVcjoga1 = "decide ler o manual";
        String EscolhaVcjoga2 = "decide jogar sem ler";

        String manual = "REGRAS\n\n" +
                "1. Nunca jogue Ouija sozinha: Sempre joga com mais de uma pessoa\n" +
                "2. Cuidado com as extremidades do tabuleiro: não deixe nunca que os espiritos levem o ponteiro" +
                "para as extremidades do tabuleiro.\n" +
                "3. Cuidado ao virar a tábua ao contrário: Se virar você pode chamar um espirito mais poderoso\n" +
                "4. Você não deve sair sem pedir: Se não pedir estará sujeito a possessão\n" +
                "5. Cuidado com cemitérios ou lugares com mortes violentas.\n" +
                "6. se o ponteiro indicar 8, quer dizer que um espirito poderoso estar tomando posse do tabuleiro\n";

        String manualescolha1 = "decidem jogar";
        String manualescolha2 = "vocês decidem não jogar.";

        String decidirjogar = "vocês começam a jogar e perguntam se tem alguma presença no local\n" +
                "o ponteiro vai até a palavra SIM e logo em seguida vai em oito\n" +
                "vocês se olham sem entender, o espirito começa a escrever no ponteiro\n\n" +

                "V O C E S N U N C A V Ã O S A I R\n\n" +

                "o ponteiro começa a se mexer sozinho sem parar\n" +
                "e vocês sem entender começam a correr desperados, derepente todos são puxados\n" +
                "até a mesa por uma forma, invisivel, o ponteiro sai do tabuleiro e Julia, começa a falar\n" +
                "coisas sinistras...\n\n" +
                "VOU AMAR ESFOLAR VOCÊS VIVOS\n\n" +
                "os olhos de julia ficam negros e os corpos dos meninos são jogados na parede\n\n" +
                "VOCÊS VÃO MORREEER!!!!!";

        String decidennaojogar = "Vocês ficam o jogo, a cada passo até de abrir a caixa um vento forte\n" +
                "sopra e murmurios são ouvidos, galhos se mexem com mais força, quando finalmente um galho\n" +
                "cai no chão, vocês saem correndo e jogam o tabuleiro no chão e vão para os quartos morrendo de medo\n";

        String Cap5Oespiritoserevela = "                O espirito se revela\n\n" + // resposta b do cap1
                "Você tem medo de coisas que falam de espiritos, porque acha que eles vão puxar o seu pé\n" +
                "você decidi ir dormir, antes que seus avôs descubram que estavam fazendo coisa errada\n\n" +
                "OUTRO DIA\n\n" +
                "antes do galo cantar, seu avô já estava acordado e antes que pudesse procurar seu primos, todos começam a gritar\n"
                +
                "você vai correndo pra ver o que tava acontecendo, chegando, seus avôs, estavam em choque, seus primos estavam pendurados\n"
                +
                "sem a pele e pingando sangue embaixo deles estava escrito 'QUE DELICIA BRUNO', bruno é seu avó\n" +
                "e o tabuleiro estava com as peças em cima da mesa, você fica sem entender nada, começou a ficar apavorado\n"
                +
                "achando que seu avó tinha matado seu primos..."; // usado tbm para primeira resposta como escolha1cap2

        System.out.println("Capítulo 1");
        System.out.println();
        System.out.println();
        System.out.println(Capitulo1);
        System.out.println(Escolha1cap1);
        System.out.println(Escolha2cap1);

        resposta = leitor.nextLine();

        if (resposta.equals(Escolha1cap1)) {

            System.out.println(Capitulo2);

            julia.modificadordecoragem(-15);
            rafa.modificadordecoragem(-15);
            marcos.modificadordecoragem(-5);
            Joao.modificadordecoragem(-15);

            System.out.println(Escolha1cap2);
            System.out.println(Escolha2cap2);

            resposta = leitor.nextLine();

            if (resposta.equals(Escolha1cap2)) {
                System.out.println(Cap3);
                julia.modificadordecoragem(-50);
                rafa.modificadordecoragem(-50);
                Joao.modificadordecoragem(-50);
                System.out.println("Marcos foi morto por João");
            }

            if (resposta.equals(Escolha2cap2)) {
                System.out.println(Cap4);
                System.out.println(Escolha1cap4);
                System.out.println(Escolha2cap4);
                resposta = leitor.nextLine();
            }
            if (resposta.equals(Escolha1cap4)) {
                System.out.println(vocejoga);
                System.out.println(EscolhaVcjoga1);
                System.out.println(EscolhaVcjoga2);
                resposta = leitor.nextLine();
            }
            if (resposta.equals(EscolhaVcjoga1)) {
                System.out.println(manual);
                System.out.println(manualescolha1);
                System.out.println(manualescolha2);
                resposta = leitor.nextLine();
            }
            if (resposta.equals(manualescolha1)) {
                System.out.println(decidirjogar);
                System.out.println();
                marcos.modificadordecoragem(-50);
                rafa.modificadordecoragem(-50);
                Joao.modificadordecoragem(-50);
                System.out.println(("\n\nJulia se tornou uma criatura di mal"));
            }
            if (resposta.equals(EscolhaVcjoga2)) {
                System.out.println(decidirjogar);
                System.out.println();
                Joao.modificadordecoragem(-50);
                marcos.modificadordecoragem(-50);
                rafa.modificadordecoragem(-50);
                julia.modificadordecoragem(-50);

            }
            if (resposta.equals(manualescolha2)) {
                System.out.println();
                System.out.println(decidennaojogar);

            }
            if (resposta.equals(Escolha2cap4)) {
                System.out.println(Cap5Oespiritoserevela);
                System.out.println();
                Joao.modificadordecoragem(-50);
                System.out.println("\n\no unico sobrevivente foi Joao");
            }

        } else if (resposta.equals(Escolha2cap1)) {
            System.out.println(Cap5Oespiritoserevela);
            System.out.println();
            Joao.modificadordecoragem(-50);
            System.out.println("\n\no unico sobrevivente foi Joao");
        }

    }
}