package minpakke;

/**
 * @author nilstes
 */

public class Kunde {
    private String id;
    private String navn;

    public Kunde() {
    }

    public Kunde(String id, String navn) {
        this.id = id;
        this.navn = navn;
    }
 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    
    
}
