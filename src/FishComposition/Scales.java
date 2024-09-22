package FishComposition;

public class Scales {
    private String color;

    //constructor

    public Scales(String color){this.color = color;};

    //setter

    public void setColor(String color){this.color = color;}

    //getter

    public String getColor(){return color;}

    //toString

    public String toString(){
        return ("Dori had " +color+ " scales. Her scales made her the most beautiful fish in the ocean.");
    }
}
