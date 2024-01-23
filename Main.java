import controller.TeacherController;
import view.TeacherView;

public class Main {
    public static void main(String[] args) {
     
        TeacherController teacherControler = new TeacherController();
        teacherControler.create("23", "45", "54");
      
        teacherControler.sendOnConsole();
    }
        
}
