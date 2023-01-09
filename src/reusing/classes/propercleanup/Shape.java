package reusing.classes.propercleanup;

 class Shape {
     Shape(int i){
         System.out.println("shape Constructor");
     }
     void dispose(){
         System.out.println("shape dispose");
     }
}
