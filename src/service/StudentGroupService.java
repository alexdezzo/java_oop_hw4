package service;

import model.Student;
import model.StudentGroup;

import java.util.Collections;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }


    public void addStudentInGroup(Student student){
        studentGroup.studentsList.add(student);
    }


    public List<Student> sort() {
        Collections.sort(studentGroup.studentsList);
        return studentGroup.studentsList;
    }
}
