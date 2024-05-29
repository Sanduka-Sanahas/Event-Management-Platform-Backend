package org.example.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Dto.Event;
import org.example.Entity.EventEntity;
import org.example.Service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class EventController {

    final EventService service;

    @PostMapping("add-event")
    public void addEvent(@RequestBody Event event){

        log.info(event.toString());

            service.addEvent(event);

    }

    @GetMapping("get-all")
    public Iterable<EventEntity> getAll(){

       return service.getAllEvent();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEvent(@PathVariable Long id){

        return service.deleteEvent(id) ? ResponseEntity.ok("Deleted")
                : ResponseEntity.notFound().build();
    }
}
