package hu.nyirszikszi.rendszertan;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Gerincesek {
    private final String NEV; //latin
    private double suly;
    private String szin;

    private int labakSzama;
    private final Queue<String> GYOMOR = new LinkedList<>();

    public Gerincesek(String NEV, double suly, String szin, int labakSzama) {
        this.NEV = NEV;
        this.suly = suly;
        this.szin = szin;
        this.labakSzama = labakSzama;
    }

    public String getNEV() {
        return NEV;
    }

    public double getSuly() {
        return suly;
    }

    protected void setSuly(double suly) {
        this.suly += suly;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public int getLabakSzama() {
        return labakSzama;
    }

    public void setLabakSzama(int labakSzama) {
        this.labakSzama = labakSzama;
    }

    public abstract void taplalkozik(String taplalek, int kaloriamennyiseg);

    public abstract void urit(int suly);

    protected void gyomorbaKerul(String taplalek) {
        GYOMOR.add(taplalek);
    }

    protected String gyomorbolKikerul() {
        return GYOMOR.poll();
    }

    public abstract void hangotKiad();

    public abstract Gerincesek szaporodik();

}
