package hu.nyirszikszi.rendszertan;

public class Lud extends Madarak {

    public Lud(double suly, String szin) {
        super("Lud", suly, szin);
    }

    @Override
    public void taplalkozik(String taplalek, int kaloriamennyiseg) {
        this.gyomorbaKerul(taplalek);
        this.setSuly(this.getSuly() + 1.0 * kaloriamennyiseg / 10);
    }

    @Override
    public void urit(int suly) {
        this.gyomorbolKikerul();
        this.setSuly(this.getSuly() - suly);
    }

    @Override
    public void hangotKiad() {
        System.out.println("Gag-gag!");
    }

    @Override
    public Gerincesek szaporodik() {
        hangotKiad();
        double ujszulottMadarSulya = ((Math.random()*8)+3)/1000;
        String ujszulottSzine = "feher";
        int labakSzama = 2;
        return new Lud(ujszulottMadarSulya, ujszulottSzine);
    }

    public String toString() {
        return String.format("Lud{suly=%.2fkg szin=%s}", this.getSuly(), this.getSzin());
    }
}
