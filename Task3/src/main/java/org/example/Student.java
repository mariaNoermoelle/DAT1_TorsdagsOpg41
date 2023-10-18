package org.example;

import java.util.ArrayList;

public class Student extends Person
{
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;
    public Student(String name, ArrayList<String> pastCourses)
    {
        super(name);
        this.passedCourses=pastCourses;
    }
    @Override
    public boolean addCourse(String course) {
        if(currentCourses.contains(course) || passedCourses.contains(course))
        {
            currentCourses.add(course);
            return true;
        }
        else
        {
            return false;
        }
    }
}
