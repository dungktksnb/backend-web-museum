package com.example.demo.service.language;

import com.example.demo.model.Language;

import com.example.demo.repository.ILanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;
import java.util.Optional;
@Service

public class LanguageService implements ILanguageService {
    @Autowired
    private ILanguageRepository iLanguageRepository;

    @Override
    public Iterable<Language> findAll() {
        return iLanguageRepository.findAll();
    }

    @Override
    public Optional<Language> findById(Long id) {
        return iLanguageRepository.findById(id);
    }

    @Override
    public Language save(Language language) {
        return iLanguageRepository.save(language);
    }

    @Override
    public void remove(long id) {
        iLanguageRepository.deleteById(id);
    }
}
