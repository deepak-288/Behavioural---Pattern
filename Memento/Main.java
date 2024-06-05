// Main.java
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());

        System.out.println("Current State: " + originator.getState());

        try {
            originator.getStateFromMemento(caretaker.undo());
            System.out.println("After undo: " + originator.getState());

            originator.getStateFromMemento(caretaker.undo());
            System.out.println("After undo: " + originator.getState());

            originator.getStateFromMemento(caretaker.redo());
            System.out.println("After redo: " + originator.getState());

            originator.getStateFromMemento(caretaker.redo());
            System.out.println("After redo: " + originator.getState());

            originator.getStateFromMemento(caretaker.redo());
        } catch (MementoException e) {
            System.err.println(e.getMessage());
        }
    }
}
