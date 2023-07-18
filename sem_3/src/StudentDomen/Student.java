package StudentDomen;

public class Student extends User implements Comparable<Student> {

    private long studentId;

    public Student(String firstname, String secondname, int age, long studentId) {
        super(firstname, secondname, age);
        this.studentId = studentId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", firstname=" + super.getFirstName() + ", secondname="
                + super.getSecondName() + ", id=" + studentId + "]";
    }

    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            return 0;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }

    // @Override
    // public int compareTo(Student o) {

    // System.out.println(super.getName()+" - "+o.getName());
    // if(super.getAge()==o.getAge())
    // {
    // if(id==o.id)return 0 ;
    // if(id>o.id)return 1;
    // else return -1;
    // //return 0;
    // }

    // if(super.getAge()>o.getAge())
    // return 1;
    // else
    // return -1;
    // }

}