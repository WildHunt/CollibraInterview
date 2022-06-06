package Patterns.Behavioral.Observer;


/**
 * Subscribers want to watch this class
 */
public class Editor {
    public EventManager events;

    public Editor(){
        this.events = new EventManager("pitstop", "event2");
    }

    public void makePitstop(){
        System.out.println("Making pitstop");
        events.notify("pitstop");
    }

}
