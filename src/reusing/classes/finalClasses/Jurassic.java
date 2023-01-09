package reusing.classes.finalClasses;

public class Jurassic extends SmallBrain.Dinosaur {
    public static void main(String[] args) {
        SmallBrain.Dinosaur n = new SmallBrain.Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}
