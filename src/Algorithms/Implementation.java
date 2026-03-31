package Algorithms.Algorithms;

import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Vector;

import V2.Persona;

//USES THE Persona.java CLASS TO CREATE A VECTOR OF PERSONAS AND SORT THEM BY EDAD
public class Implementation {
    public static void main(String[] args) {

        try {
            Vector<Persona> vPer = new Vector<Persona>();
            vPer.add(new Persona(34));
            vPer.add(new Persona(22));
            vPer.add(new Persona(1));
            vPer.add(new Persona(45));

            System.out.println("Lowest age: " + Collections.min(vPer));
            System.out.println("Highest age: " + Collections.max(vPer));
        } catch (NoSuchElementException nse) {
            System.err.println("Error: Vector is empty. Please add elements to the vector.".toUpperCase());
        }
    }
}
