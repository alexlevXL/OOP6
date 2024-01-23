package data;

public class Teacher extends User implements Comparable<Teacher> {
    int teacherId;

    private double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public Teacher(int teacherId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;}
        public int getTeacherId() {
            return teacherId;
        }
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