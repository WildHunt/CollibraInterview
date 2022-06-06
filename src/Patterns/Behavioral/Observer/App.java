package Patterns.Behavioral.Observer;

public class App {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscrive("pitstop", new LogListener());
        editor.makePitstop();
    }
}
