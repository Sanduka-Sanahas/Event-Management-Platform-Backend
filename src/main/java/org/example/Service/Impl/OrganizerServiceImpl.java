package org.example.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Organizer;
import org.example.Entity.OrganizerEntity;
import org.example.Repository.OrganizerRepository;
import org.example.Service.OrganizerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizerServiceImpl implements OrganizerService {

    final OrganizerRepository repository;
    final ModelMapper mapper;

    @Override
    public void addOrganizer(Organizer organizer) {

        repository.save(mapper.map(organizer, OrganizerEntity.class));
    }

    @Override
    public List<OrganizerEntity> getAllOrganizer() {
        return repository.findAll();
    }

    @Override
    public boolean deleteOrganizer(Long id) {
        if(repository.existsById(id)){

            repository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
