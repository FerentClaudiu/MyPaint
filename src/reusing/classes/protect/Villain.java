package reusing.classes.protect;

class Villain {
    private String name;
    protected  void set(String nm){
        name=nm;
    }
    public Villain(String name){
        this.name=name;
    }
    public String toString(){
        return "I’m a Villain and my name is " + name;
    }
}
