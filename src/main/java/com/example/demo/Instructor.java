package com.example.demo;

public class Instructor extends Person implements Teacher{
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {

    }
}
