package com.chapters.innerclass.greenhouse;

import java.util.LinkedList;
import java.util.List;

public class Controller {
    // A class from java.util to hold Event objects:
    private List<Event> eventList = new LinkedList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) {
            var iterator = new LinkedList<>(eventList).iterator();
            while (iterator.hasNext()) {
                var item = iterator.next();
                if (item.ready()) {
                    System.out.println(item);
                    item.action();
                    eventList.remove(item);
                }
            }
        }
    }
}
