package org.example.Service;

import org.example.Dto.Organizer;
import org.example.Entity.OrganizerEntity;

import java.util.List;

public interface OrganizerService {

    void addOrganizer(Organizer organizer);
    List <OrganizerEntity> getAllOrganizer();
    boolean deleteOrganizer(Long id);
}
