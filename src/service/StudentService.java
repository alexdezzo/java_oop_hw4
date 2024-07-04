package service;

import model.Student;
import model.StudentGroup;

public class StudentService {

    public Student createStudent(int id, String name, String lastName) {
        return new Student(id, name, lastName);
    }

}
