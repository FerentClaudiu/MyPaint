package tema;

import java.util.ArrayList;

public class Cursuri extends Persoana {
    private ArrayList<String> cursuri;

    public Cursuri(){
        cursuri = new ArrayList<>();
        cursuri.add("matematica");
        cursuri.add("informatica");
        cursuri.add("geografie");
        cursuri.add("engleza");
    }

    public  ArrayList<String>getCursuri(){
        return cursuri;
    }

  /*  public void listareCursuri(){
        System.out.println("lista de cursuri: ");
        for(int i=0;i<cursuri.length;i++){
            if (cursuri[i]!=null){
                System.out.println(cursuri[i].toString());
            }
        }
    }*/
    Student student = new Student();
    Optionale optionale = new Optionale();
    Profesor profesor = new Profesor();
}
