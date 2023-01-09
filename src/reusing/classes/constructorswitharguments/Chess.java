package reusing.classes.constructorswitharguments;

public class Chess extends BoardGame {
    Chess(){
        super(11);
        System.out.println("chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
