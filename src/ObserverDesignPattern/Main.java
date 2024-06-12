package ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserver cO1 = new ConcreteObserver("1DW");
        ConcreteObserver cO2 = new ConcreteObserver("2LG");

        subject.addObserver(cO1);
        subject.addObserver(cO2);

        subject.notifyObservers("Hello observers!, greetings from the Subject.");
        
    }
}
