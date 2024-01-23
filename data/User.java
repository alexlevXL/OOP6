package data;

public class User {
    private String firstName;
    private String secondName;
    private String lasttName;
    public User(String firstName, String secondName, String lasttName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lasttName = lasttName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getLasttName() {
        return lasttName;
    }
    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }
    @Override
    public String toString() {
        return "Teacher [firstName=" + firstName + ", secondName=" + secondName + ", lasttName=" + lasttName + "]";
    }
}

