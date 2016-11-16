package UFABCTextRPG;

import java.util.*;

public class LocationDemo {

    String command;
    static Location currentLocation;
    static Scanner teclado = new Scanner(System.in);
    static Creature mainChar;
    static Location DCE, FINAL, C3_1;
    static String name;
    static int nMonsters = 6;

    public static void main(String args[]) {
        createLocations();
        createChar();
        System.out.println("6 meses depois.....\n"
                + "\n"
                + "Você está no fretado a caminha do que muitos chamam a melhor das federais, assim que você é deixado na UFABC o piso vermelho brilha e uma entidade aparece...\n"
                + "Isidro , o Magnífico: \n"
                + "Olá ingressante, muitos falam que esta universidade é um ambiente hostil, por este motivo, estou aqui para ajudá-lo a completar o BC&T ou desistir e ir corendo para São Berlonge fazer o BC&T mais fácil a.k.a. BC&H.\n"
                + "Para completar as matérias você deve derrotar os professores e por fim a PROGRAD.\n"
                + "Boa sorte em sua jornada!!!\n"
                + "\n"
                + "Isidro te entrega sabedoria.\n"
                + "\n"
                + "Você adquiriu sabedoria!!!\n");
        System.out.println("UUUUUUUU     UUUUUUUU     FFFFFFFFFFFFFFFFFFFFFF               AAA                    BBBBBBBBBBBBBBBBB                CCCCCCCCCCCCC\n"
                + "U::::::U     U::::::U     F::::::::::::::::::::F              A:::A                   B::::::::::::::::B            CCC::::::::::::C\n"
                + "U::::::U     U::::::U     F::::::::::::::::::::F             A:::::A                  B::::::BBBBBB:::::B         CC:::::::::::::::C\n"
                + "UU:::::U     U:::::UU     FF::::::FFFFFFFFF::::F            A:::::::A                 BB:::::B     B:::::B       C:::::CCCCCCCC::::C\n"
                + " U:::::U     U:::::U        F:::::F       FFFFFF           A:::::::::A                  B::::B     B:::::B      C:::::C       CCCCCC\n"
                + " U:::::D     D:::::U        F:::::F                       A:::::A:::::A                 B::::B     B:::::B     C:::::C              \n"
                + " U:::::D     D:::::U        F::::::FFFFFFFFFF            A:::::A A:::::A                B::::BBBBBB:::::B      C:::::C              \n"
                + " U:::::D     D:::::U        F:::::::::::::::F           A:::::A   A:::::A               B:::::::::::::BB       C:::::C              \n"
                + " U:::::D     D:::::U        F:::::::::::::::F          A:::::A     A:::::A              B::::BBBBBB:::::B      C:::::C              \n"
                + " U:::::D     D:::::U        F::::::FFFFFFFFFF         A:::::AAAAAAAAA:::::A             B::::B     B:::::B     C:::::C              \n"
                + " U:::::D     D:::::U        F:::::F                  A:::::::::::::::::::::A            B::::B     B:::::B     C:::::C              \n"
                + " U::::::U   U::::::U        F:::::F                 A:::::AAAAAAAAAAAAA:::::A           B::::B     B:::::B      C:::::C       CCCCCC\n"
                + " U:::::::UUU:::::::U      FF:::::::FF              A:::::A             A:::::A        BB:::::BBBBBB::::::B       C:::::CCCCCCCC::::C\n"
                + "  UU:::::::::::::UU       F::::::::FF             A:::::A               A:::::A       B:::::::::::::::::B         CC:::::::::::::::C\n"
                + "    UU:::::::::UU         F::::::::FF            A:::::A                 A:::::A      B::::::::::::::::B            CCC::::::::::::C\n"
                + "      UUUUUUUUU           FFFFFFFFFFF           AAAAAAA                   AAAAAAA     BBBBBBBBBBBBBBBBB                CCCCCCCCCCCCC\n\n");
        showLocation();
        checkMonster();
        while (command()) {

        }
    }

