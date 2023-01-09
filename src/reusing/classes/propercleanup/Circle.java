package reusing.classes.propercleanup;

class Circle extends Shape {
    Circle(int i){
        super(i);
        System.out.println("drawing circle");
    }
    void dispose(){
        System.out.println("erasing circle");
        super.dispose();
    }
}
