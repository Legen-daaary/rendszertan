package hu.nyirszikszi.rendszertan;


public class BarnaMedve  extends Emlos {
    public BarnaMedve(double suly, String szin, Szorzet szorzet) {
        super("Ursus arctos", suly, szin, 4, szorzet);
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
        System.out.println("Brumm-brumm");
    }

    @Override
    public Gerincesek szaporodik() {
        double ujszulottBocsSulya = (Math.random()*(680-340+1)+340) / 1000;
        String ujszulottSzine = Math.round(Math.random()) == 1 ? "sötétbarna" : "halványbarna";
        return new BarnaMedve(ujszulottBocsSulya, ujszulottSzine, Szorzet.NINCS);
    }

    @Override
    public String toString() {
        return String.format("BarnaMedve{suly=%f szin=%s szorzet=%s}", this.getSuly(), this.getSzin(), this.getSzorzet());
    }
}