    public static void createLocations() {
        //Locações
        //Primeiro Andar
        //Corredores
        Location C1 = new Location("Piso Vermelho", "Você se encontra no piso vermelho, à sua frente um o corredor largo de chão vermelho, a oeste , assim como a leste de sua posição, há salas.");
        Location C2 = new Location("Piso Vermelho", "Você vê a oeste, assim como a leste, elevadores que dão para o primeiro andar, onde há mais matérias para serem cumpridas. A frente, corridor continua.");
        Location C3 = new Location("Piso Vermelho", "Você vê, em ambos os lados, salas, e á sua frente se encontra o DCE.");
        //Salas
        Location SD1 = new Location("sd1", "Você está na sala de aula. A única saída é ao oeste");
        Location SD2 = new Location("sd2", "Você está na sala de aula. A única saída é ao oeste");
        Location SE1 = new Location("se1", "Você está na sala de aula. A única saída é ao leste");
        Location SE2 = new Location("se2", "Você está na sala de aula. A única saída é ao leste");
        //DCE
        DCE = new Location("DCE", "Você se sente em casa, e como seus problemas tivessem terminado. Sua vida é restaurada ao máximo. A única saída é ao Sul da sua posição.");
        //Segundo Andar
        //Corredores  
        Location C2_1 = new Location("Primeiro andar", "Você vê a oeste, assim como a leste, elevadores que te levam ao piso térreo. A frente, corridor continua.");
        C3_1 = new Location("Primeiro andar", "Você vê a oeste, assim como a leste, salas de aula. Ao norte, há um sala trancada, com os dizeres: 'PROGRAD'.");
        //Salas    
        Location SD2_1 = new Location("sd2_1", "Você está na sala de aula. A única saída é ao oeste");
        Location SE2_1 = new Location("se2_1", "Você está na sala de aula. A única saída é ao leste");
        //Final boss
        FINAL = new Location("Final Boss", "Você está na sala da temivel PROGRAD");
        //Saídas
        //andar 1
        //Corredor um - andar 1
        C1.addExit(new Exit(Exit.EAST, SD1));
        C1.addExit(new Exit(Exit.WEST, SE1));
        C1.addExit(new Exit(Exit.NORTH, C2));
        //Corredor dois - andar 1
        C2.addExit(new Exit(Exit.EAST, C2_1));
        C2.addExit(new Exit(Exit.WEST, C2_1));
        C2.addExit(new Exit(Exit.NORTH, C3));
        C2.addExit(new Exit(Exit.SOUTH, C1));
        //Corredor três - andar 1
        C3.addExit(new Exit(Exit.EAST, SD2));
        C3.addExit(new Exit(Exit.WEST, SE2));
        C3.addExit(new Exit(Exit.NORTH, DCE));
        C3.addExit(new Exit(Exit.SOUTH, C2));
        //DCE
        DCE.addExit(new Exit(Exit.SOUTH, C3));
        //sala esquerda 1 - andar 1
        SE1.addExit(new Exit(Exit.EAST, C1));
        //sala direita 1 - andar 1
        SD1.addExit(new Exit(Exit.WEST, C1));
        //sala esquerda 2 - andar 1
        SE2.addExit(new Exit(Exit.EAST, C3));
        //sala direita 2 - andar 1
        SD2.addExit(new Exit(Exit.WEST, C3));

        //andar 2
        //corredor 1 - andar 2
        //Corredor dois - andar 2
        C2_1.addExit(new Exit(Exit.EAST, C2));
        C2_1.addExit(new Exit(Exit.WEST, C2));
        C2_1.addExit(new Exit(Exit.NORTH, C3_1));

        //Corredor três - andar 2
        C3_1.addExit(new Exit(Exit.EAST, SD2_1));
        C3_1.addExit(new Exit(Exit.WEST, SE2_1));
        C3_1.addExit(new Exit(Exit.SOUTH, C2_1));

        //salas
        SD2_1.addExit(new Exit(Exit.WEST, C3_1));
        SE2_1.addExit(new Exit(Exit.EAST, C3_1));
        //Monstros
        //andar 1
        SE1.addCreature(new Creature("Professora de BECM", "Ao som de Bob Marley você entra na sala e logo vê uma roda de pessoas sentadas no chão formando um círculo com roupas rippies e óculos redondos, para você todos parecem John Lennon.\n"
                + "Uma professora com cabelos longos, óculos redondos, roupas floridas e chinelos de couro.\n"
                + "Olá, você deve ser ingressante, bem vindo a aula de bases epistemológicas da ciência moderna, e eu serei a sua professora.\n"
                + "É hora do duelo!!!", 7, 4, 2));
        SD1.addCreature(new Creature("Professor de BM", "Ao entrar na sala você ouve uma voz com mistura de português e casteliano:\n"
                + "Hola, yo serei tu professor de Bases Matemáticas y no é verdad que tu passará nesta matéria.\n"
                + "És hora del duelo!!!", 7, 4, 2));
        SE2.addCreature(new Creature("Professor de EM", "Ao entrar na sala você avista uma homem de peito estufado e com nariz empinado: \n"
                + "Bem vindo á aula de Estrutura da Matéria, é importante que você explore a matéria ao MÁXIMO, para absorver o MÁXIMO e passar com o MÁXIMO de aproveitamento.\n"
                + "É hora do MÁXIMO!!!", 20, 8, 4));
        SD2.addCreature(new Creature("Professor de GA", "O professor falando uma lígua a qual você não entende te apresenta a matéria:\n"
                + "A fniafmja uianfiujanm rnoanfoa Aula, bndifnhuia hsuoafnoja oianfao Vetor Vrê, geuysha bdhajfoaokaf klamkl Geometry Analitica.\n"
                + "É hora do hsjakfnkla!!!", 20, 8, 4));

        //andar 2
        SE2_1.addCreature(new Creature("Rocky", "Ao entrar na sala você vê uma pessoa com o rosto um pouco torto e suado como se acabasse de sair de uma luta, usando apenas um shorts e luvas de boxe, enrolado numa bandeira dos Estado Unidos, por algum motivo te lembrava do Rocky.\n"
                + "Bem vindo à aula de  Ciência, Tecnologia e Sociedade, uma pena que você não passará.\n"
                + "É hora do Duelo!!!", 30, 10, 7));
        SD2_1.addCreature(new Creature("Eterno Viking", "Assim que você passa pela porta você vê um homem com um machado e uma capacete com chifres e um shorts de pele de animal:\n"
                + "Olá, me chamo André, mas me conhecem como Eterno Viking, para passar você deverá sabe toda a matéria de Tranformações dos Seres Vivos e Ambiente", 30, 10, 7));
        FINAL.addCreature(new Creature("PROGRAD", "Isidro aparece derrepente e te diz calmamente:\n"
                + "Agora chegou o momento final, onde você deve enfrentar a PROGRAD para adquirir seu diploma. Se prepare pois essa será a sua última batalha.\n"
                + "É hora do Diploma!!!", 40, 15, 9));
        currentLocation = C1;
    }

