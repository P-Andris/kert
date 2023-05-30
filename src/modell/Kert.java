package modell;

import java.io.Serializable;
import java.util.ArrayList;

public class Kert implements Serializable {
    private ArrayList<Noveny> novenyek;
    
    public Kert() {
        this.novenyek = new ArrayList<>();
        
        this.novenyek.add(new Noveny("no01", "Növény 1", 2, 300));
        this.novenyek.add(new Noveny("no02", "Növény 2", 1, 500));
        this.novenyek.add(new Noveny("no03", "Növény 3", 1, 340));
    }

    public ArrayList<Noveny> getNovenyek() {
        return novenyek;
    }

    public void setNovenyek(ArrayList<Noveny> novenyek) {
        this.novenyek = novenyek;
    }
    
    public void novenyHozzaadas(Noveny noveny) {
        this.novenyek.add(noveny);
    }
    
    public void novenyEladas(Noveny noveny) {
        this.novenyek.remove(noveny);
    }

    @Override
    public String toString() {
        return "Kert{" + "novenyek=" + novenyek + '}';
    }
}
