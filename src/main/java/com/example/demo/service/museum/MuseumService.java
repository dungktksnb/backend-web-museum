package com.example.demo.service.museum;

import com.example.demo.model.Museum;
import com.example.demo.repository.IMuseumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MuseumService implements IMuseumService {
    @Autowired
    private IMuseumRepository iMuseumRepository;

    @Override
    public Iterable<Museum> findAll() {
        return  iMuseumRepository.findAll();
    }
    @Override
    public Optional<Museum> findById(Long id) {
        return iMuseumRepository.findById(id);
    }

    @Override
    public Museum save(Museum museum) {
        return iMuseumRepository.save(museum);
    }

    @Override
    public void remove(long id) {
        iMuseumRepository.deleteById(id);
    }
}
