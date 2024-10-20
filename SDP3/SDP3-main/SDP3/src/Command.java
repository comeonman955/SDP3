// Command Interface
interface Command {
    void execute();
}

// Concrete Command
class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.performAction();
    }
}

// Receiver Class
class Receiver {
    public void performAction() {
        System.out.println("Receiver is performing the action.");
    }
}

// Invoker Class
class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}



