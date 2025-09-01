package com.roadmap.model;

public class GraduateStudent extends Student{

    private String thesisTitle;

    // Constructor
    public GraduateStudent(int id, String name, int age, String thesisTitle) {
        super(id, name, age);
        this.thesisTitle = thesisTitle;
    }

    // Getter and Setter
    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String toString() {
        return super.toString() + ", GraduateStudent{" +
                "thesisTitle='" + thesisTitle + '\'' +
                '}';
    }

}
