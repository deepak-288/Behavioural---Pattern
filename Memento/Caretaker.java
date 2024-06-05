// Caretaker.java
import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> mementoList = new ArrayList<>();
    private int currentIndex = -1;

    public void add(Memento state) {
        // Clear redo history if a new state is added
        while (mementoList.size() > currentIndex + 1) {
            mementoList.remove(mementoList.size() - 1);
        }
        mementoList.add(state);
        currentIndex++;
    }

    public Memento undo() throws MementoException {
        if (currentIndex <= 0) {
            throw new MementoException("No states to undo.");
        }
        currentIndex--;
        return mementoList.get(currentIndex);
    }

    public Memento redo() throws MementoException {
        if (currentIndex >= mementoList.size() - 1) {
            throw new MementoException("No states to redo.");
        }
        currentIndex++;
        return mementoList.get(currentIndex);
    }
}
