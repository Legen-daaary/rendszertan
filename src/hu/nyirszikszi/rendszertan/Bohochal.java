package hu.nyirszikszi.rendszertan;

public class Bohochal extends Halak{

    public Bohochal(double suly, String szin) {
        super("Bohóchal", suly, szin);
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
        System.out.println("blup-blup");
    }

    @Override
    public Gerincesek szaporodik() {
        double ujszulottHalSulya = ((Math.random()*8)+3)/1000;
        String ujszulottSzine = "narancs, feher";
        return new Bohochal(ujszulottHalSulya, ujszulottSzine);
    }

    @Override
    public String toString() {
        return String.format("Bohochal{suly=%.2fkg szin=%s}", this.getSuly(), this.getSzin());
    }
}
