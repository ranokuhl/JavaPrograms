package com.ranokuhl.conferencedemo.repositories;

import com.ranokuhl.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
