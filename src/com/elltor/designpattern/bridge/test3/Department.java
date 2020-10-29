package com.elltor.designpattern.bridge.test3;

public abstract class Department implements Course {
    Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
