package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Organizer;
import org.example.Entity.OrganizerEntity;
import org.example.Service.OrganizerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
@CrossOrigin
public class OrganizerController {

    final OrganizerService service;

    @PostMapping("/add-organizer")
    public void addOrganizer(@RequestBody Organizer organizer){

        service.addOrganizer(organizer);
    }

    @GetMapping("get-all-Organizers")
    public Iterable<OrganizerEntity> getAll(){

        return service.getAllOrganizer();
    }

    @DeleteMapping("/delete-organizer/{id}")
    public ResponseEntity<String> deleteOrganizer(@PathVariable Long id){

        return service.deleteOrganizer(id) ? ResponseEntity.ok("Deleted")
                : ResponseEntity.notFound().build();
    }
}
