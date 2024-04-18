package domain;
public abstract class Konto{
    private static String inhaber;
    private static int kontonummer;
    private double betrag;
    private int dispo;

    public Konto(String inhaber, int kontonummer, double betrag){
        inhaber = inhaber;
        kontonummer = kontonummer;
        betrag = betrag;
    }

    public static String getInhaber() {
        return inhaber;
    }

    public static void setInhaber(String inhaber) {
        Konto.inhaber = inhaber;
    }

    public static int getKontonummer() {
        return kontonummer;
    }

    public static void setKontonummer(int kontonummer) {
        Konto.kontonummer = kontonummer;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public int getDispo() {
        return dispo;
    }

    public void setDispo(int dispo) {
        this.dispo = dispo;
    }
}