    public static void checkMonster() {
        if (currentLocation.getCreatures().size() > 0) {
            Battle battle = new Battle(mainChar, currentLocation.getCreatureAt(0));
            boolean b = battle.run();
            //verifica quem ganhou a batalha
            if (b) {
                //remove criatura da sala
                currentLocation.removeCreature(currentLocation.getCreatureAt(0));
                //verifica se está no boss final
                if (currentLocation == FINAL) {
                    System.out.println("Voce derrotou a PROGRAD. Isidro te entrega o diploma:\n"
                            + "Parabéns, você completou o BC&T, mas a sua jornada apenas começou. Há muitos caminhos pela frente, mas você pode pegar esse atalho que muitos chamam de BC&H HAHAHAHA.");
                    System.out.println("\n\n\nTTTTTTTTTTTTTTTTTTTTTTTHHHHHHHHH     HHHHHHHHHEEEEEEEEEEEEEEEEEEEEEE     EEEEEEEEEEEEEEEEEEEEEENNNNNNNN        NNNNNNNNDDDDDDDDDDDDD        \n"
                            + "T:::::::::::::::::::::TH:::::::H     H:::::::HE::::::::::::::::::::E     E::::::::::::::::::::EN:::::::N       N::::::ND::::::::::::DDD     \n"
                            + "T:::::::::::::::::::::TH:::::::H     H:::::::HE::::::::::::::::::::E     E::::::::::::::::::::EN::::::::N      N::::::ND:::::::::::::::DD   \n"
                            + "T:::::TT:::::::TT:::::THH::::::H     H::::::HHEE::::::EEEEEEEEE::::E     EE::::::EEEEEEEEE::::EN:::::::::N     N::::::NDDD:::::DDDDD:::::D  \n"
                            + "TTTTTT  T:::::T  TTTTTT  H:::::H     H:::::H    E:::::E       EEEEEE       E:::::E       EEEEEEN::::::::::N    N::::::N  D:::::D    D:::::D \n"
                            + "        T:::::T          H:::::H     H:::::H    E:::::E                    E:::::E             N:::::::::::N   N::::::N  D:::::D     D:::::D\n"
                            + "        T:::::T          H::::::HHHHH::::::H    E::::::EEEEEEEEEE          E::::::EEEEEEEEEE   N:::::::N::::N  N::::::N  D:::::D     D:::::D\n"
                            + "        T:::::T          H:::::::::::::::::H    E:::::::::::::::E          E:::::::::::::::E   N::::::N N::::N N::::::N  D:::::D     D:::::D\n"
                            + "        T:::::T          H:::::::::::::::::H    E:::::::::::::::E          E:::::::::::::::E   N::::::N  N::::N:::::::N  D:::::D     D:::::D\n"
                            + "        T:::::T          H::::::HHHHH::::::H    E::::::EEEEEEEEEE          E::::::EEEEEEEEEE   N::::::N   N:::::::::::N  D:::::D     D:::::D\n"
                            + "        T:::::T          H:::::H     H:::::H    E:::::E                    E:::::E             N::::::N    N::::::::::N  D:::::D     D:::::D\n"
                            + "        T:::::T          H:::::H     H:::::H    E:::::E       EEEEEE       E:::::E       EEEEEEN::::::N     N:::::::::N  D:::::D    D:::::D \n"
                            + "      TT:::::::TT      HH::::::H     H::::::HHEE::::::EEEEEEEE:::::E     EE::::::EEEEEEEE:::::EN::::::N      N::::::::NDDD:::::DDDDD:::::D  \n"
                            + "      T:::::::::T      H:::::::H     H:::::::HE::::::::::::::::::::E     E::::::::::::::::::::EN::::::N       N:::::::ND:::::::::::::::DD   \n"
                            + "      T:::::::::T      H:::::::H     H:::::::HE::::::::::::::::::::E     E::::::::::::::::::::EN::::::N        N::::::ND::::::::::::DDD     \n"
                            + "      TTTTTTTTTTT      HHHHHHHHH     HHHHHHHHHEEEEEEEEEEEEEEEEEEEEEE     EEEEEEEEEEEEEEEEEEEEEENNNNNNNN         NNNNNNNDDDDDDDDDDDDD        ");
                    System.out.println("\n\n-----------Créditos-------------------------------------------------------------------------------\n"
                                     + "-----------Programação: Tiago Suzukayama, Matheus Miranda Teles-----------------------------------\n"
                                     + "-----------História: Matheus Miranda Teles--------------------------------------------------------");
                    System.exit(0);
                }
                //upa personagem principal
                mainChar.setMaxHealth(mainChar.getMaxHealth() + 5);
                mainChar.setStr(mainChar.getStr() + 2);
                mainChar.setDef(mainChar.getDef() + 1);
                nMonsters--;
                //vê se derrotou todos sub-bosses
                if (nMonsters == 0) {
                    C3_1.addExit(new Exit(Exit.NORTH, FINAL));
                    C3_1.setDescription("Você está no final do corredor. Tanto à leste como à oeste, existem salas. você vê uma placa escrita 'PROGRAD' em cima de uma porta a sua frente. A porta está aberta.");
                    System.out.println("Você sente um leve tremor que dura alguns segundos.");
                }
                //se morreu, vai pro dce
            } else {
                currentLocation = DCE;

            }
            showLocation();
        }
    }

