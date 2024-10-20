// Testing State Pattern
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteState1());

        context.request(); // ConcreteState1 handles the context
        context.request(); // ConcreteState2 handles the context
    }
}