package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentClassTest<Student> {
    private StudentClass myStudent;


    @Test
    void StudentTest(){
        myStudent = new StudentClass("Garry Thomas", "G00386543");
        assertEquals("Garry Thomas", myStudent.getName());
        assertEquals("G00386543", myStudent.getEmail());
    }
}
