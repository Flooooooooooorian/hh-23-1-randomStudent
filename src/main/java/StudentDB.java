import java.util.Arrays;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] getAllStudents() {
        return students;
    }

    public Student randomStudent() {
        int random = (int)(Math.random() * students.length);
        return students[random];
    }

    public void addStudent(Student studentToAdd){
        Student[] newStudentArray = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudentArray[i] = students[i];
        }
        newStudentArray[newStudentArray.length - 1] = studentToAdd;
        students = newStudentArray;
    }

    public void removeStudent(Student studentToRemove){
        Student[] newStudentArray = new Student[students.length - 1];
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != studentToRemove){
                newStudentArray[index] = students[i];
                index++;
            }
        }
        students = newStudentArray;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
