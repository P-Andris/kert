package modell;

import java.io.Serializable;

public class Noveny implements Serializable {
    private String azonosito;
    private final String nev;
    private int ar;
    private int kor;
    
    public Noveny(String azonosito, String nev, int kor, int ar) {
        this.azonosito = azonosito;
        this.nev = nev;
        this.kor = kor;
        this.ar = ar;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public String getNev() {
        return nev;
    }

    public int getAr() {
        return ar;
    }

    public int getKor() {
        return kor;
    }

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    @Override
    public String toString() {
        return "Noveny{" + "azonosito=" + azonosito + ", nev=" + nev + ", ar=" + ar + ", kor=" + kor + '}';
    }
}
