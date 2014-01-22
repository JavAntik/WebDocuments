package com.javantik.webdocs;

public class WebDocument {
    private String name;
    private int id;
    private Section[] sections;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    public Section[] getSections() {
        return sections;
    }
}
