package Patterns.Behavioral.Observer;

import java.util.*;

public class EventManager {
    public Map<String, List> listeners = new HashMap<>();

    // varargs
    public EventManager(String... operations){
        for (String operation : operations)
            this.listeners.put(operation, new ArrayList<>());

    }

    public void subscrive(String eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);

    }

    public void notify(String eventType) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType);
        }
    }
}
