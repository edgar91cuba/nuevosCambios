package com.example.demo.entity;

public class Saludo {
    private long id;
    private String content;

    public Saludo() {
    }

    public Saludo(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Saludo{" + "id=" + id + ", content=" + content + '}';
    }
    
    
}
