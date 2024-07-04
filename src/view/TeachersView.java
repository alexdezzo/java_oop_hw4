package view;

import model.Teacher;

import java.util.Collections;
import java.util.List;

public class TeachersView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        Collections.sort(teachers);
        System.out.println(teachers);
    }
}
