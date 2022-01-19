package com.example.demo.service.nation;

import com.example.demo.model.Nation;
import com.example.demo.repository.INationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class NationService implements INationService{
    @Autowired
    private INationRepository iNationRepository;
    @Override
    public Iterable<Nation> findAll() {
        return iNationRepository.findAll();
    }

    @Override
    public Optional<Nation> findById(Long id) {
        return iNationRepository.findById(id);
    }

    @Override
    public Nation save(Nation nation) {
        return iNationRepository.save(nation);
    }

    @Override
    public void remove(long id) {
        iNationRepository.deleteById(id);

    }
}
