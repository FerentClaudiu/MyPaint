package reusing.classes.upcasting;

class Instrument {
    public void play(){
    }
    static void tune(Instrument i){
        i.play();
    }
}
