package com.ranokuhl.repository;

import com.ranokuhl.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Rano");
        speaker.setLastName("Kuhl");

        speakers.add(speaker);

        return speakers;
    }
}
