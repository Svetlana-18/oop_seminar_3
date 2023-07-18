package StudentDomen;

import java.util.Iterator;
import java.util.List;


public class StudentGroup implements Iterable<Student>, Comparable <StudentGroup> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudentGroup() {
        return students;
    }

    public void setStudentGroup(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + students +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {

            private int counter;

            @Override
            public boolean hasNext() {

                if (counter < students.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Student next() {
                return students.get(counter++);
            }

        };

    }

    @Override
    public int compareTo(StudentGroup o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    // @Override
    // public int compareTo(StudentGroup o) {
    //     if (super.getStudentcourse() == o.getStudentcourse()) {
    //         return 0;
    //     }
    //     if (super.getStudentcourse() < o.getStudentcourse()) {
    //         return -1;
    //     }
    //     return 1;
    // }

}