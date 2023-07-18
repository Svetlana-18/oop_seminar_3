package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
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

}