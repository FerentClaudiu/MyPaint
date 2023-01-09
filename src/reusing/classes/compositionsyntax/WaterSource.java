package reusing.classes.compositionsyntax;

class WaterSource {
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s="Constructred";
    }
    public String toString(){
        return s;
    }
        public static void main(String[] args) {
            SprinklerSystem sprinklers = new SprinklerSystem();
            System.out.println(sprinklers);
        }
    } /* Output:
WaterSource()
valve1 = null valve2 = null valve3 = null valve4 = null
i = 0 f = 0.0 source = Constructed
*///:
