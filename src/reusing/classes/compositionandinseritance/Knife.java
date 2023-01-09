package reusing.classes.compositionandinseritance;

class Knife extends Utensil {
    Knife(int i){
        super(i);
        System.out.println("knife constructor");
    }
}
