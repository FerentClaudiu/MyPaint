package tema;

import java.util.ArrayList;

public class Persoana {
    public static void main(String[] args) {
        Persoana persoana = new Persoana();
        Cursuri cursuri= new Cursuri();
        ArrayList<String> cr= cursuri.getCursuri();
        System.out.println(cr);
        Student student = new Student();
        student.getCarte().setDenumire("thinking in java");
        System.out.println(student.getCarte().getDenumire());



    }}