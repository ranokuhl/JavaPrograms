package com.ranokuhl.service;

import com.ranokuhl.model.Speaker;
import com.ranokuhl.repository.HibernateSpeakerRepositoryImpl;
import com.ranokuhl.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    @Override
    public List<Speaker> findAll() {

        return repository.findAll();

    }
}
