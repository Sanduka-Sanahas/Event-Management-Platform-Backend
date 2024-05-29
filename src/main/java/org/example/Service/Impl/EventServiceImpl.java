package org.example.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Event;
import org.example.Entity.EventEntity;
import org.example.Repository.EventRepository;
import org.example.Service.EventService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    final EventRepository repository;
    final ModelMapper mapper;

    @Override
    public void addEvent(Event event) {

        EventEntity entity = mapper.map(event, EventEntity.class);
        repository.save(entity);
    }

    @Override
    public List<EventEntity> getAllEvent() {
        return repository.findAll();
    }

    @Override
    public boolean deleteEvent(Long id) {

        if (repository.existsById(id)){

            repository.deleteById(id);
            return true;

        }else {

            return false;
        }
    }
}
