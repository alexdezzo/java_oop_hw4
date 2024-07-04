import controller.StudentController;
import controller.TeacherController;
import controller.UserController;
import model.Student;
import model.StudentGroup;
import model.TeachersGroup;
import model.User;
import service.StudentGroupService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        new StudentController().sendOnConsole(getStudents());

        new TeacherController().sendOnConsole(TeachersGroup.teachers);
        new TeacherController().createTeacher("Alexey", "Boborovich");
        new TeacherController().createTeacher("Olesya", "Vovo4kina");
        new TeacherController().sendOnConsole(TeachersGroup.teachers);
        new TeacherController().editTeacher(2,"Mariya", "Petrovna");
        new TeacherController().sendOnConsole(TeachersGroup.teachers);



    }
    private static List<Student> getStudents(){
        Student s1 = new Student(1,"Alex", "Ivanov");
        Student s2 = new Student(2,"Evgeniy", "Petrov");

        return List.of(s1,s2);
    }

}
