package hu.petrik.AukcioProjekt;

import java.time.LocalDateTime;

public class Festmeny
{
    private String cim;
    private  String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDateTime legutolsoLicitIdeje;
    private boolean elkelt;


    public Festmeny(String cim, String festo, String stilus) {
    this.cim = cim;
    this.festo = festo;
    this.stilus = stilus;

    //TODO: többi adattag beállítása
    }

    public String getCim() {
        return cim;
    }

    public String getFesto() {
        return festo;
    }

    public String getStilus() {
        return stilus;
    }

    public int getLicitekSzama() {
        return licitekSzama;
    }

    public int getLegmagasabbLicit() {
        return legmagasabbLicit;
    }

    public LocalDateTime getLegutolsoLicitIdeje() {
        return legutolsoLicitIdeje;
    }

    public boolean isElkelt() {
        return elkelt;
    }

    public void setElkelt(boolean elkelt) {
        this.elkelt = elkelt;
    }

    public void licit()
    {
        //TODO: eljárás megvalósítása
    }

    public  void licit( int mertek)
    {
        //TODO: eljárás megvalósítása
    }
}
