package FishComposition;

public class Bioluminescence {
    private boolean glow;

    //constructor

    public Bioluminescence (boolean glow){
        this.glow = glow;
    }

    //setter

    public void setGlow(boolean glow){this.glow = glow;}

    //getter

    public boolean getGlow(){return glow;}

    //toString

    public String toString(){
        return ("In addition to her beautiful scales Dori was also the brightest fish." + "\n" +
                "At night her light would shine drawing many other fish in.");
    }

}
