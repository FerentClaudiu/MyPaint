package reusing.classes.compositionsyntax;

class Soap {
    private String s;
    Soap(){
        System.out.println("Soap()");
        s="Constructed";
    }
    public String toString(){
        return s;
    }
}
