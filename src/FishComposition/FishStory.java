package FishComposition;

class Fish {
    private Head head;
    private Tail tail;
    private Fins fins;
    private Eyes eyes;
    private Gills gills;
    private Scales scales;
    private Bioluminescence bioluminescence;

    // Constructor - taking all five attributes
    public Fish(Head head, Tail tail, Fins fins, Eyes eyes, Gills gills, Scales scales, Bioluminescence bioluminescence) {
        this.head = head;
        this.tail = tail;
        this.fins = fins;
        this.eyes = eyes;
        this.gills = gills;
        this.scales = scales;
        this.bioluminescence = bioluminescence;
    }


    public void tellFishStory() {
        System.out.println("Once upon a time, there was a fish named Dori swimming in the deep deep blue sea.");
        System.out.println(head);
        System.out.println(eyes);
        System.out.println(gills);
        System.out.println("Dori can swim because she has fins and tail.");
        System.out.println(fins);
        System.out.println(tail);
        System.out.println("Dori is also a very very beautful fish");
        System.out.println(scales);
        System.out.println(bioluminescence);
        System.out.println("Dori loves swimming under the deep deep blue sea. Because she has gills can breath easily. " + eyes.getColor() + " eyes.");
        System.out.println("Have you ever watched Finding Nemo?");
    }
}

public class FishStory {
    public static void main(String[] args) {
        // Create instances of body parts
        Head fishHead = new Head("Triangle");
        Tail fishTail = new Tail("Gracefully Long");
        Fins fishFins = new Fins(4);
        Eyes fishEyes = new Eyes("Emerald Deep Color");
        Gills fishGills = new Gills(true);
        Scales fishScales = new Scales("Blue");
        Bioluminescence fishBioluminescence = new Bioluminescence(true);

        // Create a Fish object using composition and aggregation
        Fish myFish = new Fish(fishHead, fishTail, fishFins, fishEyes, fishGills,fishScales, fishBioluminescence);

        // Tell the fish's story
        myFish.tellFishStory();

    }

}
