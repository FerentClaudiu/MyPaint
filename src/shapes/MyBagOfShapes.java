package shapes;

public class MyBagOfShapes {
    //plasa de shapes
    private MyShape[] shapes = new MyShape[4];
    private int index;

    public void addShape(MyShape s){
        shapes[index]=s;
        index++;
    }

    public MyShape[] getShapes() {
        return shapes;
    }
}
