package Algorithms;

public class Persona implements Comparable<Persona> {
    // ATTRIBUTES
    public int edad;

    // CONSTRUCTOR METHOD
    public Persona(int edad) {
        this.edad = edad;
    }

    // METHODS GETTERS
    public int getEdad() {
        return this.edad;
    }

    // COMPARATOR METHOD
    @Override
    public int compareTo(Persona o) {
        if (this.getEdad() == o.getEdad()) return edad;
        else if (this.getEdad() > o.getEdad()) return edad;
        else return -1;
    }

    // TOSTRING METHOD
    public String toString() {
        return "" + edad;
    }
}
