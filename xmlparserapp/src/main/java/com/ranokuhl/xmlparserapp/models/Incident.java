package com.ranokuhl.xmlparserapp.models;

import java.util.Arrays;

public class Incident
{

    private String id;
    private Entry[] entry;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Entry[] getEntry() {
        return entry;
    }

    public void setEntry(Entry[] entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "Incident{" +
                "id='" + id + '\'' +
                ", entry=" + Arrays.toString(entry) +
                '}';
    }
}

