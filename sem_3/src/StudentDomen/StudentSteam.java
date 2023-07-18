package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> course;

    public StudentSteam(List<StudentGroup> course) {
        this.course = course;
    }

    public List<StudentGroup> getStudentSteam() {
        return course;
    }

    public void setStudentSteam(List<StudentGroup> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "course=" + course +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {

            private int counter;

            @Override
            public boolean hasNext() {

                if (counter < course.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public StudentGroup next() {
                return course.get(counter++);
            }

        };

    }

}