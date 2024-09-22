package FishComposition;

public class Tail {
    private String size;

    //constructor
    public Tail(String size){
        this.size = size;
    }

    //setter

    public void setSize(String size){this.size = size;}

    //getter

    public String getSize(){return size;}

    //toString

    public String toString(){
        return ("Their tail was " + size + " allowing is to swim swiftly in the water.");
    }
}
