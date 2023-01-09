package reusing.classes.delegation;

public class Spaceship extends SpaceShipControls {
    private String name;
    public Spaceship(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        Spaceship protector =new Spaceship("protector");
        protector.forward(100);
    }
}
