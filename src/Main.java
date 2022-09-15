
public class Main {
    public static void main(String[] argv) {
        System.out.println("Hello world!");
        PileEntTab test = new PileEntTab(100);
        for (int i = 0; i < argv.length; i++) {
            if (argv[i].equals("e")) {
                i++;
                test.empile(Integer.parseInt(argv[i]));
            }
            else if (argv[i].equals("d")) {
                test.depile();
            }
            else if (argv[i].equals("dp")) {
                test.dump();
            }
            else
                System.out.println("commande incorrecte " + argv[i]);
        }
    }
}
