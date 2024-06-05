+-----------------------+
|       Memento         |
+-----------------------+
| -state: String        |
+-----------------------+
| +getState(): String   |
+-----------------------+

+-----------------------+
|     Originator        |
+-----------------------+
| -state: String        |
+-----------------------+
| +setState(String): void|
| +getState(): String   |
| +saveStateToMemento(): Memento |
| +getStateFromMemento(Memento): void |
+-----------------------+

+-----------------------+
|      Caretaker        |
+-----------------------+
| -mementoList: List<Memento> |
| -currentIndex: int    |
+-----------------------+
| +add(Memento): void   |
| +undo(): Memento throws MementoException |
| +redo(): Memento throws MementoException |
+-----------------------+

+-----------------------+
|   MementoException    |
+-----------------------+
| +MementoException(String): void |
+-----------------------+

+-----------------------+
|         Main          |
+-----------------------+
| +main(String[]): void |
+-----------------------+
