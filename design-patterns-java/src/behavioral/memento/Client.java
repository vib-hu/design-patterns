package behavioral.memento;

public class Client {

    public void textMemento(){
        Editor editor = new Editor();
        editor.write("Hi!");
        editor.write(" How are you.");
        editor.write(" I am good.");
        editor.print(); // Hi! How are you. I am good.

        editor.undo();
        editor.print(); //Hi! How are you.

        editor.undo();
        editor.print(); //Hi!

        editor.undo();
        editor.print(); //

        editor.write("Hello, ");
        editor.write("world!");

        editor.print(); // Output: Hello, world!
        editor.undo();
        editor.print(); // Output: Hello,
        editor.undo();
        editor.print(); // Output: (empty)
    }
}
