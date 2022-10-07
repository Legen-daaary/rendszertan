package hu.nyirszikszi.rendszertan;

public class Main {
    public static void main(String[] args) {
        BarnaMedve barnaMedve = new BarnaMedve(300, "sötétbarna", Szorzet.TELJES);
        barnaMedve.hangotKiad();
        System.out.println(barnaMedve.szaporodik());

        System.out.println("---".repeat(10));
        Bohochal nemo = new Bohochal(7.5, "narancs, fehér");
        nemo.hangotKiad();
        System.out.println(nemo);

        Lud lud = new Lud(10,"sarga");

        lud.hangotKiad();
        System.out.println(lud);
        System.out.println(lud.getNEV());
        System.out.println(lud.getLabakSzama());
        System.out.println(lud.szaporodik());

    }
}
