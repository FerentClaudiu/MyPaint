package reusing.classes.initialiazingthebaseclass;

public class Cartoon extends Drawing {
    Cartoon(){
        System.out.println("Cartoon construtor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
