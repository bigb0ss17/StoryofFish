package FishComposition;

public class Head {
    private String shape;

    //constructor

    public Head(String shape){
        this.shape = shape;

    }
    //setter

    public void setShape(String shape){this.shape = shape;}

    //getter

    public String getShape(){return shape;}

    //toString

    public String toString(){
        return("This fish had a unique head shaped like an " + shape);
    }
}
