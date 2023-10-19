package org.example;

import java.sql.Array;
import java.util.ArrayList;

public class Main
{
    public static void main(String [] args)
    {
        ArrayList<String> classesTeacher1= new ArrayList<>();
        classesTeacher1.add("Math");
        classesTeacher1.add("Java 1.0");
        classesTeacher1.add("Python");
        Person teacher1 = new Teacher("Signe", classesTeacher1);

        ArrayList<String> classesStudent1 = new ArrayList<>();
        classesStudent1.add("Math");
        classesStudent1.add("Java");
        classesStudent1.add("Danish");
        Person student1 = new Student("Maria", classesStudent1);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(teacher1);
        persons.add(student1);

        for(Person person : persons)
        {
            if(!person.addCourse("Java 1.0"))
            {
                System.out.println(person.getName());
                if(person instanceof Student)
                {
                    System.out.println(" has passed this course.");
                }
                else if(person instanceof Teacher)
                {
                    System.out.println(" can't teach this course");
                }
            }
        }
    }
}