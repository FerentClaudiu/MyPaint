package reusing.classes.upcasting;

public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute= new Wind();
        Instrument.tune(flute);
    }
}
