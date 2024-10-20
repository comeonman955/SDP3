// State Interface
interface State {
    void handle(Context context);
}

// Concrete State 1
class ConcreteState1 implements State {
    @Override
    public void handle(Context context) {
        System.out.println("ConcreteState1 is handling the context.");
        context.setState(new ConcreteState2()); // Switch to another state
    }
}

// Concrete State 2
class ConcreteState2 implements State {
    @Override
    public void handle(Context context) {
        System.out.println("ConcreteState2 is handling the context.");
        context.setState(new ConcreteState1()); // Switch back to the first state
    }
}

// Context Class
class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}


