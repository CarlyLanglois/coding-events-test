package org.launchcode.codingevents.models;

import javax.validation.constraints.Size;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    @Size(max=256, message="Description is too long. Please limit to 256 characters")
    private String description;

    private String email;

    public Event(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
