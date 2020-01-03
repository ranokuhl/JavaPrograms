package com.ranokuhl.repository;

import com.ranokuhl.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
