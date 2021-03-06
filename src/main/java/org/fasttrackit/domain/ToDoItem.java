package org.fasttrackit.domain;

import java.time.LocalDateTime;

public class ToDoItem {
    private long id;
    private String descprition;
    private boolean done;
    private LocalDateTime deadline;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescprition() {
        return descprition;
    }

    public void setDescprition(String descprition) {
        this.descprition = descprition;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", descprition='" + descprition + '\'' +
                ", done=" + done +
                ", deadline=" + deadline +
                '}';
    }
}
