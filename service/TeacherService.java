package service;

import java.util.ArrayList;
import java.util.List;

import data.Teacher;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teachersList = new ArrayList<>();

    public TeacherService() {
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for (Teacher teacher : teachersList) {
            if (maxId < teacher.getTeacherId()) {
                maxId = teacher.getTeacherId();
            }

        }
        teachersList.add(new Teacher(++maxId,firstName, secondName, lastName));

    }
    public List<Teacher> getTeachersList() {
        return teachersList;
    }

}