    public static void showLocation() {
        if (currentLocation == DCE) {
            mainChar.setHealth(mainChar.getMaxHealth());
            //System.out.println("foi+dce" + mainChar.getHealth());
        }
        System.out.println(currentLocation.getDescription());
    }

    public static boolean command() {
        String cmd = teclado.next();
        if (cmd.length() == 0) {
            return true;
        }
        cmd = cmd.toUpperCase();
        if ("SIMPLINHO".equals(cmd)) {
            System.out.println("Você desiste do BC&T e resolve estudar filosofia e festejar a ocupação no simplinho");
            return false;
        }
        //laço com as saídas do local atual
        for (Enumeration e = currentLocation.getExits().elements(); e.hasMoreElements();) {
            Exit an_exit = (Exit) e.nextElement();

            if ((an_exit.getDirectionName().compareTo(cmd) == 0)
                    || (an_exit.getShortDirectionName().compareTo(cmd) == 0)) {

                currentLocation = an_exit.getLeadsTo();
                showLocation();
                checkMonster();
                return true;
            }
        }
        System.out.println("invalido");
        return true;
    }

    public static void createChar() {
        System.out.println("No longínquo ano de 20XX.......\n"
                + "Parabéns, você acaba de ingressar na UFABC pela 12ª chamada, e está pronto para completar o BC&T ou morrer tentado.\n"
                + "Digite seu nome para começar:");
        name = teclado.next();
        mainChar = new Creature(name, "desc", 10, 5, 3);
    }
}
