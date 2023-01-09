package reusing.classes.propercleanup;

class Triangle extends Shape {
    Triangle(int i){
        super(i);
        System.out.println("draw triangle");
    }
    void dispose(){
        System.out.println("erase triangle");
        super.dispose();
    }
}
