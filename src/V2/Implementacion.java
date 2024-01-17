package V2;
import java.util.*;
//USES THE Persona.java CLASS
public class Implementacion {
    public static void main(String[] args) {
        Vector<Persona> vPer = new Vector<Persona>();
        vPer.add(new Persona(34));
        vPer.add(new Persona(22));
        vPer.add(new Persona(1));
        vPer.add(new Persona(45));

        System.out.println("Lowest: " + Collections.min(vPer));
        System.out.println("Highest: " + Collections.max(vPer));
    }
}
