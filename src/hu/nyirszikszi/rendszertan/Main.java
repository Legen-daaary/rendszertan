package hu.nyirszikszi.rendszertan;

public class Main {
    public static void main(String[] args) {
        BarnaMedve barnaMedve = new BarnaMedve(300, "sötétbarna", Szorzet.TELJES);
        barnaMedve.hangotKiad();
        System.out.println(barnaMedve.szaporodik());
    }
}
