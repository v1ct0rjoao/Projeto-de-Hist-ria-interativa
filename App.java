import java.util.HashMap;
import java.util.Scanner;

import javax.crypto.spec.ChaCha20ParameterSpec;

public class App {


        public static void main(String[] args) {
                Scanner leitor = new Scanner(System.in);
                

    
//     String[] EscolhaCap01 = new String[]{"avisa que nao deviam ir","volta pra casa"};
//     String[] EscolhaCap02 = new String[]{"tenta ler os papeis", "Abre a porta da casinha"};
//     String[] EscolhaCap04 = new String[]{"joga com eles", "decidi que é loucura e vai dormir"};

// cap1.escolha.add(new Escolha( "avisa que nao deviam ir", Cap2))

Personagem rafa = new Personagem("Rafa", 50);
Personagem marcos = new Personagem("Marcos", 50);

Servidordedados escrito = new Servidordedados();
 HashMap<String, Personagem> personagens = escrito.SelectPersonagem("rsc/teste.txt");

 Personagem Joao = personagens.get("Joao");
 Personagem Rafa = personagens.get("Rafa");
 Personagem Marcos = personagens.get("Marcos");

Capitulo Cap1 = new Capitulo(
"--FINALMENTE FERIAS--\n\n",
"Seus país tiveram que fazer uma viagem a trabalho e você teve que\n" +
"ficar uns dias na casa dos seus avôs. Por coêncidencia, seus tios também\n"+
"tiveram que viajar e deixaram seus primos na casa dos seus avôs. Infelizmente\n"+
"a casa ficava no meio do nada, não tem internet, sem televisão e nem video game\n"+
"você e seus primos tentão passar os dias, arrumando brincadeiras, porém não são acostumados\n"+
"acabam ficando entediados. No entanto, seu primo Marcos decidi que deviam, explorar o sitio, quando\n"+
"os avós forem dormir, o que não era tarde, são velhinhos do campo, acordam cedo e dormem cedo\n"+
"quando os avôs foram dormir, eles sairam de fininho, com os passos silenciosos, você é o mais novo\n"+
"e mais medroso, suas outras duas primas julia e rafa ficavam rindo de você, fazendo até barulho\n"+
"para te assustar. Marcos, fala que deviam ir na casa onde o vovô guardava as ferramentas, pra saber\n"+
"o que tinha la dentro da casinha, o problema é que alguns dias atrás, seu avô deu ordem que não\n"+
"chegasse perto do local\n\n",
Joao, 0, leitor);          
                          


 Capitulo Cap2 = new Capitulo(
"--BRINCADEIRA DE CRIANÇA--\n\n",
"Você tenta argumentar que não deviam estar ali, marcos começa te chamar de frangote\n"+
"e medroso, as suas primas começam a gargalhar, você fica com vergonha e ao invés de sair\n"+
"você vai na frente de todos dizendo que não tem medo.Chegando, na entrada da casa, você ver,\n"+
"que a posta de madeira velhinha, meio quebradiça, nela tem varios papéis, tipo avisos\n"+
"com eles apagados, porém um pouco legivel...\n",
rafa, -3, leitor);

Capitulo Cap3 = new Capitulo(
"--ELES SABEM DE ALGO--\n\n",
"Você tenta ler os papéis apregados na porta, derepente você\n" + // resposta a do cap 2
"senti um empurrão, marcos te empurrou pra dentro com toda a força\n" +
 "fazendo você cair no chão, como a casa é pequena, você bate nas ferramenta\n"+
"e a maioria cai, fazendo um barulhão, todos ficam com medo dos avôs acordarem\n"+
"suas primas te ajudam a levantar, chamando marcos de idiota...\n\n" +
"você senti uma dor muito forte na cabeça e antes que levantasse por completo\n"+
"marcos te empurra e você cai novamente você senti um excesso de furia.\n"+
"por um segundo você começa a ouvir varias vozes\n" +
"dizendo: 'MATAA ELEEE' 'ELE MERECE MORRER' 'ELE TE FEZ PASSAR VERGONHA'\n"+
"você começa a sentir ira como se estivesse possuido por algo, mesmo sendo fraco\n"+
"você consegue levantar uma enxada que tinha do seu lado e com muita força a bate\n"+
"em marcos, cravando a enxada na cabeça, marcos cai de joelho no chão e o liquido\n"+
"do cerebro escorre e você volta ao normal com os gritos das suas primas seus avôs\n"+
"ouvem e vão correndo ver o que aconteceu, quando chegam eles veem você segurando o cabo da enxada\n"+
"o seu avô olha se marcos ainda ta vivo e sua avó vai acudir suas primas, eles olham pra você\n"+
"como se soubessem de algo...",
rafa, -50, leitor);

Capitulo Cap4 = new Capitulo(
"--CORAGEM --\n\n",
"Quando você abre a porta todos ficam felizes com sua coragem e entram vasculhando\n" +
"a casa, acham ferramentas de trabalho, ração de animais, sua prima rafa acha um jogo\n"+
"de tabuleiro em cima da prateleira, ela pega e ver que o nome é Ouija, na descrição diz que\n"+
"é um tabuleiro que fala com espiritos ela mostra pra todos, seus primos decidem jogar para\n"+
"passar o tempo...\n\n",
marcos, -10, leitor);

Capitulo Cap5 = new Capitulo(
"--ARREPENDIMENTO--\n\n",
"vocês começam a jogar e perguntam se tem alguma presença no local\n" +
"o ponteiro vai até a palavra SIM e logo em seguida vai em oito\n"+
"vocês se olham sem entender, o espirito começa a escrever no ponteiro\n\n"  +                               
"V O C E S N U N C A V Ã O S A I R\n\n"+
"o ponteiro começa a se mexer sozinho sem parar\n"+
"e vocês sem entender começam a correr desperados, derepente todos são puxados\n"+                          
"até a mesa por uma forma, invisivel, o ponteiro sai do tabuleiro e Julia, começa a falar\n" +                                   
"coisas sinistras...\n\n" + "VOU AMAR ESFOLAR VOCÊS VIVOS\n\n" +
"os olhos de julia ficam negros e os corpos dos meninos são jogados na parede\n\n"+
"VOCÊS VÃO MORREEER!!!!!",
Joao, -50,leitor);

Capitulo Cap6 = new Capitulo(
"--O MAL SE REVELA-- \n\n",
"Você tem medo de coisas que falam de espiritos, porque acha que eles vão puxar o seu pé\n"+
"você decidi ir dormir, antes que seus avôs descubram que estavam fazendo coisa errada\n\n"+
"OUTRO DIA...\n\n" +
"antes do galo cantar, seu avô já estava acordado e antes que pudesse procurar seu primos, todos começam a gritar\n"+
"você vai correndo pra ver o que tava acontecendo, chegando, seus avôs, estavam em choque, seus primos estavam pendurados\n"+
"sem a pele e pingando sangue embaixo deles estava escrito 'QUE DELICIA BRUNO', bruno é seu avó\n"+
"e o tabuleiro estava com as peças em cima da mesa, você fica sem entender nada, começou a ficar apavorado\n"+
"achando que seu avó tinha matado seu primos...",
Joao, -50,leitor);

Cap1.escolhas.add(new Escolha("avisa que nao deviam ir", Cap2));
Cap1.escolhas.add(new Escolha("volta pra casa", Cap6));

Cap2.escolhas.add(new Escolha("tenta ler os papeis", Cap3));
Cap2.escolhas.add(new Escolha("Abre a porta da casinha", Cap4));

Cap4.escolhas.add(new Escolha("joga com eles", Cap5));
Cap4.escolhas.add(new Escolha("decidi que é loucura e vai dormir", Cap6));


System.out.println("Capítulo 1");
System.out.println();
//odeio arvores
Capitulo cabeca = Cap1;
cabeca.mostrar();

 
 }
}