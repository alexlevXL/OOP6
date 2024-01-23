package controller;

import data.Teacher;
import service.TeacherService;
import view.TeacherView;

public class TeacherController implements UserController<Teacher>{
    public final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }
    @Override
    public void sendOnConsole() {

        teacherView.sendOnConsole(teacherService.getTeachersList());
    }
    
}
