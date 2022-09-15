public class PileEntTab {
    int[] tab;
    int top;

    PileEntTab(int max) {
        this.top = -1;
        this.tab = new int[max];
    }

    public void empile(int elmt) {
        if (this.top < this.tab.length - 1) {
            this.top++;
            this.tab[top] = elmt;
        }
    }

    public void depile() {
        if (this.top > -1) {
            this.tab[top] = 0;
            this.top--;
        }
    }

    public int sommet() {
        return this.tab[top];
    }

    public boolean estVide() {
        return this.top == -1;
    }

    public void dump() {
        System.out.println("****");
        for (int i = top; i >-1; i--) {
            System.out.print("|");
            System.out.print(tab[i]);
            System.out.print("|\n");
        }
    }
}
