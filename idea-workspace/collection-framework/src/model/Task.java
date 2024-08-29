package model;

import java.util.StringJoiner;

public class Task{
    private String title;
    private int priority;
    private Status status;

    public Task(String title, int priority, Status status) {
        this.title = title;
        this.priority = priority;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Task.class.getSimpleName() + "[", "]")
                .add("title='" + title + "'")
                .add("priority=" + priority)
                .add("status=" + status)
                .toString();
    }
}
