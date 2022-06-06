package Patterns.Behavioral.Observer;

public class LogListener implements EventListener{
    @Override
    public void update(String eventType) {
        System.out.println("Saved to log " + eventType + "---");
    }
}
