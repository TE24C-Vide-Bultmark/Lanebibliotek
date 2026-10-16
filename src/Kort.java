public class Kort {
    // kortets ägare
    private String agare;

    // Ett unikt nummer som aldrig ändras
    private int kortNummer;

    // Antal böcker som kortets ägare har lånat
    private int antalLan;

    // Antal kort som har skapats totalt
    static private int antalSkapadeKort;

    // man kan inte låna fler en så här många böker
    public static final int MAX_LAN = 3;

    public Kort(String agare){
        this.agare = agare;
        this.kortNummer = antalSkapadeKort;
        this.antalLan=0;
        antalSkapadeKort++;
    }

    // getters
    public String getAgare(){
        return agare;
    }
    public int getKortNummer(){
        return kortNummer;
    }
    public int getAntalLan(){
        return antalLan;
    }
    public static int getAntalSkapadeKort(){
        return antalSkapadeKort;
    }
    
    // setters
    public void setAgare(String namn){
        if (namn.trim() == ""){
            throw new IllegalArgumentException("Namn måste vara mer än bara blanksteg");
        }
        else{
            this.agare = namn;
        }
    }

    // metoder

    public boolean lanaBok(){
        if (antalLan<MAX_LAN) {
            antalLan++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean lamnaTillbakaBok(){
        if (0<antalLan) {
            antalLan--;
            return true;
        }
        else{
            return false;
        }
    }

    public void skrivInfo(){
        IO.println("agare: " + agare + ", kortnummer: " + kortNummer + ", antal lån: " + antalLan);
    }


}
