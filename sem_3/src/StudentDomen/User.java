package StudentDomen;

public abstract class User {
    private String firstname;
    private String secondname;
    private int age;

    public User(String firstname, String secondname, int age) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.age = age;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;

    }

    public String getSecondName() {
        return secondname;
    }

    public String setSecondName() {
        return secondname;
    }

    public void setSecondName(String secondname) {
        this.secondname = firstname;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}