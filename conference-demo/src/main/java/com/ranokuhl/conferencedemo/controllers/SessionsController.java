package com.ranokuhl.conferencedemo.controllers;

import com.ranokuhl.conferencedemo.models.Session;
import com.ranokuhl.conferencedemo.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> sessionList() {
        return sessionRepository.findAll();
    }
    @GetMapping
    @RequestMapping ("{id}")
    public Session get(@PathVariable Long id) {
        return sessionRepository.getOne(id);
    }

    @PostMapping
    public Session create(@RequestBody final Session session) {
        return sessionRepository.saveAndFlush(session);
    }

}
