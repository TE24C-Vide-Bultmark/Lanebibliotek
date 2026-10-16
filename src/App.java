void main(){
    Kort videsKort = new Kort("Vide");
    Kort antonsKort = new Kort("Anton");
    videsKort.skrivInfo();
    antonsKort.skrivInfo();

    for (int i = 0; i < 4; i++) {
        IO.println(videsKort.lanaBok());
    }
    IO.println(videsKort.lamnaTillbakaBok());
    IO.println(videsKort.lanaBok());
    videsKort.skrivInfo();
    IO.println(antonsKort.lamnaTillbakaBok());
    videsKort.skrivInfo();

    try {
        antonsKort.setAgare("Elias");
    } catch (Exception e) {
        IO.println("Namn måste vara mer än bara blanksteg");
    }
    antonsKort.skrivInfo();
    try {
        antonsKort.setAgare("   ");
    } catch (Exception e) {
        IO.println("Namn måste vara mer än bara blanksteg");
    }
    antonsKort.skrivInfo();
    IO.println("antal skapade kort: " + Kort.getAntalSkapadeKort());

    while (true) {
        IO.readln();
    }
}
