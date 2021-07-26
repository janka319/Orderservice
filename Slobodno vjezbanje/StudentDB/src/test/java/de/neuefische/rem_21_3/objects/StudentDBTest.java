package de.neuefische.rem_21_3.objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {


    @Test
    public void testSetupDBWithStudents() {


        // init db with empty array

        // GIVEN
        int expectedAmountOfStudentsInDB = 0;

        // WHEN
        Student[] students = { /* students... */ };
        StudentDB studentDB  = new StudentDB(students);

        // THEN
        int actualAmountOfStudents = studentDB.list().length;
        assertEquals(expectedAmountOfStudentsInDB, actualAmountOfStudents);
    }

    @Test
    public void testSetupDBWithoutAnyStudents() {
        Student studentKlaus = new Student("Klaus");
        Student studentMarie = new Student("Marie");

        // init db with non empty array

        // GIVEN
        int expectedAmountOfStudentsInDB = 2;

        // WHEN
        Student[] students = {studentKlaus, studentMarie};
        StudentDB studentDB  = new StudentDB(students);

        // THEN
        Student[] actualStudents = studentDB.list();

        int actualAmountOfStudents = actualStudents.length;
        assertEquals(expectedAmountOfStudentsInDB, actualAmountOfStudents);

        String actualStudentDBString = studentDB.toString();

        String expectedStudentString = "[id=-1, name=Klaus],[id=-1, name=Marie]";
        assertEquals(expectedStudentString, actualStudentDBString
        );
    }

}