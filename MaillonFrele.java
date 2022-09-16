public class MaillonFrele {
    int val;
    MaillonFrele prec;

    MaillonFrele(int valeur){
        this.val = valeur;
        this.prec = null;
    }

    public int getVal(){
        return this.val;
    }
    public MaillonFrele getPrec(){
        return this.prec;
    }

}
