package reusing.classes.name.hiding;

 class Homer {
     char doh(char c) {
         System.out.println("doh(char)");
         return 'd';
     }
     float doh(float f) {
         System.out.println("doh(float)");
         return 1.0f;
     }
}
