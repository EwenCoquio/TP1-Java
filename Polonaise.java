public class Polonaise {
    public static void main(String[] argv) {
        PileEnt eval = new PileEntTab(15);
        if (argv[0].equals("plus") || argv[0].equals("moins") || argv[0].equals("mul"))
            System.out.println("operation impossible");
        else {
            for (int i = 0; i < argv.length; i++) {
                if (argv[i].equals("plus") || argv[i].equals("moins") || argv[i].equals("mul")) {
                    int tmp1 = eval.sommet();
                    eval.depile();
                    int tmp2 = eval.sommet();
                    eval.depile();
                    if (argv[i].equals("plus")) {
                        int result = tmp1 + tmp2;
                        eval.empile(result);
                    } else if (argv[i].equals("moins")) {
                        int result = tmp2 - tmp1;
                        eval.empile(result);
                    } else if (argv[i].equals("mul")) {
                        int result = tmp1 * tmp2;
                        eval.empile(result);
                    }
                }
                else
                    eval.empile(Integer.parseInt(argv[i]));
            }
            eval.dump();
        }
    }
}
