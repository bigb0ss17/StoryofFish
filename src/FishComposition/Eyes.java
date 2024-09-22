package FishComposition;

public class Eyes {
    private String color;

    //constructor
    public Eyes(String color){
        this.color = color;
    }

    //setter

    public void setColor(String color){this.color = color;}

    //getter

    public String getColor(){return color;}

    //toString

    public String toString(){
        return ("Dori's " +color+ " eyes, always trying to find something . . .  like . . . maybe NEMO??");
    }
}
