class PileEntMaillon extends MaillonFrele implements PileEnt {
    MaillonFrele top;

    PileEntMaillon(int valeur) {
        super(valeur);
        this.top = new MaillonFrele(valeur);
    }

    @Override
    public void empile(int elmt) {
        MaillonFrele maillon = new MaillonFrele(elmt);
        maillon.prec = this.top;
        this.top = maillon;
    }

    @Override
    public void depile() {
        if (this.top != null) {
            MaillonFrele tmp = this.top;
            this.top = tmp.getPrec();
        }
    }

    @Override
    public int sommet() {
        return this.top.getVal();
    }


    @Override
    public boolean estVide() {
        return this.top == null;
    }

    @Override
    public void dump() {
        MaillonFrele tmp = this.top;
        while (tmp != null) {
            System.out.print("[" + tmp.getVal() + "] -> ");
            tmp = tmp.getPrec();
        }
        System.out.println("null");
    }
}
