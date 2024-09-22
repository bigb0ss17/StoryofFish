package FishComposition;

public class Fins {
    private int numberOfFins;

    //constructor

    public Fins(int numberOfFins){
        this.numberOfFins = numberOfFins;
    }

    //setter

    public void setNumberOfFins(int numberOfFins){this.numberOfFins = numberOfFins;}

    //getter

    public int getNumberOfFins(){
        return numberOfFins;
    }

    //toString

    public String toString(){
        return ("With its " +numberOfFins + " fins, it moves through the sea water gracefully.");
    }
}
