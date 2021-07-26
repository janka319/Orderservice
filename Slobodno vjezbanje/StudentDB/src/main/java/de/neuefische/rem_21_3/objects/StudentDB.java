package de.neuefische.rem_21_3.objects;

import java.util.Arrays;

public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] students) {

        this.students = students;
    }

    public Student[] list() {

        return students;
    }

    @Override
    public String toString() {
        String toString = "";
        for (Student s :students) {
            toString += s.toString() + ",";
        }
        return toString;
    }
}
