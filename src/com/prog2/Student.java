package com.prog2;

public class Student extends Person{
    public String course;
    /**
     * Constructor
     *
     * @param age
     * @param name
     */
    public Student(int age, String name, String course) {
        super(age, name);
        this.course = course;
    }

    public void tellCourse(){
        System.out.println("I'm studying " + course);
    }
}
