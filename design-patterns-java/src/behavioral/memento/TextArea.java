package behavioral.memento;

public class TextArea {
    private StringBuilder text;

    public TextArea(){
        text = new StringBuilder();
    }

    public void restore(Memento memento){
        this.text = new StringBuilder(memento.getText());
    }

    public Memento takeSnapShot(){
        return new Memento(this.text.toString());
    }

    public void write(String text){
        this.text.append(text);
    }

    public String getText(){
        return text.toString();
    }

    public static class Memento{
        private final String text;

        private Memento(String text){
            this.text = text;
        }

        private String getText(){
            return text;
        }
    }
}
