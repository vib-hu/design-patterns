package behavioral.memento;

import java.util.ArrayDeque;

public class Editor {
    private ArrayDeque<TextArea.Memento> stateHistory;
    private TextArea textArea;
    public Editor(){
        this.stateHistory = new ArrayDeque<>();
        textArea = new TextArea();
        //stateHistory.push(textArea.takeSnapShot());
    }

    public void write(String text){
        stateHistory.push(textArea.takeSnapShot());
        textArea.write(text);
    }

    public void print(){
        System.out.println(textArea.getText());
    }

    public void undo(){
       if(!stateHistory.isEmpty()) {
           TextArea.Memento memento = stateHistory.pop();
           textArea.restore(memento);
       }
    }
}
