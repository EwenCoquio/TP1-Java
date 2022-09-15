public class PileEntMaillon extends MaillonFrele {
    MaillonFrele top;

    PileEntMaillon(int valeur) {
        super(valeur);
        this.top = new MaillonFrele(valeur);
    }

    PileEntMaillon(MaillonFrele top, int valeur) {
        super(valeur);
        this.top = top;
    }

    public void empile(int elmt) {
        MaillonFrele maillon = new MaillonFrele(elmt);
        maillon.prec = this.top;
        this.top = maillon;
    }

    public void depile() {
      if(this.top != null){
            MaillonFrele tmp = this.top;
            this.top = tmp.getPrec();
        }
    }

    public int sommet() {
        return this.top.getVal();
    }

    public boolean estVide() {
        return true;
    }

    public void dump() {
        MaillonFrele tmp = this.top;
        while (tmp != null) {
            System.out.print("[" + String.valueOf(tmp.getVal()) + '] -> ');
            tmp = tmp.getPrec();
        }
        System.out.println("null");
    }
}
