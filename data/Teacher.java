package data;

public class Teacher extends User implements Comparable<Teacher> {
    int teacherId;
    public Teacher(int teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;}
        @Override
        public String toString() {
            return "Teacher{" +
                    "teacherId=" + teacherId +
                    ", firstName='" + super.getFirstName() + '\'' +
                    ", secondName='" + super.getSecondName() + '\'' +
                    ", lastName='" + super.getLasttName() + '\'' +
                    '}';
        }
        public int compareTo(Teacher o) {
            if(teacherId > o.teacherId) return 1;
            if(teacherId < o.teacherId) return -1;
            return 0;
        }
}