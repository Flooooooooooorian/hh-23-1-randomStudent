import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudents_shouldReturnArrayWithStudents() {
        //GIVEN
        Student max = new Student("123", "Max");
        Student[] testStudents = new Student[1];
        testStudents[0] = max;

        StudentDB studentDb = new StudentDB(testStudents);

        //WHEN
        Student[] actual = studentDb.getAllStudents();

        //THEN
        Student[] expected = {new Student("123", "Max")};
        assertArrayEquals(actual, expected);
    }

    @Test
    void addStudent() {
        //GIVEN
        Student max = new Student("123", "Max");
        Student[] testStudents = new Student[0];
        StudentDB studentDb = new StudentDB(testStudents);

        //WHEN
        studentDb.addStudent(max);

        //THEN
        Student[] expected = new Student[]{new Student("123", "Max")};
        assertArrayEquals(expected, studentDb.getAllStudents());
    }

    @Test
    void removeStudent() {
        //GIVEN
        Student max = new Student("123", "Max");
        Student[] testStudents = new Student[1];
        testStudents[0] = max;
        StudentDB studentDb = new StudentDB(testStudents);

        //WHEN
        studentDb.removeStudent(max);

        //THEN
        Student[] expected = new Student[0];
        assertArrayEquals(expected, studentDb.getAllStudents());
    }
}
