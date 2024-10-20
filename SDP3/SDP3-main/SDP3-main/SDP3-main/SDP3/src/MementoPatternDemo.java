// Testing Memento Pattern
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State1");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State3");

        originator.getStateFromMemento(caretaker.get(0));
        originator.getStateFromMemento(caretaker.get(1));
    }
}
