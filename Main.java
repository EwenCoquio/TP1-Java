
public class Main {

    static PileEnt test;

    public static void main(String[] argv) {
        System.out.println("Hello world!");

        if (argv[0].equals("maillon") ){
            test = new PileEntMaillon();

        } else if (argv[0].equals("tableau")) {
            test = new PileEntTab(5);

        }

        //test = new PileEntMaillon();
        for (int i = 1; i < argv.length; i++) {
            if (argv[i].equals("e")) {
                i++;
                test.empile(Integer.parseInt(argv[i]));
            } else if (argv[i].equals("d")) {
                test.depile();
            } else if (argv[i].equals("dp")) {
                test.dump();
            } else
                System.out.println("commande incorrecte " + argv[i]);
        }

    }
}

