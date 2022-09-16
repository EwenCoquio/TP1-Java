
public class Main {

    static PileEnt test;

    public static void main(String[] argv) {
        System.out.println("Hello world!");

        if (argv[0] == "maillon") {
            test = new PileEntMaillon(1);
        } else if (argv[0] == "tableau") {
            test = new PileEntTab(5);
        }

        for (int i = 0; i < argv.length; i++) {
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
