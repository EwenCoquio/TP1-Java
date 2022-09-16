class PileEntTab implements PileEnt {
    int[] tab;
    int top;

    PileEntTab(int max) {
        this.top = -1;
        this.tab = new int[max];
    }

    @Override
    public void empile(int elmt) {
        if (this.top < this.tab.length - 1) {
            this.top++;
            this.tab[top] = elmt;
        }
    }

    @Override
    public void depile() {
        if (!estVide()) {
            this.tab[top] = 0;
            this.top--;
        }
    }

    @Override
    public int sommet() {
        if (!estVide()) {
            return this.tab[top];
        }
        return 0;
    }

    @Override
    public boolean estVide() {
        return this.top == -1;
    }


    @Override
    public void dump() {
        System.out.println("****");
        for (int i = top; i > -1; i--) {
            System.out.print("|");
            System.out.print(tab[i]);
            System.out.print("|\n");
        }
    }

}
