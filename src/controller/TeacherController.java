package controller;

import model.Teacher;
import model.TeachersGroup;
import view.TeachersView;
import view.UserView;

import java.util.List;

public class TeacherController {
    public UserView<Teacher> view = new TeachersView();

    public Teacher createTeacher(String name, String lastName) {
        int id = TeachersGroup.teachers.size() + 1;
        Teacher teacher = new Teacher(id, name, lastName);
        TeachersGroup.teachers.add(teacher);
        return teacher;
    }


    public void editTeacher(int id, String name, String lastName) {
        Teacher teacher = TeachersGroup.teachers.remove(id - 1);
        teacher.setName(name);
        teacher.setLastName(lastName);
        TeachersGroup.teachers.add(id - 1, teacher);
    }

    public void sendOnConsole(List<Teacher> teachers) {
        view.sendOnConsole(teachers);
    }

}
