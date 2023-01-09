package reusing.classes.compositionandinseritance;

import reusing.classes.compositionandinseritance.Plate;

class DinnerPlate extends Plate {
    DinnerPlate(int i){
        super(i);
        System.out.println("dinner Constructor");
    }
}
