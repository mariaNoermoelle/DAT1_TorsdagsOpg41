package org.example;

import java.util.ArrayList;

public class Teacher extends Person
{
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourse;

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course) && !currentCourse.contains(course))
        {
            currentCourse.add(course);
            return true;
        }
        else
        {
            return false;
        }
    }
}
