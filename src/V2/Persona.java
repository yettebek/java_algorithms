package V2;

public class Persona implements Comparable<Persona> {
    public int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public int compareTo(Persona o) {
        if (this.getEdad() == o.getEdad()) return edad;
        else if (this.getEdad() > o.getEdad()) return edad;
        else return -1;
    }

    public String toString() {
        return "edad: " + edad;
    }
}
