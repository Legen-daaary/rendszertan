package hu.nyirszikszi.rendszertan;

public abstract class Emlos  extends  Gerincesek {
    private Szorzet szorzet;

    public Emlos(String NEV, double suly, String szin, int labakSzama, Szorzet szorzet) {
        super(NEV, suly, szin, labakSzama);
        this.szorzet = szorzet;
    }

    public Emlos(String NEV, double suly, String szin, Szorzet szorzet) {
        super(NEV, suly, szin, 4);
        this.szorzet = szorzet;
    }

    public Szorzet getSzorzet() {
        return szorzet;
    }

    public void setSzorzet(Szorzet szorzet) {
        this.szorzet = szorzet;
    }
}
