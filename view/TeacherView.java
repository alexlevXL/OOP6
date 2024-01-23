package view;

import java.util.List;

import data.Teacher;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        // TODO Auto-generated method stub
        for(Teacher teacher : list)
         System.out.println(teacher);
    }
    
}
