package org.example.Service;

import org.example.Dto.Event;
import org.example.Entity.EventEntity;

import java.util.List;

public interface EventService {

    void addEvent(Event event);
    List<EventEntity> getAllEvent();
    boolean deleteEvent( Long id);
}
