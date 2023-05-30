package nezet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modell.Noveny;
import modell.Kert;

public class KertKonzol {
    private Kert kert = new Kert();
    
    public static void main(String[] args) {
        KertKonzol konzol = new KertKonzol();
        
        konzol.novenyBeszerzes();
        konzol.kertKiir();
        konzol.kertStatisztika();
        konzol.kertiNovenyekTorlese();
        konzol.kertKiir();
        konzol.kertFrissites();
        konzol.kertKiir();
    }
    
    public void kertKiir() {
        System.out.println(kert);
    }
    
    public void novenyBeszerzes() {
        kert.novenyHozzaadas(new Noveny("no04", "Növény 4", 4, 1000));
        kert.novenyHozzaadas(new Noveny("no01", "Növény 1", 10, 480));
        kert.novenyHozzaadas(new Noveny("no03", "Növény 3", 5, 600));
    }
    
    public void kertiNovenyekTorlese() {
        kert.setNovenyek(null);
    }
    
    // Szerializálás
    public void kertStatisztika() {
        try {
            FileOutputStream fileoutputstream = new FileOutputStream(new File("kert.bin"));
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream);
            
            objectoutputstream.writeObject(kert.getNovenyek());
            
            objectoutputstream.close();
            fileoutputstream.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    // Deszerializálás
    public void kertFrissites() {
        try {
            FileInputStream fileinputstream = new FileInputStream(new File("kert.bin"));
            ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
            
            kert.setNovenyek((ArrayList<Noveny>) objectinputstream.readObject());
            
            objectinputstream.close();
            fileinputstream.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
