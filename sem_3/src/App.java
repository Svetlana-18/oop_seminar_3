// 1) Создать класс StudentSteam(поток студентов с полем номер потока) содержащий в себе список 
// учебных групп(StudentGroup).*/
// 2) Для класса StudentSteam реализовать интерфейс Iterable и вывести через for несколько 
// групп со списком студентов на кoнсоль
// 3) Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству 
// студентов в группе) и отсортировать группы студентов в потоке, а затем вывести в консоль
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", "Иванов", 25, 121);
        Student s2 = new Student("Игорь", "Петров", 23, 104);
        Student s3 = new Student("Иван", "Сидоров", 22, 21);
        Student s4 = new Student("Игорь", "Квашин", 23, 444);
        Student s5 = new Student("Даша", "Цветкова", 23, 33);
        Student s6 = new Student("Лена", "Леонова", 23, 1);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);

        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group = new StudentGroup(listStud);
        Collections.sort(group.getStudentGroup());

        for (Student stud : group) {
            System.out.println(stud);
        }

        
    }
}
