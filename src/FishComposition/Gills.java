package FishComposition;

public class Gills {
    private boolean canBreatheUnderwater;

    //constructor
    public Gills (boolean canBreatheUnderwater){
        this.canBreatheUnderwater = canBreatheUnderwater;
    }

    //setter

    public void setCanBreatheUnderwater (boolean canBreatheUnderwater){
        this.canBreatheUnderwater = canBreatheUnderwater;
    }

    //getter

    public boolean getCanBreatheUnderwater (){
        return canBreatheUnderwater;
    }

    //toString

    public String toString(){
        return ("It could breathe underwater with its gills, which allowed it to swim everywhere.");
    }


}
